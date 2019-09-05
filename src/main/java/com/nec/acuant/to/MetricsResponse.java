package com.nec.acuant.to;

public class MetricsResponse {
	private int glareMetric;
	private long horizontalResolution;
	private String id;
	private boolean isCropped;
	private boolean isTampered;
	private int light;
	private String mimeType;
	private int sharpnessMetric;
	private int side;
	private String uri;
	private long verticalResolution;

	public int getGlareMetric() {
		return glareMetric;
	}

	public void setGlareMetric(int glareMetric) {
		this.glareMetric = glareMetric;
	}

	public long getHorizontalResolution() {
		return horizontalResolution;
	}

	public void setHorizontalResolution(long horizontalResolution) {
		this.horizontalResolution = horizontalResolution;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isCropped() {
		return isCropped;
	}

	public void setCropped(boolean isCropped) {
		this.isCropped = isCropped;
	}

	public boolean isTampered() {
		return isTampered;
	}

	public void setTampered(boolean isTampered) {
		this.isTampered = isTampered;
	}

	public int getLight() {
		return light;
	}

	public void setLight(int light) {
		this.light = light;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public int getSharpnessMetric() {
		return sharpnessMetric;
	}

	public void setSharpnessMetric(int sharpnessMetric) {
		this.sharpnessMetric = sharpnessMetric;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public long getVerticalResolution() {
		return verticalResolution;
	}

	public void setVerticalResolution(long verticalResolution) {
		this.verticalResolution = verticalResolution;
	}

}
