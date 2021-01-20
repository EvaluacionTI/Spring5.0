package com.bbva.qwpu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.qwpu.dto.customers.DTOTransferencia;
import com.bbva.qwpu.lib.r200.QWPUR200;

/**
 * Update Transfer
 * Implementacion de logica de negocio.
 * @author P028036
 *
 */
public class QWPUT21301PETransaction extends AbstractQWPUT21301PETransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger(QWPUT21301PETransaction.class);
	
	@Override
	public void execute() {
		LOGGER.info("[APX] Begin T213: Actualizar Transfer   : ");

		QWPUR200 qwpuR200 = getServiceLibrary(QWPUR200.class);
		LOGGER.info("[APX] Instancia QWPUR200	  : {}", qwpuR200);

		Long id = Long.parseLong(getPathParameter("id-transfer"));
		LOGGER.info("[APX] Transfer id 		  : {}", id);

		DTOTransferencia oRequest = this.getEntitytransfer();
		LOGGER.info("[APX] Transfer  		  : {}", oRequest.toString());

		Long iRpta = qwpuR200.executeUpdateTransfer(id, oRequest);
		LOGGER.info("[APX] Rpta  : {}", iRpta);

		if (iRpta!=0){
			LOGGER.info("[APX] Success");
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
		}else{
			LOGGER.info("[APX] Not Success");
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_404, Severity.WARN);
		}
	}

}
