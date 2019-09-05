package com.nec.acuant.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nec.acuant.constants.URLConstants;
import com.nec.acuant.to.MetricsResponse;

@Service
public class MetricsServiceImpl implements MetricsService {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	public MetricsResponse getImageMetrics(String instanceId, String authToken, int side, int light) {
		String url = URLConstants.BASE_URL + URLConstants.GET_METRICS;
		HttpEntity<String> requestEntity = new HttpEntity<>(null, populateHeaderData(authToken));
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<MetricsResponse> response = restTemplate.exchange(getUpdatedUrl(instanceId, url, side, light),
				HttpMethod.GET, requestEntity, MetricsResponse.class);
		LOGGER.debug(response.getBody().toString());
		return response.getBody();
	}

	private HttpHeaders populateHeaderData(String authToken) {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", authToken);
		return headers;
	}

	private String getUpdatedUrl(String instanceId, String url, int side, int light) {
		url.replace("{INSTANCEID}", instanceId);
		url.replace("{SIDE}", String.valueOf(side));
		url.replace("{LIGHT}", String.valueOf(light));
		return url;
	}

}
