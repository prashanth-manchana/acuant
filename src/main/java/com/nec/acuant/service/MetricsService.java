package com.nec.acuant.service;

import org.springframework.stereotype.Service;

@Service
public interface MetricsService {
	public void getFrontImageMetrics();

	public void getBackImageMetrics();
}
