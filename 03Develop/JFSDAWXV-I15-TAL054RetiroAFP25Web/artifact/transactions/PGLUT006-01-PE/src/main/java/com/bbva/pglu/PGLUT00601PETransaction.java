package com.bbva.pglu;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.pglu.dto.customer.CustomerDTO;
import com.bbva.pglu.dto.customer.ParameterException;
import com.bbva.pglu.lib.r004.PGLUR004;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class PGLUT00601PETransaction extends AbstractPGLUT00601PETransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(PGLUT00601PETransaction.class);

	@Override
	public void execute() {
		PGLUR004 pgluR004 = getServiceLibrary(PGLUR004.class);
		LOGGER.info("[APX-1] Instancia PGLUR004	  : {}", pgluR004);

		List<CustomerDTO> oLista;
		String sLastName = this.getLastname();
		LOGGER.info("[APX-1] Parameter sLastName	  : {}", sLastName);
		if(!StringUtils.isAlpha(sLastName)){
			throw new ParameterException("PGLU10000000", "lastName");
		}

		oLista = pgluR004.executeFindCustomerByName(sLastName);
		LOGGER.info("[APX-2] List size        : {}", oLista.size());
		LOGGER.info("[APX-3] List stream      : {}", oLista.stream());

		if (oLista.isEmpty() || oLista.size() == 0) {
			LOGGER.info("[APX-4] Not Success");
			this.setListentitycustomer(null);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_404, Severity.WARN);
		} else {
			LOGGER.info("[APX-5] Success");
			this.setListentitycustomer(oLista);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
		}
	}
}
