package com.bbva.papx;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.papx.dto.account.AccountDTO;
import com.bbva.papx.lib.r002.PAPXR002;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * List All Account
 *
 */
public class PAPXT00601PETransaction extends AbstractPAPXT00601PETransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(PAPXT00601PETransaction.class);

	@Override
	public void execute() {
		PAPXR002 papxR002 = getServiceLibrary(PAPXR002.class);
		LOGGER.info("[APX-1] Instancia PGLUR004	  : {}", papxR002);

		List<AccountDTO> oLista;
		oLista = papxR002.executeGetAllAccount();
		LOGGER.info("[APX-2] List size        : {}", oLista.size());
		LOGGER.info("[APX-3] List stream      : {}", oLista.stream());

		if (oLista.isEmpty() || oLista.size() == 0) {
			LOGGER.info("[APX-4] Not Success");
			this.setEntitylistaccount(null);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_404, Severity.WARN);
		} else {
			LOGGER.info("[APX-5] Success");
			this.setEntitylistaccount(oLista);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
		}
	}

}
