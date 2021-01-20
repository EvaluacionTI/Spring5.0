package com.bbva.pglu;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.pglu.lib.r004.PGLUR004;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Delete Customer
 *
 */
public class PGLUT00501PETransaction extends AbstractPGLUT00501PETransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(PGLUT00501PETransaction.class);

	@Override
	public void execute() {
		PGLUR004 pgluR004 = getServiceLibrary(PGLUR004.class);
		LOGGER.info("[APX-1] PGLUR004 Instance {}", pgluR004);

		String id = String.valueOf(this.getParameter("id-customer"));
		LOGGER.info("[APX-2] customerId {}", id);

		Long iRpta = pgluR004.executeDeleteCustomer(id);
		LOGGER.info("[APX-3] iRpta {}", iRpta);
		if (iRpta!=0){
			LOGGER.info("[APX-4] Success");
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
		}else{
			LOGGER.info("[APX-5] Not Success");
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_404, Severity.WARN);
		}
	}

}
