package com.nec.acuant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("acuant")
public class AssureIdConnectController {

	@Autowired
	AssureIdConnectControllerHelper assureIdHelper;

	@PostMapping
	@RequestMapping("submitData")
	public void getDocumentInstance(@RequestHeader("Authorization") String authToken,
			@RequestBody MultipartFile frontImage, @RequestBody MultipartFile backImage,
			@RequestBody(required = false) String imageData) {
		System.out.println(imageData);
		int instanceId = assureIdHelper.publishDocument(authToken, frontImage, backImage);

	}

}
