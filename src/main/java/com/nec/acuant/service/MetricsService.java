package com.nec.acuant.service;

import com.nec.acuant.to.MetricsResponse;

public interface MetricsService {

	public MetricsResponse getImageMetrics(String instanceId, String authToken, int side, int light);

}
