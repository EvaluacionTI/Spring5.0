package com.bbva.qwpu;

import java.util.List;

import com.bbva.qwpu.dto.customers.CustomerDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.qwpu.lib.r200.QWPUR200;

public class QWPUT20001PETransaction extends AbstractQWPUT20001PETransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger(QWPUT20001PETransaction.class);

	@Override
	public void execute() {

		QWPUR200 qwpuR200 = getServiceLibrary(QWPUR200.class);
		LOGGER.info("[APX-1] Instancia QWPUR200	  : {}", qwpuR200);

		List<CustomerDTO> oLista;
		oLista = qwpuR200.executeGetAllCustomer();
		LOGGER.info("[APX-2] List size        : {}", oLista.size());
		LOGGER.info("[APX-3] List stream      : {}", oLista.stream());

		if (oLista.isEmpty() || oLista.size() == 0) {
			LOGGER.info("[APX-4] Not Success");
			this.setEntitylist(null);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_404, Severity.WARN);
		} else {
			LOGGER.info("[APX-5] Success");
			this.setEntitylist(oLista);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
		}
	}

}
