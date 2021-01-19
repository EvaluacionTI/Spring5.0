package com.bbva.pglu;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.pglu.dto.customer.CustomerDTO;

public abstract class AbstractPGLUT00801PETransaction extends AbstractTransaction {

	public AbstractPGLUT00801PETransaction(){
	}


	/**
	 * Return value for input parameter id-customer
	 */
	protected String getIdCustomer(){
		return (String)this.getParameter("id-customer");
	}

	/**
	 * Set value for CustomerASO output parameter EntityOut
	 */
	protected void setEntityout(final CustomerDTO field){
		this.addParameter("EntityOut", field);
	}
}
