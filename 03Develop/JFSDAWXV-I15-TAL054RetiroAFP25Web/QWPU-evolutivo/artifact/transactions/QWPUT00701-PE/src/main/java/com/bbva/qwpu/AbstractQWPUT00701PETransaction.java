package com.bbva.qwpu;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQWPUT00701PETransaction extends AbstractTransaction {

	public AbstractQWPUT00701PETransaction(){
	}


	/**
	 * Set value for String output parameter dataEco
	 */
	protected void setDataeco(final String field){
		this.addParameter("dataEco", field);
	}
}
