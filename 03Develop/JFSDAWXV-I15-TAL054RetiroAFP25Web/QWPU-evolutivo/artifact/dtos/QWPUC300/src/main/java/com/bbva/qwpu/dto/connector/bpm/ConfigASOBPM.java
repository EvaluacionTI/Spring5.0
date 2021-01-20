package com.bbva.qwpu.dto.connector.bpm;

public enum ConfigASOBPM {
    CONTAINER_ID_PACKAGE("app.pcpe.containerid.package"),
    CONTAINER_ID_PROCESS_MODEL_ID("app.pcpe.containerid.processmodelid"),
    CONTAINER_ID_VERSION("app.pcpe.containerid.version"),
    RESOURCE_BUSINESS_PROCESS_START("aso.BusinessProcessManagement.startProcess");

    private String value;

    ConfigASOBPM(String value){
       this.value = value;
    }

    public String value() {
        return value;
    }
}
