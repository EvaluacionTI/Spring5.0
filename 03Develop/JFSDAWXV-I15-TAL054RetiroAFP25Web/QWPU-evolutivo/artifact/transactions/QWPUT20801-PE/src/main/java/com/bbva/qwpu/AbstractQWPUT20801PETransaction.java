package com.bbva.qwpu;


import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQWPUT20801PETransaction extends AbstractTransaction {

	public AbstractQWPUT20801PETransaction(){
	}
	/**
	 * Return value for input parameter prefixDataBase
	 */
	protected String getPrefixdatabase()
	{
		return (String)getParameter("prefixDataBase");
	}
	
	

	
	/**
	 * Set value for output parameter resultOperation
	 */
	protected void setResultoperation(final String field)
	{
		this.addParameter("resultOperation", field);
	}
	

}
