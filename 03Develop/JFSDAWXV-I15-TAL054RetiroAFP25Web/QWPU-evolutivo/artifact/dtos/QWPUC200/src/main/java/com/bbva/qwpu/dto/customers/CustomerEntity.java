package com.bbva.qwpu.dto.customers;

public class CustomerEntity extends EntityBase {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
    private String middleName;
    private String lastName;
    private String secondLastName;

    public CustomerEntity() {
        super();
    }

    public CustomerEntity(String id) {
        super(id);
    }

    public CustomerEntity(String id, String firstName, String middleName, String lastName, String secondLastName) {
        super(id);
        this.setFirstName(firstName);
        this.setMiddleName(middleName);
        this.setLastName(lastName);
        this.setSecondLastName(secondLastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }


}
