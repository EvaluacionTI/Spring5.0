package com.bbva.qwpu.dto.connector.semaas.header;

import com.bbva.qwpu.dto.connector.semaas.ValueObject;

public class Header extends ValueObject {
	
	private Event event;
	private Origin origin;
	private Result result;
	private String version;
	private Traces traces;
	private Flag flag;

	public Header() {
		super();
	}

	public Header(Origin origin) {
		super();
		this.setOrigin(origin);
	}

	public Header(Event event, Origin origin, Result result,String version, Traces traces, Flag flag ) {
		super();
		this.setEvent(event);
		this.setOrigin(origin);
		this.setResult(result);
		this.setVersion(version);
		this.setTraces(traces);
		this.setFlag(flag);
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Origin getOrigin() {
		return origin;
	}

	public void setOrigin(Origin origin) {
		this.origin = origin;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Traces getTraces() {
		return traces;
	}

	public void setTraces(Traces traces) {
		this.traces = traces;
	}

	public Flag getFlag() {
		return flag;
	}

	public void setFlag(Flag flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("{");
		sb.append("event=").append(event);
		sb.append(", origin=").append(origin);
		sb.append(", result=").append(result);
		sb.append(", traces=").append(traces);
		sb.append(", flag=").append(flag);
		sb.append(", version='").append(version).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
