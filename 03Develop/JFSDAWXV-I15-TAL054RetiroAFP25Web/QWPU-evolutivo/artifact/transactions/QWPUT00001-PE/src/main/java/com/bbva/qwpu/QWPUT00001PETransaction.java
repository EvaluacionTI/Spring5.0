package com.bbva.qwpu;
import com.bbva.qwpu.lib.r000.QWPUR000;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.qwpu.dto.evolutivo.CECanalDTO;
import org.springframework.web.client.RestClientException;

public class QWPUT00001PETransaction extends AbstractQWPUT00001PETransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger(QWPUT00001PETransaction.class);
	
	@Override
	public void execute() {
		QWPUR000 qwpuR000 = getServiceLibrary(QWPUR000.class);
		LOGGER.info("[APX] Intancia QWPUR000 : {}", qwpuR000);
		List<CECanalDTO> oListaCanales = null;
		try {
			oListaCanales = qwpuR000.executeListAllCanal();
			LOGGER.info("[APX] : {}", oListaCanales.size());

			if (oListaCanales == null || oListaCanales.isEmpty()){
				this.setEntitylist(null);
				this.setSeverity(Severity.ENR);
				//this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_400, Severity.WARN);
			}else{
				this.setEntitylist(oListaCanales);
				this.setSeverity(Severity.OK);
				//this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
			}
		} catch (RestClientException e) {
			this.setSeverity(Severity.ERROR);
			LOGGER.debug("ParseException : {}", e.getMessage());
		}
	}
}