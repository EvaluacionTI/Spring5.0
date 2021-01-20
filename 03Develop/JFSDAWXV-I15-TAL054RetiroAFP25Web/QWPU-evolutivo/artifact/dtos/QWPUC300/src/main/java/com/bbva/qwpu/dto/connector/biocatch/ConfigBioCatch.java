package com.bbva.qwpu.dto.connector.biocatch;

public enum ConfigBioCatch {
    EXTERNAL_PROXY_HOST("api.connector.proxy.host"),
    EXTERNAL_PROXY_PORT("api.connector.proxy.port"),
    EXTERNAL_PROXY_USER("api.connector.proxy.username"),
    EXTERNAL_PROXY_PWD("api.connector.proxy.password"),
    EXTERNAL_CERTIFICATE_ID("chameleon.certificate.external.id"),
    EXTERNAL_CERTIFICATE_PWD("chameleon.certificate.external.password"),
    GET_INIT_BIOCATCH("api.connector.init.url");

    private String sValue;

    ConfigBioCatch(String psValue){
        this.setsValue(psValue);
    }


    public String getsValue() {
        return sValue;
    }

    public void setsValue(String sValue) {
        this.sValue = sValue;
    }
}
