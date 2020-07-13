package pe.bbva.evalua.spring5.logical.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import pe.bbva.evalua.spring5.entity.CEConstant;
import pe.bbva.evalua.spring5.entity.CECovidAnotacion;
import pe.bbva.evalua.spring5.logical.CICovidAnotacion;

public class CMProyectarConvidAnotacion implements CICovidAnotacion {
	public static final Logger LOG = LoggerFactory.getLogger("CMProyectarConvidAnotacion");
	
	@Autowired
	CECovidAnotacion oCECovid;
	
	public CECovidAnotacion proyectarCovid19() {
		
		LOG.info("[EVL] Instancia CECovid19 : {} ", oCECovid);
		oCECovid.setDay(CEConstant.T_DAY);
		oCECovid.setFallecido(CEConstant.FALLECIDO_DAY * CEConstant.T_DAY);
		oCECovid.setNacimiento(CEConstant.NACIMIENTO_DAY*CEConstant.T_DAY);
		int iResult = (int) ((CEConstant.POBLACION*CEConstant.CONTAGIO/100));
		oCECovid.setContagio(iResult);

		LOG.info("[EVL] Objeto CECovid19 : {} ", oCECovid);
		
		return oCECovid;
	}

}
