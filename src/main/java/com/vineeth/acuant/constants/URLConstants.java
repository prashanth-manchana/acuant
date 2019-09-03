package com.vineeth.acuant.constants;

public class URLConstants {
	private final static String GET_DOCUMENT_INSTANCE = "/AssureIDService/Document/Instance";
	private final static String POST_FRONT_IMAGE = "/AssureIDService/Document/{instanceID}/Image?side=0&light=0";
	private final static String POST_BACK_IMAGE = "/AssureIDService/Document/{instanceID}/Image?side=1&light=0";
}
