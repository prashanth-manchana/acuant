package com.nec.acuant.service;

public interface InstanceService {

	public String getInstanceId(String authToken);

	public String getInstaneData(String instanceId, String authToken);

}
