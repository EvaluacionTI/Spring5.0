package com.bbva.qwpu;

import com.bbva.qwpu.dto.customers.DTOTransferencia;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractQWPUT21301PETransaction extends AbstractTransaction {

	public AbstractQWPUT21301PETransaction(){
	}
	/**
	 * Return value for input parameter id-transfer
	 */
	protected Long getIdTransfer()
	{
		return (Long)getParameter("id-transfer");
	}
	
	

	/**
	 * Return value for input parameter EntityTransfer
	 */
	protected DTOTransferencia getEntitytransfer(){
		return (DTOTransferencia)getParameter("EntityTransfer");
	}
	
	
	

}
