package com.bbva.qwpu;

import com.bbva.qwpu.dto.evolutivo.CECanalDTO;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQWPUT00101PETransaction extends AbstractTransaction {

	public AbstractQWPUT00101PETransaction(){
	}
	/**
	 * Return value for input parameter id-canal
	 */
	protected String getIdCanal()
	{
		return (String)getParameter("id-canal");
	}
	
	

	
	

	/**
	 * Set value for output parameter EntityOut
	 */
	protected void setEntityout(final CECanalDTO field){
		this.addParameter("EntityOut", field);
	}			
	
}
