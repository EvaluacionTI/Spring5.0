package com.bbva.pglu;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.pglu.dto.customer.CustomerDTO;
import com.bbva.pglu.lib.r003.PGLUR003;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ASO Customer
 *
 */
public class PGLUT00801PETransaction extends AbstractPGLUT00801PETransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(PGLUT00801PETransaction.class);

	@Override
	public void execute() {
		PGLUR003 pgluR003 = getServiceLibrary(PGLUR003.class);
		LOGGER.debug("[APX-1] Instancia PGLUR003	  : {}", pgluR003);

		String customerId = this.getIdCustomer();
		LOGGER.info("[APX-2] customerId: {}", customerId);

		CustomerDTO aCustomer = pgluR003.executeListCustomerASO(customerId);
		LOGGER.info("[APX-3] DataOut customer: {}", aCustomer);

		if(aCustomer != null){
			this.setEntityout(aCustomer);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
		}else {
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_400, Severity.ENR);
		}
	}
}
