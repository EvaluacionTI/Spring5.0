package com.bbva.papx;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.papx.dto.account.AccountDTO;
import java.util.List;

public abstract class AbstractPAPXT00601PETransaction extends AbstractTransaction {

	public AbstractPAPXT00601PETransaction(){
	}


	/**
	 * Set value for List<AccountDTO> output parameter EntityListAccount
	 */
	protected void setEntitylistaccount(final List<AccountDTO> field){
		this.addParameter("EntityListAccount", field);
	}
}
