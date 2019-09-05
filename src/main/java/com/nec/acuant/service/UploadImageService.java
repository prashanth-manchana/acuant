package com.nec.acuant.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface UploadImageService {

	public void uploadImage(String instanceId, String authToken, MultipartFile frontImage, int side, int light);

	public void uploadReplacementImage(String instanceId, String authToken, MultipartFile frontImage, int i, int j);

}
