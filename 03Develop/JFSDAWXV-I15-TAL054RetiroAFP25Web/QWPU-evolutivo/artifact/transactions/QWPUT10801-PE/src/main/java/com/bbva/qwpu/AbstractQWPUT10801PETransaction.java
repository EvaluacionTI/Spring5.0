package com.bbva.qwpu;


import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQWPUT10801PETransaction extends AbstractTransaction {

	public AbstractQWPUT10801PETransaction(){
	}
	/**
	 * Return value for input parameter prefixDataBase
	 */
	protected String getPrefixdatabase()
	{
		return (String)getParameter("prefixDataBase");
	}
	
	

	
	/**
	 * Set value for output parameter resultDataBase
	 */
	protected void setResultdatabase(final String field)
	{
		this.addParameter("resultDataBase", field);
	}
	

}
