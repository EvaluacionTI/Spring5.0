package com.bbva.qwpu.dto.connector.semaas.header;

import com.bbva.qwpu.dto.connector.semaas.ValueObject;

public class Result extends ValueObject {
	
	private String returnCode;
	private String returnDefinition;

	public Result() {
		super();
	}

	public Result(String returnCode, String returnDefinition) {
		super();
		this.setReturnCode(returnCode);
		this.setReturnDefinition(returnDefinition);
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnDefinition() {
		return returnDefinition;
	}

	public void setReturnDefinition(String returnDefinition) {
		this.returnDefinition = returnDefinition;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("{");
		sb.append("\"returnCode\":\"").append(this.getReturnCode()).append('\"');
		sb.append(", \"returnDefinition\":\"").append(this.getReturnDefinition()).append('\"');
		sb.append('}');
		return sb.toString();
	}
}
