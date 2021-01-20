package com.bbva.qwpu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.qwpu.dto.customers.DTOTransferencia;
import com.bbva.qwpu.lib.r200.QWPUR200;

/**
 * List by id Transfer
 * Implementacion de logica de negocio.
 * @author P028036
 *
 */
public class QWPUT21101PETransaction extends AbstractQWPUT21101PETransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger(QWPUT21101PETransaction.class);
	
	@Override
	public void execute() {
		LOGGER.info("[APX] Begin T211: Consulta Transfer by Id 		  : ");

		QWPUR200 qwpuR200 = getServiceLibrary(QWPUR200.class);
		LOGGER.info("[APX] Instancia QWPUR200	  : {}", qwpuR200);

		Long id = Long.valueOf(getPathParameter("id-transfer"));
		LOGGER.info("[APX] Transfer id 		  : {}", id);

		DTOTransferencia oTransfer = qwpuR200.executeGetTransfer(id);
		LOGGER.info("[APX] Respuesta Libreria : {}", oTransfer.toString());

		if (oTransfer.getIdTransfer() != null) {
			LOGGER.info("[APX] Success");
			this.setEntitytransfer(oTransfer);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
		} else {
			LOGGER.info("[APX] Not Success");
			this.addAdvice("10002000", "NO EXISTE INFORMACIÓN");
			this.setEntitytransfer(null);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_404, Severity.ENR);
		}
	}

}
