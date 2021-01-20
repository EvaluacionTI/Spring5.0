package com.bbva.qwpu;

import com.bbva.qwpu.dto.evolutivo.CECanalDTO;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQWPUT00501PETransaction extends AbstractTransaction {

	public AbstractQWPUT00501PETransaction(){
	}
	/**
	 * Return value for input parameter id-canal
	 */
	protected Long getIdCanal()
	{
		return (Long)getParameter("id-canal");
	}
	
	

	
	

	/**
	 * Set value for output parameter entityKSMK
	 */
	protected void setEntityksmk(final CECanalDTO field){
		this.addParameter("entityKSMK", field);
	}			
	
}
