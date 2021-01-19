package com.bbva.pglu;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.pglu.dto.customer.CustomerDTO;
import java.util.List;

public abstract class AbstractPGLUT00601PETransaction extends AbstractTransaction {

	public AbstractPGLUT00601PETransaction(){
	}


	/**
	 * Return value for input parameter lastName
	 */
	protected String getLastname(){
		return (String)this.getParameter("lastName");
	}

	/**
	 * Set value for List<CustomerDTO> output parameter listEntityCustomer
	 */
	protected void setListentitycustomer(final List<CustomerDTO> field){
		this.addParameter("listEntityCustomer", field);
	}
}
