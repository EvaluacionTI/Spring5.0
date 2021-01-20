package com.bbva.qwpu.dto.rules;

public enum ConfigRule {
    RULE_CERTIFICATE_ID("chameleon.certificate.internal.id"),
    RULE_CERTIFICATE_PWD("chameleon.certificate.internal.password"),

    RULE_NAMESPACE("api.rule.namespace"),
    RULE_NAME("api.rule.name"),
    RULE_VERSION ("api.rule.version"),
    RULE_NAME_SERVICE("api.rule.decision.service"),
    RULE_API_URL ("putServiceRule");

    private String sValue;

    ConfigRule(String psValue){
        this.setsValue(psValue);
    }

    public String getsValue() {
        return sValue;
    }

    public void setsValue(String sValue) {
        this.sValue = sValue;
    }
}
