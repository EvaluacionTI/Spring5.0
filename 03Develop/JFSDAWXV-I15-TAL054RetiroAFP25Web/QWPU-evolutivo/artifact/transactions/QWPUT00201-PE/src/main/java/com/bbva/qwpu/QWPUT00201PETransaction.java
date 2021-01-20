package com.bbva.qwpu;

import com.bbva.qwpu.lib.r000.QWPUR000;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.qwpu.dto.evolutivo.CECanalDTO;
import org.springframework.web.client.RestClientException;

public class QWPUT00201PETransaction extends AbstractQWPUT00201PETransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger(QWPUT00201PETransaction.class);

	@Override
	public void execute() {
		QWPUR000 qwpuR000 = getServiceLibrary(QWPUR000.class);
		LOGGER.info("[APX] Intancia QWPUR000 : {}", qwpuR000);

		try {
			LOGGER.info("[APX] getEntityin()        : {}", this.getEntityin());
			CECanalDTO oRequest = this.getEntityin();

			if (oRequest.equals(null)) {
				this.addAdvice("Objeto en null");
				this.setSeverity(Severity.WARN);
				LOGGER.info("[APX] Not Save register : {}", oRequest);
			} else {
				LOGGER.info("[APX] CECanalDTO        : {}}", oRequest);
				int lRpta = qwpuR000.executeSaveCanal(oRequest);
				if (lRpta != 0) {
					this.setSeverity(Severity.OK);
					//this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_201, Severity.OK);
					LOGGER.info("[APX] Save register : {}", lRpta);
				} else {
					this.setSeverity(Severity.WARN);
					//this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_400, Severity.ERROR);
					LOGGER.info("[APX] Not Save register : {}", lRpta);
				}
			}
		} catch (RestClientException ex) {
			this.setSeverity(Severity.ERROR);
		}
	}
}
