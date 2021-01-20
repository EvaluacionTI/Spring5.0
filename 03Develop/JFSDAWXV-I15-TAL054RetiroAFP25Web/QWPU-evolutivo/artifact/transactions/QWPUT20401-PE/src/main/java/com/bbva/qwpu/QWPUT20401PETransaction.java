package com.bbva.qwpu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.qwpu.lib.r200.QWPUR200;

/**
 * Delete Customer by id
 * Implementacion de logica de negocio.
 * @author P028036
 *
 */
public class QWPUT20401PETransaction extends AbstractQWPUT20401PETransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger(QWPUT20401PETransaction.class);
	
	@Override
	public void execute() {

		QWPUR200 qwpuR200 = this.getServiceLibrary(QWPUR200.class);
		LOGGER.info("[APX-1] QWPUR200 Instance {}", qwpuR200);

		String id = String.valueOf(this.getParameter("id-customer"));
		LOGGER.info("[APX-2] customerId {}", id);

		Long iRpta = qwpuR200.executeDeleteCustomer(id);
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
