package com.bbva.qwpu.dto.connector.semaas.header;

import com.bbva.qwpu.dto.connector.semaas.ValueObject;

public class Traces extends ValueObject {

    private String traceId;
    private String parentSpanId;
    private String followsSpanId;

    public Traces() {
        super();
    }

    public Traces(String traceId, String parentSpanId, String followsSpanId) {
        super();
        this.setTraceId(traceId);
        this.setParentSpanId(parentSpanId);
        this.setFollowsSpanId(followsSpanId);
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getParentSpanId() {
        return parentSpanId;
    }

    public void setParentSpanId(String parentSpanId) {
        this.parentSpanId = parentSpanId;
    }

    public String getFollowsSpanId() {
        return followsSpanId;
    }

    public void setFollowsSpanId(String followsSpanId) {
        this.followsSpanId = followsSpanId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("traceId='").append(traceId).append('\'');
        sb.append(", parentSpanId='").append(parentSpanId).append('\'');
        sb.append(", followsSpanId='").append(followsSpanId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
