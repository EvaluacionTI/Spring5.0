package com.bbva.qwpu;


import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQWPUT21401PETransaction extends AbstractTransaction {

	public AbstractQWPUT21401PETransaction(){
	}
	/**
	 * Return value for input parameter id-Transfer
	 */
	protected Long getIdTransfer()
	{
		return (Long)getParameter("id-Transfer");
	}
	
	

	
	

}
