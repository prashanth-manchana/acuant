package com.nec.acuant.constants;

public class URLConstants {
	public final static String BASE_URL = "https://services.assureid.net";
	public final static String GET_DOCUMENT_INSTANCE = "/AssureIDService/Document/Instance";
	public final static String POST_IMAGE = "/AssureIDService/Document/{instanceID}/Image?side={SIDE}&light={LIGHT}";
	public final static String GET_METRICS = "/AssureIDService/Document/{INSTANCEID}/Image/Metrics?side={SIDE}&light={LIGHT}";
	public static final String GET_DOCUMENT_DATA = "/AssureIDService/Document/{INSTANCEID}";
	public static final String GET_CLASSIFICATION = "/AssureIDService/Document/{INSTANCEID}/Classification";
}
