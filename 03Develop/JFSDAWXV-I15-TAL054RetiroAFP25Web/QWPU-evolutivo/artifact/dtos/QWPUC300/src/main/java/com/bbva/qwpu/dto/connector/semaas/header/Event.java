package com.bbva.qwpu.dto.connector.semaas.header;

import com.bbva.qwpu.dto.connector.semaas.ValueObject;

public class Event extends ValueObject {
	
	private String name;
	private String namespace;
	private String uid;
	private String timestamp;

	public Event() {
		super();
	}

	public Event(String name, String namespace, String uid, String timestamp) {
		super();
		this.setName(name);
		this.setNamespace(namespace);
		this.setUid(uid);
		this.setTimestamp(timestamp);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("{");
		sb.append("name='").append(name).append('\'');
		sb.append(", namespace='").append(namespace).append('\'');
		sb.append(", uid='").append(uid).append('\'');
		sb.append(", timestamp='").append(timestamp).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
