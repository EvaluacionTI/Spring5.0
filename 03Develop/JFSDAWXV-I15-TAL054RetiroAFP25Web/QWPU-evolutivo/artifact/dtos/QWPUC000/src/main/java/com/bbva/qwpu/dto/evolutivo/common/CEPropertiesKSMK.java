package com.bbva.qwpu.dto.evolutivo.common;

public enum CEPropertiesKSMK {
    KSMK_APP_NAME ("cliente-dummy"),
    KSMK_PASSWORD("9k6K6EAl7g6i37Md");

	private String value;

	CEPropertiesKSMK(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
