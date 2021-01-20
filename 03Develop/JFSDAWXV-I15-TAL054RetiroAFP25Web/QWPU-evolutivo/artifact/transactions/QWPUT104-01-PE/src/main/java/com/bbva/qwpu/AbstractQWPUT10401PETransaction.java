package com.bbva.qwpu;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQWPUT10401PETransaction extends AbstractTransaction {

	public AbstractQWPUT10401PETransaction(){
	}


	/**
	 * Return value for input parameter id-employed
	 */
	protected String getIdEmployed(){
		return (String)this.getParameter("id-employed");
	}
}
