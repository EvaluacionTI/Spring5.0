package pe.unjfsc.daw.spring5.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEConstant;
import pe.unjfsc.daw.spring5.entity.CEFormula;

public class CUInteres {
	private static final Logger LOG = LoggerFactory.getLogger("CUInteres");
	
	private CEFormula oCEResult;
	
	public CEFormula calcularFactor(CEFormula poCEFormula) {
		
		double dFactor = (Math.pow(1+poCEFormula.getTasa(),poCEFormula.getPlazo() / CEConstant.BASE_CALCULO))-1;
		LOG.info("[EVL] Factor : {}", dFactor);
		oCEResult = poCEFormula;
		oCEResult.setFactor(dFactor);

		return oCEResult; 
	}

	public void setoCEResult(CEFormula oCEResult) {
		this.oCEResult = oCEResult;
	}
}
