package com.bbva.pglu;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.pglu.dto.customer.CustomerDTO;

public abstract class AbstractPGLUT00401PETransaction extends AbstractTransaction {

	public AbstractPGLUT00401PETransaction(){
	}


	/**
	 * Return value for input parameter EntityCustomer
	 */
	protected CustomerDTO getEntitycustomer(){
		return (CustomerDTO)this.getParameter("EntityCustomer");
	}
}
