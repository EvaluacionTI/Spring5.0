package com.bbva.qwpu.dto.evolutivo.common;

public enum CEPropertiesASO {
    ASO_GET_CUSTOMER ("getCustomers"),
	ASO_GET_CRYPTO_DOCUMENTS ("getCryptoDocuments");

    private String value;

    CEPropertiesASO(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
