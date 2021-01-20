package com.bbva.qwpu.dto.customers;

public class ParameterException extends RuntimeException {
    private final String adviceCode;
    private final transient String[] args;

    public ParameterException(String adviceCode, String... args) {
        this.adviceCode = adviceCode;
        this.args = args;
    }

    public String getAdviceCode() {
        return adviceCode;
    }

    public Object[] getArgs() {
        return args;
    }
}
