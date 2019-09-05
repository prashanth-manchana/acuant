package com.nec.acuant.service;

import com.nec.acuant.to.ClassificationResponse;

public interface ClassificationService {

	public ClassificationResponse getClassificationData(String instanceId, String authToken);

}
