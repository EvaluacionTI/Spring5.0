package com.bbva.qwpu;

import com.bbva.qwpu.dto.evolutivo.CECanalDTO;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQWPUT00201PETransaction extends AbstractTransaction {

	public AbstractQWPUT00201PETransaction(){
	}
	
	

	/**
	 * Return value for input parameter EntityIn
	 */
	protected CECanalDTO getEntityin(){
		return (CECanalDTO)getParameter("EntityIn");
	}
	
	
	

}
