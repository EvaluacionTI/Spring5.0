package com.bbva.qwpu;


import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQWPUT20401PETransaction extends AbstractTransaction {

	public AbstractQWPUT20401PETransaction(){
	}
	/**
	 * Return value for input parameter id-customer
	 */
	protected String getIdCustomer()
	{
		return (String)getParameter("id-customer");
	}
	
	

	
	

}
