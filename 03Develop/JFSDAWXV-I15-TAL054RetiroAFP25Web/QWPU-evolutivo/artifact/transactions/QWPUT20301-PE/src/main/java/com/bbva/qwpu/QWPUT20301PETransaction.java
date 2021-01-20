package com.bbva.qwpu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.qwpu.dto.customers.CustomerDTO;
import com.bbva.qwpu.lib.r200.QWPUR200;

/**
 * Update customer
 * Implementacion de logica de negocio.
 * @author P028036
 *
 */
public class QWPUT20301PETransaction extends AbstractQWPUT20301PETransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger(QWPUT20301PETransaction.class);
	
	@Override
	public void execute() {
		QWPUR200 qwpuR200 = this.getServiceLibrary(QWPUR200.class);

		LOGGER.info("[APX-1] QWPUR200 Instance {}", qwpuR200);
		String id = this.getIdCustomer();

		LOGGER.info("[APX-2] customerId {}", id);
		CustomerDTO oCustomerDTO = this.getEntity();

		LOGGER.info("[APX-3] customer {}", oCustomerDTO.toString());
		Long iRpta = qwpuR200.executeUpdateCustomer(id, oCustomerDTO);

		LOGGER.info("[APX-4] iRpta {}", iRpta);
		if (iRpta!=0){
			LOGGER.info("[APX-5] Success");
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
		}else{
			LOGGER.info("[APX-6] Not Success");
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_404, Severity.WARN);
		}
	}

}
