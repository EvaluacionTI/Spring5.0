package com.bbva.qwpu.dto.connector.aso;

import com.bbva.qwpu.dto.connector.CustomerEntity;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerASO extends CustomerEntity {

    public CustomerASO() {
        super();
    }

    public CustomerASO(String customerId) {
        super(customerId);
    }

    public CustomerASO(String id, String firstName, String lastName, String secondLastName) {
        super(id, firstName, null, lastName, secondLastName);
    }

    public CustomerASO(String id, String firstName, String middleName, String lastName, String secondLastName) {
        super(id, firstName, middleName, lastName, secondLastName);
    }

    public String getCustomerId() {
        return super.getId();
    }

    public void setCustomerId(String customerId) {
        super.setId(customerId);
    }

    public String getSurnames() {
        return super.getSecondLastName();
    }

    public void setSurnames(String surnames) {
        super.setSecondLastName(surnames);
    }
}
