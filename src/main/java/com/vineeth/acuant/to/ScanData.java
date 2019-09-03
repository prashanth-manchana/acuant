package com.vineeth.acuant.to;

public class ScanData {
	private int authenticationSensitivity;
	private int classificationMode;
	private Device device;
	private String imageCroppingExpectedSize;
	private String imageCroppingMode;
	private String manualDocumentType;
	private int processMode;
	private String subscriptionId;

	public int getAuthenticationSensitivity() {
		return authenticationSensitivity;
	}

	public void setAuthenticationSensitivity(int authenticationSensitivity) {
		this.authenticationSensitivity = authenticationSensitivity;
	}

	public int getClassificationMode() {
		return classificationMode;
	}

	public void setClassificationMode(int classificationMode) {
		this.classificationMode = classificationMode;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public String getImageCroppingExpectedSize() {
		return imageCroppingExpectedSize;
	}

	public void setImageCroppingExpectedSize(String imageCroppingExpectedSize) {
		this.imageCroppingExpectedSize = imageCroppingExpectedSize;
	}

	public String getImageCroppingMode() {
		return imageCroppingMode;
	}

	public void setImageCroppingMode(String imageCroppingMode) {
		this.imageCroppingMode = imageCroppingMode;
	}

	public String getManualDocumentType() {
		return manualDocumentType;
	}

	public void setManualDocumentType(String manualDocumentType) {
		this.manualDocumentType = manualDocumentType;
	}

	public int getProcessMode() {
		return processMode;
	}

	public void setProcessMode(int processMode) {
		this.processMode = processMode;
	}

	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

}
