package com.bbva.papx;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.papx.dto.account.AccountDTO;
import com.bbva.papx.lib.r002.PAPXR002;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Creacion de cuenta
 *
 */
public class PAPXT00101PETransaction extends AbstractPAPXT00101PETransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(PAPXT00101PETransaction.class);

	@Override
	public void execute() {
		PAPXR002 papxR002 = getServiceLibrary(PAPXR002.class);
		LOGGER.info("[APX-1] Instancia PAPXR002  : {}", papxR002);

		AccountDTO oRequest = this.getEntityaccount();
		LOGGER.info("[APX-2] AccountDTO : {}", oRequest.toString());

		String idAccount = papxR002.executeCreateAccount(oRequest);
		LOGGER.info("[APX-3] idCustomer  : {}", idAccount);

		if (idAccount == null || !this.getAdviceList().isEmpty()) {
			LOGGER.info("[APX-4] Save Not Success id : {}", idAccount);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_400, Severity.ENR);
		} else {
			LOGGER.info("[APX-5] Save Success :{}", idAccount);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
		}
	}

}
