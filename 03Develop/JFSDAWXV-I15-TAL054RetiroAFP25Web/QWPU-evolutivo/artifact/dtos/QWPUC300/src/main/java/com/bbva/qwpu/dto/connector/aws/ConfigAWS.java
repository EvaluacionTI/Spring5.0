package com.bbva.qwpu.dto.connector.aws;

public enum ConfigAWS {
    INTERNAL_PROXY_HOST("api.connector.proxy.host"),
    INTERNAL_PROXY_PORT("api.connector.proxy.port"),
    INTERNAL_CERTIFICATE_ID("chameleon.certificate.internal.id"),
    INTERNAL_CERTIFICATE_PWD("chameleon.certificate.internal.password");

    private String sValue;

    ConfigAWS(String psValue){
        this.setsValue(psValue);
    }


    public String getsValue() {
        return sValue;
    }

    public void setsValue(String sValue) {
        this.sValue = sValue;
    }
}
