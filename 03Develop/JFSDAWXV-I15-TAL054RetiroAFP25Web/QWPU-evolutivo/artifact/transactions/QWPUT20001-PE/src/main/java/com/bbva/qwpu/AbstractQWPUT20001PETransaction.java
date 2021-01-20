package com.bbva.qwpu;

import java.util.List;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.qwpu.dto.customers.CustomerDTO;
import com.bbva.qwpu.dto.customers.DTOTransferencia;

public abstract class AbstractQWPUT20001PETransaction extends AbstractTransaction {

	public AbstractQWPUT20001PETransaction(){
	}
	
	

	
	

	/**
	 * Set value for output parameter EntityList
     * @param field
     */
	protected void setEntitylist(final List<CustomerDTO> field){
		this.addParameter("EntityList", field);
	}			
	
}
