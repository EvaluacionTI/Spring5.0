package com.bbva.qwpu;

import java.util.List;
import com.bbva.qwpu.dto.evolutivo.CECanalDTO;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQWPUT00001PETransaction extends AbstractTransaction {

	public AbstractQWPUT00001PETransaction(){
	}
	
	

	
	

	/**
	 * Set value for output parameter EntityList
	 */
	protected void setEntitylist(final List<CECanalDTO> field){
		this.addParameter("EntityList", field);
	}			
	
}
