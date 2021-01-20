package com.bbva.pglu;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.pglu.dto.customer.CustomerDTO;
import com.bbva.pglu.lib.r004.PGLUR004;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Upate Customer
 *
 */
public class PGLUT00401PETransaction extends AbstractPGLUT00401PETransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(PGLUT00401PETransaction.class);

	@Override
	public void execute() {
		PGLUR004 pgluR004 = getServiceLibrary(PGLUR004.class);
		LOGGER.info("[APX-1] Instancia PGLUR004	  : {}", pgluR004);

		CustomerDTO oCustomerDTO = this.getEntitycustomer();
		LOGGER.info("[APX-2] Customer	  : {}", oCustomerDTO.toString());

		String id = oCustomerDTO.getCustomerId();
		LOGGER.info("[APX-3] customerId	  : {}", id);

		Long iRpta = pgluR004.executeUpdateCustomer(id, oCustomerDTO);
		LOGGER.info("[APX-4] Rpta	  : {}", iRpta);
		if (iRpta!=0){
			LOGGER.info("[APX-5] Success");
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
		}else{
			LOGGER.info("[APX-6] Not Success");
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_404, Severity.WARN);
		}
	}

}
