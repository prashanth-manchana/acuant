package com.nec.acuant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

import com.nec.acuant.service.ClassificationServiceImpl;
import com.nec.acuant.service.InstanceServiceImpl;
import com.nec.acuant.service.MetricsServiceImpl;
import com.nec.acuant.service.UploadImageServiceImpl;
import com.nec.acuant.to.ClassificationResponse;
import com.nec.acuant.to.MetricsResponse;

@Controller
public class AssureIdConnectControllerHelper {

	@Value("${subscriptionID}")
	private String subscriptionId;

	@Autowired
	InstanceServiceImpl instanceServiceImpl;

	@Autowired
	UploadImageServiceImpl imageServiceImpl;

	@Autowired
	MetricsServiceImpl metricsServiceImpl;

	@Autowired
	ClassificationServiceImpl classificationServiceImpl;

	public String publishDocument(String authToken, MultipartFile frontImage, MultipartFile backImage) {
		String instanceId = instanceServiceImpl.getInstanceId(authToken);
		imageServiceImpl.uploadImage(instanceId, authToken, frontImage, 0, 0);
		MetricsResponse frontMetricsResponse = metricsServiceImpl.getImageMetrics(instanceId, authToken, 0, 0);
		if (frontMetricsResponse.getGlareMetric() < 50 && frontMetricsResponse.getSharpnessMetric() < 50) {
			imageServiceImpl.uploadReplacementImage(instanceId, authToken, frontImage, 0, 0);
		}
		ClassificationResponse clResponse = classificationServiceImpl.getClassificationData(instanceId, authToken);
		if (clResponse.getTypeData().getSupportedImages().size() > 0) {
			imageServiceImpl.uploadImage(instanceId, authToken, frontImage, 1, 0);
			MetricsResponse backMetricsResponse = metricsServiceImpl.getImageMetrics(instanceId, authToken, 0, 0);
			if (backMetricsResponse.getGlareMetric() < 50 && backMetricsResponse.getSharpnessMetric() < 50) {
				imageServiceImpl.uploadReplacementImage(instanceId, authToken, frontImage, 1, 0);
			}
		}

		return "Completed";
	}

}
