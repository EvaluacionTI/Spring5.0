package com.bbva.qwpu.dto.connector.semaas;

public enum ConfigSEMAAS {
    SEMAAS_EVENT_NAME("semaas.event.name"),
    SEMAAS_ORIGIN_OPERATION("semaas.origin.operation"),
    SEMAAS_CERTIFICATE_ID("chameleon.certificate.internal.id"),
    SEMAAS_CERTIFICATE_PWD("chameleon.certificate.internal.password");

    private String value;

    ConfigSEMAAS(String psValue){
        this.value = psValue;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
