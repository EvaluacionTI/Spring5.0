package com.bbva.pglu;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.pglu.dto.customer.CustomerDTO;
import java.util.List;

public abstract class AbstractPGLUT00301PETransaction extends AbstractTransaction {

	public AbstractPGLUT00301PETransaction(){
	}


	/**
	 * Set value for List<CustomerDTO> output parameter listEntityCustomer
	 */
	protected void setListentitycustomer(final List<CustomerDTO> field){
		this.addParameter("listEntityCustomer", field);
	}
}
