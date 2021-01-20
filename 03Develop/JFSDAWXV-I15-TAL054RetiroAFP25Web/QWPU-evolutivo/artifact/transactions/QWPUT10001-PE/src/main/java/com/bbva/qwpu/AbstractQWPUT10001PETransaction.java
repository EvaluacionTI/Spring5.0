package com.bbva.qwpu;

import java.util.List;
import com.bbva.qwpu.dto.employed.CEEmployedDTO;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQWPUT10001PETransaction extends AbstractTransaction {

	public AbstractQWPUT10001PETransaction(){
	}
	
	

	/**
	 * Return value for input parameter EntityIn
	 */
	protected CEEmployedDTO getEntity(){
		return (CEEmployedDTO)getParameter("EntityIn");
	}
	
	
	

	/**
	 * Set value for output parameter EntityList
	 */
	protected void setEntitylist(final List<CEEmployedDTO> field){
		this.addParameter("EntityList", field);
	}			
	
	/**
	 * Set value for output parameter EntityOut
	 */
	protected void setEntity(final CEEmployedDTO field){
		this.addParameter("EntityOut", field);
	}			
	
}
