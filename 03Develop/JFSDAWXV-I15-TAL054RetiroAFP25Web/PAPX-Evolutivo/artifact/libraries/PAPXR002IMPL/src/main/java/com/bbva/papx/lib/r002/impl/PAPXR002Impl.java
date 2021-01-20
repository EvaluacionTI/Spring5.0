package com.bbva.papx.lib.r002.impl;

import com.bbva.papx.dto.account.AccountDTO;
import com.bbva.papx.lib.r002.impl.mapper.AccountMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.NoResultException;
import java.util.List;
import java.util.Map;

import static com.bbva.papx.dto.account.AccountConst.SQL_INSERT;
import static com.bbva.papx.dto.account.AccountConst.ERR_EXISTE_DATA;
import static com.bbva.papx.dto.account.AccountConst.ERR_PARAMETERS_OK;
import static com.bbva.papx.dto.account.AccountConst.SQL_SELECT_BY;
import static com.bbva.papx.dto.account.AccountConst.SQL_SELECT_ALL;

public class PAPXR002Impl extends PAPXR002Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(PAPXR002Impl.class);

	@Override
	public void execute() {
		// TODO - Implementation of business logic
	}

	@Override
	public String executeCreateAccount(AccountDTO oRequest) {

		LOGGER.info("[APX-R1] data account : {}", oRequest);
		int iResultSQL = 0;

		if (oRequest.getAccountId()!=null){
			Map<String, Object> oRequestSQL = null;
			oRequestSQL.put("ACCOUNT_ID", oRequest.getAccountId());
			oRequestSQL.put("ACCOUNT_NUMBER_ID", oRequest.getAccountNumberId());
			oRequestSQL.put("ACCOUNT_TYPE", oRequest.getAccountType());
			oRequestSQL.put("CURRENCY_NAME", oRequest.getCurrencyName());
			LOGGER.info("[APX-R2] Map Save Record : {}", oRequestSQL);

			try{
				LOGGER.info("[APX-R3] Access jdbcUtils ");
				iResultSQL = this.jdbcUtils.update(SQL_INSERT, oRequestSQL);
			}catch (NoResultException ex){
				LOGGER.error(String.format("[APX-R4] Error executeCreateAccount : {}", ex.getMessage()));
				this.addAdvice(ERR_EXISTE_DATA);
			}
		}else{
			LOGGER.info("[APX-R5] Error entrada: {}");
			this.addAdvice(ERR_PARAMETERS_OK);
		}
		LOGGER.info("[APX-R6] Result : {}", iResultSQL);
		return String.valueOf(iResultSQL);
	}

	@Override
	public AccountDTO executeGetAccount(String id) {
		LOGGER.info("[APX-R1] executeGetEmployed...: {}", id);
		List<Map<String, Object>> oResultSQL = null;
		AccountDTO oAccount = null;

		oResultSQL = this.jdbcUtils.queryForList(SQL_SELECT_BY, id);
		LOGGER.info("[APX-R2] Record Result : {}", oResultSQL.toArray());

		if (!oResultSQL.equals(null)) {
			if (oResultSQL.iterator().hasNext()) {
				oAccount = AccountMapper.mapper(oResultSQL.iterator().next());
			}
		}
		LOGGER.info("[APX-R3] Record size : {}", oResultSQL.size());
		LOGGER.info("[APX-R4] Account     : {}", oAccount.toString());

		return oAccount;
	}

	@Override
	public List<AccountDTO> executeGetAllAccount() {
		LOGGER.info("[APX-R1] executeGetAllEmployed...");
		List<Map<String, Object>> oResultSQL = null;
		List<AccountDTO> oListEmployed = null;

		oResultSQL = this.jdbcUtils.queryForList(SQL_SELECT_ALL);
		LOGGER.info("[APX-R2] Record Result : {}", oResultSQL.toArray());

		for (Map<String, Object> oDTOAccount : oResultSQL) {
			oListEmployed.add(AccountMapper.mapper(oDTOAccount));
		}

		LOGGER.info("[APX-R3] Object oResultSQL : {}", oResultSQL.size());
		LOGGER.info("[APX-R4] Object oListEmployed : {}",oListEmployed.size());

		return oListEmployed;
	}
}
