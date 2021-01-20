package com.bbva.pglu;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.pglu.dto.customer.CustomerDTO;
import com.bbva.pglu.lib.r004.PGLUR004;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PGLUT00201PETransaction extends AbstractPGLUT00201PETransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(PGLUT00201PETransaction.class);

	@Override
	public void execute() {
		PGLUR004 pgluR004 = getServiceLibrary(PGLUR004.class);
		LOGGER.info("[APX-1] Instancia PGLUR004  : {}", pgluR004);

		CustomerDTO oRequest = this.getEntitysavecustomer();
		LOGGER.info("[APX-2] CustomerDTO : {}", oRequest.toString());

		String idCustomer = pgluR004.executeSaveCustomer(oRequest);
		LOGGER.info("[APX-3] idCustomer  : {}", idCustomer);

		if (idCustomer == null || !this.getAdviceList().isEmpty()) {
			LOGGER.info("[APX-4] Save Not Success id : {}", idCustomer);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_400, Severity.ENR);
		} else {
			LOGGER.info("[APX-5] Save Success :{}", idCustomer);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
		}
	}
}
