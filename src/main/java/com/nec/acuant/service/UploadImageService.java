package com.nec.acuant.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadImageService {

	public void uploadImage(String instanceId, String authToken, MultipartFile frontImage, int side, int light);

	public void uploadReplacementImage(String instanceId, String authToken, MultipartFile frontImage, int i, int j);

}
