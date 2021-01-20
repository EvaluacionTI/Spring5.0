package com.bbva.qwpu.dto.customers.apiaso;

import com.bbva.qwpu.dto.customers.CustomerEntity;
//import org.codehaus.jackson.annotate.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerASO extends CustomerEntity {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

}
