package com.bbva.qwpu;

import java.util.List;
import com.bbva.qwpu.dto.customers.DTOTransferencia;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQWPUT21501PETransaction extends AbstractTransaction {

	public AbstractQWPUT21501PETransaction(){
	}
	/**
	 * Return value for input parameter pageSize
	 */
	protected Long getPagesize()
	{
		return (Long)getParameter("pageSize");
	}
	/**
	 * Return value for input parameter paginationKey
	 */
	protected Long getPaginationkey()
	{
		return (Long)getParameter("paginationKey");
	}
	
	

	
	

	/**
	 * Set value for output parameter ListTransfer
	 */
	protected void setListtransfer(final List<DTOTransferencia> field){
		this.addParameter("ListTransfer", field);
	}			
	
}
