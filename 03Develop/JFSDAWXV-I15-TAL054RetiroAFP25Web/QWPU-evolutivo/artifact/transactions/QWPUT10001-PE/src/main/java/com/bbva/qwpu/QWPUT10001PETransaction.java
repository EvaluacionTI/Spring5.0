package com.bbva.qwpu;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.qwpu.dto.employed.CEEmployedDTO;
import com.bbva.qwpu.lib.r100.QWPUR100;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * List all employed with jdbc
 * Implementacion de logica de negocio.
 * @author user
 *
 */
public class QWPUT10001PETransaction extends AbstractQWPUT10001PETransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger("QWPUT10001PETransaction");

	@Override
	public void execute() {
		LOGGER.info("[APX] Begin T100: Consulta Customer All  : ");

		QWPUR100 qwpuR100 = getServiceLibrary(QWPUR100.class);
		LOGGER.info("[APX] Instancia QWPUR100	  : {}", qwpuR100);

		List<CEEmployedDTO> oLista;
		oLista = qwpuR100.executeGetAllEmployed();
		LOGGER.info("[APX] List size        : {}", oLista.size());
		LOGGER.info("[APX] List stream      : {}", oLista.stream());

		if (oLista.isEmpty() || oLista.size() == 0) {
			LOGGER.info("[APX] Not Success");
			this.setEntitylist(null);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_404, Severity.WARN);
		} else {
			LOGGER.info("[APX] Success");
			this.setEntitylist(oLista);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
		}
	}

}
