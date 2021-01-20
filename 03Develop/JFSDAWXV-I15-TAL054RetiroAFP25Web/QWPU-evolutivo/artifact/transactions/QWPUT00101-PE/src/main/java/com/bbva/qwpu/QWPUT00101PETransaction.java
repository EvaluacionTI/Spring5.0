package com.bbva.qwpu;

import com.bbva.qwpu.lib.r000.QWPUR000;
import com.bbva.elara.domain.transaction.Severity;
import com.bbva.qwpu.dto.evolutivo.CECanalDTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestClientException;

public class QWPUT00101PETransaction extends AbstractQWPUT00101PETransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger(QWPUT00101PETransaction.class);

	@Override
	public void execute() {
		QWPUR000 qwpuR000 = getServiceLibrary(QWPUR000.class);
		int iIdentificador = Integer.parseInt(String.valueOf(getParameter("id-canal")));

		try{
			LOGGER.info("[APX] Intancia QWPUR000 : {}", qwpuR000);
			LOGGER.info("[APX] iIdentificador    : {}", iIdentificador);
			CECanalDTO oCEAuxCanal = new CECanalDTO();

			oCEAuxCanal = qwpuR000.executeListByIdCanal(iIdentificador);
			LOGGER.info("[APX] registro : {}", oCEAuxCanal.toString());

			if (oCEAuxCanal.getCodigo() == null || oCEAuxCanal.equals(null)) {
				this.setEntityout(null);
				this.setSeverity(Severity.WARN);
				//this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_400, Severity.WARN);
			} else {
				this.setEntityout(oCEAuxCanal);
				this.setSeverity(Severity.OK);
				//this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
			}
		}catch(RestClientException ex){
			this.setSeverity(Severity.ERROR);
		}

	}

}
