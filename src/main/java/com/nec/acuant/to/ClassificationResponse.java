package com.nec.acuant.to;

public class ClassificationResponse {
	private int mode;
	private boolean orientationChanged;
	private boolean presentationChanged;
	private TypeData typeData;

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public boolean isOrientationChanged() {
		return orientationChanged;
	}

	public void setOrientationChanged(boolean orientationChanged) {
		this.orientationChanged = orientationChanged;
	}

	public boolean isPresentationChanged() {
		return presentationChanged;
	}

	public void setPresentationChanged(boolean presentationChanged) {
		this.presentationChanged = presentationChanged;
	}

	public TypeData getTypeData() {
		return typeData;
	}

	public void setTypeData(TypeData typeData) {
		this.typeData = typeData;
	}

}
