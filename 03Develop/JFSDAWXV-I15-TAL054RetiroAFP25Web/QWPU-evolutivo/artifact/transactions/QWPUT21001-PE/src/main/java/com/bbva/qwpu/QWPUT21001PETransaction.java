package com.bbva.qwpu;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.qwpu.dto.customers.DTOTransferencia;
import com.bbva.qwpu.lib.r200.QWPUR200;

/**
 * Lista All Transferencia
 * Implementacion de logica de negocio.
 * @author P028036
 *
 */
public class QWPUT21001PETransaction extends AbstractQWPUT21001PETransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger(QWPUT21001PETransaction.class);
	
	@Override
	public void execute() {
		LOGGER.info("[APX] Begin T210: Consulta Transfer All  : ");

		QWPUR200 qwpuR200 = getServiceLibrary(QWPUR200.class);
		LOGGER.info("[APX] Instancia QWPUR200	  : {}", qwpuR200);

		List<DTOTransferencia> oLista;
		oLista = qwpuR200.executeGetAllTransfer();
		LOGGER.info("[APX] List size 	  : {}", oLista.size());
		LOGGER.info("[APX] List stream 	  : {}", oLista.stream());

		if (oLista.isEmpty() || oLista.size() == 0) {
			LOGGER.info("[APX] Not Success");
			this.setListtransfer(null);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_404, Severity.WARN);
		} else {
			LOGGER.info("[APX] Success");
			this.setListtransfer(oLista);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
		}
	}

}
