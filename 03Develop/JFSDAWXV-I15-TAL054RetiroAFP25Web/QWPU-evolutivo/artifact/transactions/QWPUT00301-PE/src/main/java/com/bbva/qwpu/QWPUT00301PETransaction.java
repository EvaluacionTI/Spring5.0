package com.bbva.qwpu;
import com.bbva.qwpu.lib.r000.QWPUR000;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.qwpu.dto.evolutivo.CECanalDTO;
import com.bbva.qwpu.lib.r000.QWPUR000;

/**
 * Actualizar un canal
 * Implementacion de logica de negocio.
 * @author P028036
 *
 */
public class QWPUT00301PETransaction extends AbstractQWPUT00301PETransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger(QWPUT00301PETransaction.class);
	
	@Override
	public void execute() {
		QWPUR000 qwpuR000 = getServiceLibrary(QWPUR000.class);

		CECanalDTO oRequest = this.getEntityin();
		int iIdentificador = Integer.parseInt(String.valueOf(getParameter("id-canal")));
		oRequest.setId(iIdentificador);
		
		LOGGER.info("[APX] Intancia QWPUR000 : {}", qwpuR000);
		LOGGER.info("[APX] CECanalDTO        : {}", oRequest);
		LOGGER.info("[APX] Identificador     : {}", iIdentificador);
		int iRpta = qwpuR000.executeUpdateCanal(oRequest);
		LOGGER.info("[APX] getAdviceList : {}", this.getAdvice());
		LOGGER.info("[APX] getAdviceList size : {}", this.getAdviceList().size());

		if (this.getAdviceList().isEmpty()){
			this.setSeverity(Severity.WARN);
			//this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_204);
			LOGGER.info(" [APX] Update register : {}", iRpta);
		}else{
			this.setSeverity(Severity.ENR);
			//this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_400);
			LOGGER.info("[APX] Noting register : {}", iRpta);
		}
	}

}
