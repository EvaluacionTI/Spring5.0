package com.bbva.qwpu;

import com.bbva.qwpu.dto.evolutivo.CECanalDTO;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQWPUT00301PETransaction extends AbstractTransaction {

	public AbstractQWPUT00301PETransaction(){
	}
	/**
	 * Return value for input parameter id-canal
	 */
	protected String getIdCanal()
	{
		return (String)getParameter("id-canal");
	}
	
	

	/**
	 * Return value for input parameter EntityIn
	 */
	protected CECanalDTO getEntityin(){
		return (CECanalDTO)getParameter("EntityIn");
	}
	
	
	

}
