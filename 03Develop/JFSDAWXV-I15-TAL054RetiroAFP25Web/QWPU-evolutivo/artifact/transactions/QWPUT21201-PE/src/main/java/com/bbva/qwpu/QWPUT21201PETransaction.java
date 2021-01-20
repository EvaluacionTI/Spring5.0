package com.bbva.qwpu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.qwpu.dto.customers.DTOTransferencia;
import com.bbva.qwpu.lib.r200.QWPUR200;

/**
 * Save Transfer Implementacion de logica de negocio.
 * 
 * @author P028036
 *
 */
public class QWPUT21201PETransaction extends AbstractQWPUT21201PETransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger(QWPUT21201PETransaction.class);

	@Override
	public void execute() {
		LOGGER.info("[APX] Begin T212: Grabar Transfer   : ");

		QWPUR200 qwpuR200 = getServiceLibrary(QWPUR200.class);
		LOGGER.info("[APX] Instancia QWPUR200	  : {}", qwpuR200);

		DTOTransferencia oRequest = this.getEntitytransfer();
		LOGGER.info("[APX] DTOTransferencia  : {}", oRequest.toString());

		Long idTransfer = qwpuR200.executeSaveTransfer(oRequest);
		LOGGER.info("[APX] idTransfer  : {}", idTransfer);

		if (idTransfer == null || !this.getAdviceList().isEmpty()) {
			LOGGER.info("[APX] Save Not Success id : {}", idTransfer);
			this.addAdvice("10002000", "NO EXISTE INFORMACIÓN");
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_400, Severity.ENR);
		} else {
			LOGGER.info("[APX] Save Success :{}", idTransfer);
			DTOTransferencia oTransfer = new DTOTransferencia();
			oTransfer.setIdTransfer(idTransfer);
			//this.setEntity(oTransfer);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
		}
	}

}
