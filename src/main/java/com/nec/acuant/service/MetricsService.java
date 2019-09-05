package com.nec.acuant.service;

import org.springframework.stereotype.Service;

import com.nec.acuant.to.MetricsResponse;

@Service
public interface MetricsService {

	public MetricsResponse getImageMetrics(String instanceId, String authToken, int side, int light);

}
