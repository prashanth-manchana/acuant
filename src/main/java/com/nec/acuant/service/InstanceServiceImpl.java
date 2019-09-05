package com.nec.acuant.service;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.nec.acuant.constants.URLConstants;
import com.nec.acuant.to.Device;
import com.nec.acuant.to.ScanData;
import com.nec.acuant.to.Type;

@Service
public class InstanceServiceImpl implements InstanceService {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Value("${subscriptionID}")
	private String subscriptionId;

	@Override
	public String getInstanceId(String authToken) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", authToken);
		ScanData scanData = populateData();
		Gson gson = new Gson();
		HttpEntity<String> entity = new HttpEntity<>(gson.toJson(scanData), headers);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.exchange(
				URLConstants.BASE_URL + URLConstants.GET_DOCUMENT_INSTANCE, HttpMethod.POST, entity, String.class);
		LOGGER.debug(response.getBody().toString());
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

	@Override
	public String getInstaneData(String instanceId, String authToken) {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", authToken);
		HttpEntity<String> entity = new HttpEntity<>(null, headers);
		String url = URLConstants.BASE_URL + URLConstants.GET_DOCUMENT_DATA;
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.exchange(getUpdateUrl(instanceId, url), HttpMethod.GET, entity,
				String.class);
		return response.getBody();
	}

	private String getUpdateUrl(String instanceId, String url) {
		return url.replace("{INSTANCEID}", instanceId);
	}

}
