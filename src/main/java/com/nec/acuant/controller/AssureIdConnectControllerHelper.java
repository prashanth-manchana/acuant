package com.nec.acuant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

import com.nec.acuant.service.ClassificationService;
import com.nec.acuant.service.InstanceService;
import com.nec.acuant.service.MetricsService;
import com.nec.acuant.service.UploadImageService;
import com.nec.acuant.to.ClassificationResponse;
import com.nec.acuant.to.MetricsResponse;

@Controller
public class AssureIdConnectControllerHelper {

	@Value("${subscriptionID}")
	private String subscriptionId;

	@Autowired
	InstanceService instanceService;

	@Autowired
	UploadImageService imageService;

	@Autowired
	MetricsService metricsService;

	@Autowired
	ClassificationService classificationService;

	public String publishDocument(String authToken, MultipartFile frontImage, MultipartFile backImage) {
		String instanceId = instanceService.getInstanceId(authToken);
		imageService.uploadImage(instanceId, authToken, frontImage, 0, 0);
		MetricsResponse frontMetricsResponse = metricsService.getImageMetrics(instanceId, authToken, 0, 0);
		if (frontMetricsResponse.getGlareMetric() < 50 && frontMetricsResponse.getSharpnessMetric() < 50) {
			imageService.uploadReplacementImage(instanceId, authToken, frontImage, 0, 0);
		}
		ClassificationResponse clResponse = classificationService.getClassificationData(instanceId, authToken);
		if (clResponse.getTypeData().getSupportedImages().size() > 0) {
			imageService.uploadImage(instanceId, authToken, frontImage, 1, 0);
			MetricsResponse backMetricsResponse = metricsService.getImageMetrics(instanceId, authToken, 0, 0);
			if (backMetricsResponse.getGlareMetric() < 50 && backMetricsResponse.getSharpnessMetric() < 50) {
				imageService.uploadReplacementImage(instanceId, authToken, frontImage, 1, 0);
			}
		}

		return "Completed";
	}

}
