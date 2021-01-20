package com.bbva.qwpu;

import com.bbva.qwpu.dto.customers.CustomerDTO;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQWPUT20101PETransaction extends AbstractTransaction {

	public AbstractQWPUT20101PETransaction(){
	}
	/**
	 * Return value for input parameter id-customer
	 */
	protected String getIdCustomer()
	{
		return (String)getParameter("id-customer");
	}
	
	

	
	

	/**
	 * Set value for output parameter Entity
	 */
	protected void setEntity(final CustomerDTO field){
		this.addParameter("Entity", field);
	}			
	
}
