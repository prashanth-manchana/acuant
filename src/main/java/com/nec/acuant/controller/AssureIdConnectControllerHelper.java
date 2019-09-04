package com.nec.acuant.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class AssureIdConnectControllerHelper {

	@Value("${subscriptionID}")
	private String subscriptionId;

	public int publishDocument(String authToken, MultipartFile frontImage, MultipartFile backImage) {
		return 0;
	}

}
