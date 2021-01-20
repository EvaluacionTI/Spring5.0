package com.bbva.qwpu;

import java.util.List;
import com.bbva.qwpu.dto.customers.pagination.DTOPaginationIn;
import com.bbva.qwpu.dto.customers.CustomerDTO;
import com.bbva.qwpu.dto.customers.pagination.DTOPaginationOut;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQWPUT20501PETransaction extends AbstractTransaction {

	public AbstractQWPUT20501PETransaction(){
	}
	
	

	/**
	 * Return value for input parameter EntityPaginationIn
	 */
	protected DTOPaginationIn getEntitypaginationin(){
		return (DTOPaginationIn)getParameter("EntityPaginationIn");
	}
	
	
	

	/**
	 * Set value for output parameter ListCustomer
	 */
	protected void setListcustomer(final List<CustomerDTO> field){
		this.addParameter("ListCustomer", field);
	}			
	
	/**
	 * Set value for output parameter EntityPaginationOut
	 */
	protected void setEntitypaginationout(final DTOPaginationOut field){
		this.addParameter("EntityPaginationOut", field);
	}			
	
}
