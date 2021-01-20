package com.bbva.qwpu;

import com.bbva.qwpu.dto.customers.DTOTransferencia;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQWPUT21101PETransaction extends AbstractTransaction {

	public AbstractQWPUT21101PETransaction(){
	}
	
	

	
	

	/**
	 * Set value for output parameter EntityTransfer
	 */
	protected void setEntitytransfer(final DTOTransferencia field){
		this.addParameter("EntityTransfer", field);
	}			
	
}
