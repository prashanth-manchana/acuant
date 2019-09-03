package com.vineeth.acuant.to;

public class Device {
	private boolean hasContactlessChipReader;
	private boolean hasMagneticStripeReader;
	private String SerialNumber;
	private Type type;

	public boolean isHasContactlessChipReader() {
		return hasContactlessChipReader;
	}

	public void setHasContactlessChipReader(boolean hasContactlessChipReader) {
		this.hasContactlessChipReader = hasContactlessChipReader;
	}

	public boolean isHasMagneticStripeReader() {
		return hasMagneticStripeReader;
	}

	public void setHasMagneticStripeReader(boolean hasMagneticStripeReader) {
		this.hasMagneticStripeReader = hasMagneticStripeReader;
	}

	public String getSerialNumber() {
		return SerialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
