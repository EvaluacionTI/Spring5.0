package com.bbva.qwpu;

import java.util.List;
import com.bbva.qwpu.dto.employed.CEEmployedDTO;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQWPUT10501PETransaction extends AbstractTransaction {

	public AbstractQWPUT10501PETransaction(){
	}
	/**
	 * Return value for input parameter pageSize
	 */
	protected Long getPagesize()
	{
		return (Long)getParameter("pageSize");
	}
	/**
	 * Return value for input parameter paginationKey
	 */
	protected Long getPaginationkey()
	{
		return (Long)getParameter("paginationKey");
	}
	
	

	
	

	/**
	 * Set value for output parameter ListEmployed
	 */
	protected void setListemployed(final List<CEEmployedDTO> field){
		this.addParameter("ListEmployed", field);
	}			
	
}
