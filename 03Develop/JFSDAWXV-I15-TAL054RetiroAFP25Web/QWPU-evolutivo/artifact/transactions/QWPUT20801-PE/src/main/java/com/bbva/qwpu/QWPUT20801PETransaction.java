package com.bbva.qwpu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.qwpu.dto.customers.CustomerDTO;
import com.bbva.qwpu.lib.r200.QWPUR200;

/**
 * Validar la conexion a Mongo
 * Implementacion de logica de negocio.
 * @author P028036
 *
 */
public class QWPUT20801PETransaction extends AbstractQWPUT20801PETransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger("QWPUT20801PETransaction");
	
	@Override
	public void execute() {
		QWPUR200 qwpuR200 = (QWPUR200)getServiceLibrary(QWPUR200.class);
        LOGGER.info("[APX] Begin T208: Validar conexion Mongo  : ");
        LOGGER.info("[APX] Instancia QWPUR200	  : {}", qwpuR200);

		String id = String.valueOf(this.getParameter("prefixDataBase"));
		LOGGER.info("[APX] PrefixDb 		  : {}", id);

		String resultConexion = qwpuR200.executeValidarDB(id);
		LOGGER.info("[APX] Respuesta Libreria : {}", resultConexion);

		if (resultConexion != null) {
			LOGGER.info("[APX] Success");
			this.setResultoperation(resultConexion);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
		} else {
			LOGGER.info("[APX] Not Success");
			this.setResultoperation(null);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_404, Severity.ENR);
		}
		
	}

}
