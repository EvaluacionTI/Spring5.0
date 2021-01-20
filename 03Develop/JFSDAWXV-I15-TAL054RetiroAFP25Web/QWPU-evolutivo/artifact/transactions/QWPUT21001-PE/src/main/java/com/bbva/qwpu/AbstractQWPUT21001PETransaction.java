package com.bbva.qwpu;

import java.util.List;
import com.bbva.qwpu.dto.customers.DTOTransferencia;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQWPUT21001PETransaction extends AbstractTransaction {

	public AbstractQWPUT21001PETransaction(){
	}
	
	

	
	

	/**
	 * Set value for output parameter ListTransfer
	 */
	protected void setListtransfer(final List<DTOTransferencia> field){
		this.addParameter("ListTransfer", field);
	}			
	
}
