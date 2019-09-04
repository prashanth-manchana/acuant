package com.nec.acuant.service;

import java.io.InputStream;
import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.nec.acuant.constants.URLConstants;

public class UploadImageServiceImpl implements UploadImageService {

	@Override
	public void uploadFrontImage(String authToken, MultipartFile frontImage) {
		if (frontImage != null & frontImage.getSize() > 0) {
			byte[] imageByte = getByteData(frontImage);

			MultiValueMap<String, Object> bodyMap = new LinkedMultiValueMap<>();
			bodyMap.add("frontImage", imageByte);

			HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(bodyMap,
					populateHeaderData(authToken));

			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> response = restTemplate.exchange(
					URLConstants.BASE_URL + URLConstants.POST_FRONT_IMAGE, HttpMethod.POST, requestEntity,
					String.class);
		}
	}

	private HttpHeaders populateHeaderData(String authToken) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", authToken);
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);
		return headers;
	}

	private byte[] getByteData(MultipartFile imageData) {
		byte[] imageByte = new byte[(int) imageData.getSize()];
		try (InputStream in = imageData.getInputStream()) {
			int offset = 0;
			int numRead = 0;
			while ((offset < imageByte.length)
					& ((numRead = in.read(imageByte, offset, imageByte.length - offset)) >= 0)) {
				offset += numRead;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return imageByte;
	}

	@Override
	public void uploadBackImage(String authToken, MultipartFile backImage) {
		if (backImage != null & backImage.getSize() > 0) {
			byte[] imageByte = getByteData(backImage);
			MultiValueMap<String, Object> bodyMap = new LinkedMultiValueMap<>();
			bodyMap.add("frontImage", imageByte);

			HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(bodyMap,
					populateHeaderData(authToken));

			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> response = restTemplate.exchange(
					URLConstants.BASE_URL + URLConstants.POST_BACK_IMAGE, HttpMethod.POST, requestEntity, String.class);
		}
	}

}
