package com.nec.acuant.to;

import java.util.List;

public class TypeData {
	private int classValue;
	private String classCode;
	private String className;
	private String countryCode;
	private String id;
	private boolean isGeneric;
	private String issue;
	private String issueType;
	private String issuerCode;
	private String issuerName;
	private int issuerType;
	private String keesingCode;
	private String name;
	private int size;
	private List<SupportedImages> supportedImages;

	public int getClassValue() {
		return classValue;
	}

	public void setClassValue(int classValue) {
		this.classValue = classValue;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isGeneric() {
		return isGeneric;
	}

	public void setGeneric(boolean isGeneric) {
		this.isGeneric = isGeneric;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public String getIssuerCode() {
		return issuerCode;
	}

	public void setIssuerCode(String issuerCode) {
		this.issuerCode = issuerCode;
	}

	public String getIssuerName() {
		return issuerName;
	}

	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}

	public int getIssuerType() {
		return issuerType;
	}

	public void setIssuerType(int issuerType) {
		this.issuerType = issuerType;
	}

	public String getKeesingCode() {
		return keesingCode;
	}

	public void setKeesingCode(String keesingCode) {
		this.keesingCode = keesingCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<SupportedImages> getSupportedImages() {
		return supportedImages;
	}

	public void setSupportedImages(List<SupportedImages> supportedImages) {
		this.supportedImages = supportedImages;
	}

}
