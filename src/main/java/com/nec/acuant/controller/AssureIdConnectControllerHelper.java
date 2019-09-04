package com.nec.acuant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

import com.nec.acuant.service.InstanceServiceImpl;
import com.nec.acuant.service.MetricsServiceImpl;
import com.nec.acuant.service.UploadImageServiceImpl;

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

	public String publishDocument(String authToken, MultipartFile frontImage, MultipartFile backImage) {
		String instanceId = instanceServiceImpl.getInstanceId(authToken);
		imageServiceImpl.uploadFrontImage(authToken, frontImage);
		return "";
	}

}
