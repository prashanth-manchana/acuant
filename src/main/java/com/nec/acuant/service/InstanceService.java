package com.nec.acuant.service;

import org.springframework.stereotype.Service;

@Service
public interface InstanceService {

	public String getInstanceId(String authToken);

	public String getInstaneData(String instanceId, String authToken);

}
