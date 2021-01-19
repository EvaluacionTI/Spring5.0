package com.bbva.pglu.dto.customer.aso;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerASO {
    private String customerId;
    private String firstName;
    private String lastName;
    private String surnames;

    public CustomerASO() {
        super();
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

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomerASO{");
        sb.append("customerId='").append(customerId).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", surnames='").append(surnames).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
