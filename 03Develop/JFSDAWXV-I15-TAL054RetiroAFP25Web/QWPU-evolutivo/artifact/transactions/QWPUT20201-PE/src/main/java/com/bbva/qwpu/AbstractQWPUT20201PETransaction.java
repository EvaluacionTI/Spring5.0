package com.bbva.qwpu;

import com.bbva.qwpu.dto.customers.CustomerDTO;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQWPUT20201PETransaction extends AbstractTransaction {

	public AbstractQWPUT20201PETransaction(){
	}
	
	

	/**
	 * Return value for input parameter Entity
	 */
	protected CustomerDTO getEntity(){
		return (CustomerDTO)getParameter("Entity");
	}
	
	
	

}
