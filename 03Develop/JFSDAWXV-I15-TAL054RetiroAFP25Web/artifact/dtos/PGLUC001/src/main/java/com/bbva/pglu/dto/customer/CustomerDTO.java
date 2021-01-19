package com.bbva.pglu.dto.customer;

import com.bbva.apx.dto.AbstractDTO;

import java.sql.Date;

public class CustomerDTO extends AbstractDTO {
    private String customerId;
    private String firstName;
    private String lastName;

    public CustomerDTO(){}

    public CustomerDTO(String id, String firstName, String lastName) {
        this.setCustomerId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CustomerDTO{");
        sb.append("customerId='").append(customerId).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');

        sb.append('}');
        return sb.toString();
    }
}
