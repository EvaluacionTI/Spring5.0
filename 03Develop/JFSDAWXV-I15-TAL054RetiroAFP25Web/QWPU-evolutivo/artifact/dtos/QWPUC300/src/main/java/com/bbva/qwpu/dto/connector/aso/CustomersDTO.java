package com.bbva.qwpu.dto.connector.aso;

import com.bbva.apx.dto.AbstractDTO;

public class CustomersDTO extends AbstractDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Long idOut;

    public CustomersDTO() {
        super();
    }

    public CustomersDTO(String id, String firstName, String lastName) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getIdOut() {
        return idOut;
    }

    public void setIdOut(Long idOut) {
        this.idOut = idOut;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CustomersDTO{");
        sb.append("id='").append(id).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", idOut=").append(idOut);
        sb.append('}');
        return sb.toString();
    }

}
