package com.bbva.qwpu.dto.rules;

public enum MensajErrorRule {
    ERROR_RESPUESTA_RULES("QWPU00010020"),
    ERROR_CONNECT_RULES("QWPU0001021");

    private String value;

    MensajErrorRule(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
