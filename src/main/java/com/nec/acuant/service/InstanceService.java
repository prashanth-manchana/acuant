package com.nec.acuant.service;

import org.springframework.stereotype.Service;

@Service
public interface InstanceService {
	public int getInstanceId(String authToken);
}
