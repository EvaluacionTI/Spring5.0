package com.bbva.qwpu;

import com.bbva.qwpu.lib.r000.QWPUR000;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.qwpu.dto.evolutivo.CECanalDTO;

/**
 * Transaccion Path param
 * Implementacion de logica de negocio.
 * @author P028036
 *
 */
public class QWPUT00501PETransaction extends AbstractQWPUT00501PETransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger(QWPUT00501PETransaction.class);
	@Override
	public void execute() {
		QWPUR000 qwpuR000 = getServiceLibrary(QWPUR000.class);
		LOGGER.info("[APX] Start QWPUT005...");
		
		LOGGER.info("[APX] Intancia QWPUR000 : {}", qwpuR000);
		
		Long idCanalLong = this.getIdCanal();
		Integer idCanal = idCanalLong == null ? null : Math.toIntExact(idCanalLong);
		LOGGER.info("[APX] Long idCanalLong : {}", idCanalLong);
		LOGGER.info("[APX] Integer idCanal : {}", idCanal);
		
	//	CECanalDTO oCECanal = qwpuR000.executeEncriptar(idCanal);
	//	LOGGER.info("[APX] Result CECanalDTO : {}", oCECanal.toString());
		
		if(this.getAdviceList().isEmpty()){
			LOGGER.info("[APX][TX] Set Response Ok");
	//		this.setEntityksmk(oCECanal);
	//		this.setHttpResponseCode(oCECanal == null ? HttpResponseCode.HTTP_CODE_204: HttpResponseCode.HTTP_CODE_200, Severity.OK);
		}else {
			LOGGER.info("[APX][TX] Set Response Error");
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_400, Severity.ENR);
		}
	}

}
