package com.bbva.pglu;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.pglu.dto.customer.CustomerDTO;

public abstract class AbstractPGLUT00201PETransaction extends AbstractTransaction {

	public AbstractPGLUT00201PETransaction(){
	}


	/**
	 * Return value for input parameter EntitySaveCustomer
	 */
	protected CustomerDTO getEntitysavecustomer(){
		return (CustomerDTO)this.getParameter("EntitySaveCustomer");
	}
}
