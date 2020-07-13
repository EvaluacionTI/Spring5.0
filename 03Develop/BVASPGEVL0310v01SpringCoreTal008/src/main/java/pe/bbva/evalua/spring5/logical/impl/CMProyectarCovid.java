package pe.bbva.evalua.spring5.logical.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.bbva.evalua.spring5.entity.CEConstant;
import pe.bbva.evalua.spring5.entity.CECovid19;
import pe.bbva.evalua.spring5.logical.CICovid19;

public class CMProyectarCovid implements CICovid19{
	public static final Logger LOG = LoggerFactory.getLogger("CMProyectarCovid");
	
	CECovid19 oCECovid;
	
	@Override
	public CECovid19 proyectarCovid19() {
		oCECovid = new CECovid19();
		
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
