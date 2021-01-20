package com.bbva.qwpu.dto.evolutivo.common;

public enum CEMessagError {

	NOT_FOUND_INFORMATION("QWPU10002000"),
    NOT_FOUND_APP_NAME_KSMK("QWPU10002005"),
    NOT_FOUND_PASSWORD_KSMK("QWPU10002006"),
	ERROR_CONNECT_ASO_LIST_CUSTOMER("QWPU10002007"),
	ERROR_CONNECT_ASO_CRYPTO_DOCUMENTS("QWPU10002008");

	private String value;

	CEMessagError(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
