package com.vineeth.acuant.controller;

import java.util.Arrays;
import java.util.Base64;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vineeth.acuant.to.Device;
import com.vineeth.acuant.to.ScanData;
import com.vineeth.acuant.to.Type;

@Controller
public class AssureIdConnectController {

	@PostMapping
	public ModelAndView getDocumentInstance() {
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
		return null;
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
