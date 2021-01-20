package com.bbva.papx.lib.r002;

import com.bbva.papx.dto.account.AccountDTO;

import java.util.List;

public interface PAPXR002 {

	void execute();

	String executeCreateAccount(AccountDTO oRequest);
	AccountDTO executeGetAccount(String id);
	List<AccountDTO> executeGetAllAccount();
}
