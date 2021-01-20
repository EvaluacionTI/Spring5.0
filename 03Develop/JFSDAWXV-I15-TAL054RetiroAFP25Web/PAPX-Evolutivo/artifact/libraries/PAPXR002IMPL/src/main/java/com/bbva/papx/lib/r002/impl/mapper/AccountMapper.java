package com.bbva.papx.lib.r002.impl.mapper;

import com.bbva.papx.dto.account.AccountDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Date;
import java.util.Map;

public class AccountMapper {
    private static final Logger LOG = LoggerFactory.getLogger("AccountMapper");

    public static AccountDTO mapper(Map<String, Object> input){
        AccountDTO oAccount = new AccountDTO();

        LOG.info("[APX-M1] Map   : {}", input.size());
        LOG.info("[APX-M2] Instance Account : {}", oAccount.toString());

        oAccount.setAccountId((String)input.get("ACCOUNT_ID"));
        oAccount.setFamilyName((String)input.get("FAMILY_NAME"));
        oAccount.setAccountType((String)input.get("ACCOUNT_TYPE"));
        oAccount.setAliasDesc((String)input.get("ALIAS_DESC"));
        oAccount.setAccountNumberId((String) input.get("ACCOUNT_NUMBER_ID"));
        oAccount.setOppeningDate((Date)input.get("OPENING_DATE"));
        oAccount.setStatusType((boolean)input.get("STATUS_TYPE"));
        oAccount.setTitleDesc((String)input.get("TITLE_DESC"));
        oAccount.setCurrencyName((String)input.get("CURRENCY_NAME"));
        oAccount.setCurrentBalanceAmount((double)input.get("CURRENT_BALANCE_AMOUNT"));
        oAccount.setPendingBalanceAmount((double)input.get("PENDING_BALANCE_AMOUNT"));
        oAccount.setPostedBalanceAmount((double)input.get("POSTED_BALANCE_AMOUNT"));
        oAccount.setRelatedContractId((String)input.get("RELATED_CONTRACT_ID"));
        oAccount.setAgreementId((String)input.get("AGREEMENT_ID"));

        LOG.info("[APX-M3] Account mapeado : {}", oAccount.toString());

        return oAccount;
    }
}
