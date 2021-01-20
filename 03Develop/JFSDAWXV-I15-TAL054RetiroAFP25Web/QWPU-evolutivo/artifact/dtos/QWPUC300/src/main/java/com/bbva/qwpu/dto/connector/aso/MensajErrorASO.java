package com.bbva.qwpu.dto.connector.aso;

public enum MensajErrorASO {
    ERROR_RESPUESTA_ASO("QWPU00010020"),
    ERROR_CONNECT_ASO_CUSTOMERS("QWPU0001021");

    private String value;

    MensajErrorASO(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
