package com.bbva.qwpu;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQWPUT00401PETransaction extends AbstractTransaction {

	public AbstractQWPUT00401PETransaction(){
	}


	/**
	 * Return value for input parameter id-canal
	 */
	protected String getIdCanal(){
		return (String)this.getParameter("id-canal");
	}

	/**
	 * Set value for String output parameter txt-message
	 */
	protected void setTxtMessage(final String field){
		this.addParameter("txt-message", field);
	}
}
