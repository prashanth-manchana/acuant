package com.nec.acuant.to;

public class ScanData {
	private int authenticationSensitivity;
	private int classificationMode;
	private Device device;
	private int imageCroppingExpectedSize;
	private int imageCroppingMode;
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

	public int getImageCroppingExpectedSize() {
		return imageCroppingExpectedSize;
	}

	public void setImageCroppingExpectedSize(int imageCroppingExpectedSize) {
		this.imageCroppingExpectedSize = imageCroppingExpectedSize;
	}

	public int getImageCroppingMode() {
		return imageCroppingMode;
	}

	public void setImageCroppingMode(int imageCroppingMode) {
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
