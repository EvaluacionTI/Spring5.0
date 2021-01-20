package com.bbva.qwpu;

import com.bbva.qwpu.dto.customers.CustomerDTO;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQWPUT20301PETransaction extends AbstractTransaction {

	public AbstractQWPUT20301PETransaction(){
	}
	/**
	 * Return value for input parameter id-customer
	 */
	protected String getIdCustomer()
	{
		return (String)getParameter("id-customer");
	}
	
	

	/**
	 * Return value for input parameter Entity
	 */
	protected CustomerDTO getEntity(){
		return (CustomerDTO)getParameter("Entity");
	}
	
	
	

}
