package com.bbva.pglu;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractPGLUT00501PETransaction extends AbstractTransaction {

	public AbstractPGLUT00501PETransaction(){
	}


	/**
	 * Return value for input parameter id-customer
	 */
	protected String getIdCustomer(){
		return (String)this.getParameter("id-customer");
	}
}
