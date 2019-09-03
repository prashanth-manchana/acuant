package com.vineeth.acuant.controller;

import java.util.Arrays;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import com.vineeth.acuant.constants.URLConstants;
import com.vineeth.acuant.to.Device;
import com.vineeth.acuant.to.ScanData;
import com.vineeth.acuant.to.Type;

@Controller
public class AssureIdConnectControllerHelper {

	@Autowired
	RestTemplate restTemplate;

	public int getDocumentInstance() {
		HttpHeaders headers = new HttpHeaders();

		headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
		// Request to return JSON format
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Basic " + getEncodedString("username" + ":" + "password"));
		String selectedImgSource = null;
		String selectedImgSize = null;
		String cropImg = null;
		String subscriptionID = null;
		populateData(selectedImgSource, selectedImgSize, cropImg, subscriptionID);
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<Integer> response = restTemplate.exchange(URLConstants.GET_DOCUMENT_INSTANCE, HttpMethod.POST,
				entity, Integer.class);
		return response.getBody();
	}

	private ScanData populateData(String selectedImgSource, String selectedImgSize, String cropImg,
			String subscriptionID) {
		ScanData data = new ScanData();

		Device device = new Device();
		device.setHasContactlessChipReader(false);
		device.setHasMagneticStripeReader(false);
		device.setSerialNumber("xxx");
		device.setType(populateTypeData(selectedImgSource));

		data.setDevice(device);
		data.setAuthenticationSensitivity(0);
		data.setClassificationMode(0);
		data.setProcessMode(0);
		data.setImageCroppingExpectedSize(selectedImgSize);
		data.setImageCroppingMode(cropImg);
		data.setSubscriptionId(subscriptionID);

		return data;
	}

	private Type populateTypeData(String selectedImgSource) {
		Type type = new Type();
		type.setManufacturer("xxx");
		type.setModel("xxx");
		type.setSensorType(selectedImgSource);
		return type;
	}

	private String getEncodedString(String usernamePassword) {
		return Base64.getEncoder().encodeToString(usernamePassword.getBytes());
	}

}
