package com.bbva.qwpu.dto.connector.semaas.header;

import com.bbva.qwpu.dto.connector.semaas.ValueObject;

public class Origin extends ValueObject {
	
	private String country;
	private String ipv4;
	private String language;
	private String operation;
	private String timestamp;
	private String userType;
	private String uid;
	private String aap;
	private String session;
	private String user;
	private Bank bank;
	private String channelCode;
	private String environCode;
	private String productCode;


	public Origin() {
		super();
	}

	public Origin(String country, String ipv4, String language, String operation, String timestamp, String userType) {
		super();
		this.setCountry(country);
		this.setIpv4(ipv4);
		this.setLanguage(language);
		this.setOperation(operation);
		this.setTimestamp(timestamp);
		this.setUserType(userType);
	}

	public Origin(String uid, String aap, String session, String user, Bank bank, String channelCode, String environCode, String productCode) {
		super();
		this.setUid(uid);
		this.setAap(aap);
		this.setSession(session);
		this.setUser(user);
		this.setBank(bank);
		this.setChannelCode(channelCode);
		this.setEnvironCode(environCode);
		this.setProductCode(productCode);
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIpv4() {
		return ipv4;
	}

	public void setIpv4(String ipv4) {
		this.ipv4 = ipv4;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getAap() {
		return aap;
	}

	public void setAap(String aap) {
		this.aap = aap;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getEnvironCode() {
		return environCode;
	}

	public void setEnvironCode(String environCode) {
		this.environCode = environCode;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("{");
		sb.append("country='").append(country).append('\'');
		sb.append(", ipv4='").append(ipv4).append('\'');
		sb.append(", language='").append(language).append('\'');
		sb.append(", operation='").append(operation).append('\'');
		sb.append(", timestamp='").append(timestamp).append('\'');
		sb.append(", userType='").append(userType).append('\'');
		sb.append(", uid='").append(uid).append('\'');
		sb.append(", aap='").append(aap).append('\'');
		sb.append(", session='").append(session).append('\'');
		sb.append(", user='").append(user).append('\'');
		sb.append(", bank=").append(bank);
		sb.append(", channelCode='").append(channelCode).append('\'');
		sb.append(", environCode='").append(environCode).append('\'');
		sb.append(", productCode='").append(productCode).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
