package com.bbva.qwpu.dto.connector.bpm;

import com.bbva.qwpu.dto.connector.bpm.BusinessDataBPMDTO;

public class StartProcessBPMDTO {
    private String containerId;
    private String businessId;
    private BusinessDataBPMDTO businessData;

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public BusinessDataBPMDTO getBusinessData() {
        return businessData;
    }

    public void setBusinessData(BusinessDataBPMDTO businessData) {
        this.businessData = businessData;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StartProcessBPMDTO{");
        sb.append("containerId='").append(containerId).append('\'');
        sb.append(", businessId='").append(businessId).append('\'');
        sb.append(", businessData=").append(businessData);
        sb.append('}');
        return sb.toString();
    }
}
