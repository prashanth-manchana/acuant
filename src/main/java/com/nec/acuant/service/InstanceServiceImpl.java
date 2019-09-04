package com.nec.acuant.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.nec.acuant.constants.URLConstants;
import com.nec.acuant.to.Device;
import com.nec.acuant.to.ScanData;
import com.nec.acuant.to.Type;

public class InstanceServiceImpl implements InstanceService {

	@Value("${subscriptionID}")
	private String subscriptionId;

	@Override
	public String getInstanceId(String authToken) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", authToken);
		HttpEntity<ScanData> entity = new HttpEntity<ScanData>(populateData(), headers);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.exchange(
				URLConstants.BASE_URL + URLConstants.GET_DOCUMENT_INSTANCE, HttpMethod.POST, entity, String.class);
		return response.getBody();
	}

	private ScanData populateData() {
		ScanData data = new ScanData();

		Device device = new Device();
		device.setHasContactlessChipReader(false);
		device.setHasMagneticStripeReader(false);
		device.setSerialNumber("xxx");
		device.setType(populateTypeData());

		data.setDevice(device);
		data.setAuthenticationSensitivity(0);
		data.setClassificationMode(0);
		data.setProcessMode(0);
		data.setImageCroppingExpectedSize(0);
		data.setImageCroppingMode(0);
		data.setSubscriptionId(subscriptionId);

		return data;
	}

	private Type populateTypeData() {
		Type type = new Type();
		type.setManufacturer("xxx");
		type.setModel("xxx");
		type.setSensorType(0);
		return type;
	}

}
