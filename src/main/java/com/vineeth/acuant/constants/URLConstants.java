package com.vineeth.acuant.constants;

public class URLConstants {
	public final static String GET_DOCUMENT_INSTANCE = "/AssureIDService/Document/Instance";
	public final static String POST_FRONT_IMAGE = "/AssureIDService/Document/{instanceID}/Image?side=0&light=0";
	public final static String POST_BACK_IMAGE = "/AssureIDService/Document/{instanceID}/Image?side=1&light=0";
	public final static String GET = "/AssureIDService/Document/{instanceID}/Image?side=1&light=0";
}
