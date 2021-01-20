package com.bbva.qwpu.dto.connector.aso;

public enum ConfigASO {
    ENABLE_CONNECT_TO_ASO("api.connector.getCustomers.url"),
    ENABLE_CONNECT_TO_INVOKE("api.connector.getCustomers.invoke.type"),
    API_GET_CUSTOMER ("getCustomers");

    private String sValue;

    ConfigASO(String psValue){
        this.setsValue(psValue);
    }

    public String getsValue() {
        return sValue;
    }

    public void setsValue(String sValue) {
        this.sValue = sValue;
    }
}
