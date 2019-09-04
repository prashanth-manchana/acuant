package com.nec.acuant.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface UploadImageService {
	public void uploadFrontImage(String authToken, MultipartFile frontImage);

	public void uploadBackImage(String authToken, MultipartFile frontImage);

}
