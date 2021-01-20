package com.bbva.papx;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.papx.dto.account.AccountDTO;

public abstract class AbstractPAPXT00101PETransaction extends AbstractTransaction {

	public AbstractPAPXT00101PETransaction(){
	}


	/**
	 * Return value for input parameter EntityAccount
	 */
	protected AccountDTO getEntityaccount(){
		return (AccountDTO)this.getParameter("EntityAccount");
	}
}
