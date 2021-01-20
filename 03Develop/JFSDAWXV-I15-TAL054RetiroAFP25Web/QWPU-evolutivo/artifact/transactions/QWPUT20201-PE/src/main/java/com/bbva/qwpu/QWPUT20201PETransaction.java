package com.bbva.qwpu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.qwpu.dto.customers.CustomerDTO;
import com.bbva.qwpu.lib.r200.QWPUR200;

/**
 * Save Customer
 * Implementacion de logica de negocio.
 * @author P028036
 *
 */
public class QWPUT20201PETransaction extends AbstractQWPUT20201PETransaction {
	public static final Logger LOGGER = LoggerFactory.getLogger(QWPUT20201PETransaction.class);
	
	@Override
	public void execute() {
		QWPUR200 qwpuR200 = (QWPUR200)getServiceLibrary(QWPUR200.class);
		LOGGER.info("[APX] Iniciando save");

		CustomerDTO oRequest = this.getEntity();
		String idCustomer = qwpuR200.executeSaveCustomer(oRequest);

		LOGGER.info("[APX] Instancia   : {}", qwpuR200);
		LOGGER.info("[APX] CustomerDTO : {}", oRequest.toString());
		LOGGER.info("[APX] idCustomer  : {}", idCustomer);

		if (idCustomer == null || !this.getAdviceList().isEmpty()) {
			LOGGER.info("[APX] Save Not Success id : {}", idCustomer);
			//this.setEntity(null);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_400, Severity.ENR);
		} else {
			LOGGER.info("[APX] Save Success :{}", idCustomer);
			CustomerDTO oCliente = new CustomerDTO();
			oCliente.setId(idCustomer);
			//this.setEntity(oCliente);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
		}
	}

}
