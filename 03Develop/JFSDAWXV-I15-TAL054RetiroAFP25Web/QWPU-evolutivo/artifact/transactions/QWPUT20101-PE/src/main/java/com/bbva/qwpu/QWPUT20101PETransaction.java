package com.bbva.qwpu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.qwpu.dto.customers.CustomerDTO;
import com.bbva.qwpu.lib.r200.QWPUR200;

/**
 * List by id customer
 * Implementacion de logica de negocio.
 * @author P028036
 *
 */
public class QWPUT20101PETransaction extends AbstractQWPUT20101PETransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger(QWPUT20101PETransaction.class);
	
	@Override
	public void execute() {
		QWPUR200 qwpuR200 = getServiceLibrary(QWPUR200.class);
        LOGGER.info("[APX-1] Instancia QWPUR200	  : {}", qwpuR200);

		String id = String.valueOf(this.getParameter("id-customer"));
		LOGGER.info("[APX] customer id 		  : {}", id);

		CustomerDTO customer = qwpuR200.executeGetCustomer(id);
		LOGGER.info("[APX] Respuesta Libreria : {}", customer.toString());

		if (customer.getId() != null) {
			LOGGER.info("[APX] Success");
			this.setEntity(customer);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
		} else {
			LOGGER.info("[APX] Not Success");
			this.setEntity(null);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_404, Severity.ENR);
		}
	}

}
