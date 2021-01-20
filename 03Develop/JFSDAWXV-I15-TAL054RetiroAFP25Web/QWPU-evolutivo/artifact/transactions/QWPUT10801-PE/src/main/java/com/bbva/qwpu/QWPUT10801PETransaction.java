package com.bbva.qwpu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.qwpu.lib.r100.QWPUR100;

/**
 * Validar Conexion DB
 * Implementacion de logica de negocio.
 * @author P028036
 *
 */
public class QWPUT10801PETransaction extends AbstractQWPUT10801PETransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger("QWPUT10801PETransaction");
	
	@Override
	public void execute() {
		QWPUR100 qwpuR100 = (QWPUR100)getServiceLibrary(QWPUR100.class);

        LOGGER.info("[APX] Begin T108: Validar conexion Oracle  : ");
        LOGGER.info("[APX] Instancia QWPUR100	  : {}", qwpuR100);

		String id = String.valueOf(this.getParameter("prefixDataBase"));
		LOGGER.info("[APX] PrefixDb 		  : {}", id);

		String resultConexion = qwpuR100.executeValidarDB(id);
		LOGGER.info("[APX] Respuesta Libreria : {}", resultConexion);
		
		if (resultConexion != null) {
			LOGGER.info("[APX] Success");
			this.setResultdatabase(resultConexion);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
		} else {
			LOGGER.info("[APX] Not Success");
			this.setResultdatabase(null);
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_404, Severity.ENR);
		}
	}
}
