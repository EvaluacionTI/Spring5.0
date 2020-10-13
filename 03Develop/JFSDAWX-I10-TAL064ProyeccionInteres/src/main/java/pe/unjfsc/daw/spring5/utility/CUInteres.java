package pe.unjfsc.daw.spring5.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEConstant;
import pe.unjfsc.daw.spring5.entity.CEFormula;

public class CUInteres {
	private static final Logger LOG = LoggerFactory.getLogger("CUInteres");
	
	private CEFormula oCEResult;
	
	public CEFormula calcularFactor(CEFormula poCEFormula) {
		oCEResult = poCEFormula;
		double dFactor = (Math.pow(1+poCEFormula.getTasa(),poCEFormula.getPlazo() / CEConstant.BASE_CALCULO))-1;
		LOG.info("[EVL] Factor completo : {}", dFactor);
		
		oCEResult.setFactor(dFactor);
		dFactor = (Math.pow(1+poCEFormula.getTasa(),poCEFormula.getPlazoSinFeriado() / CEConstant.BASE_CALCULO))-1;
		LOG.info("[EVL] Factor sin feriado : {}", dFactor);
		oCEResult.setFactorSinFeriado(dFactor);
		LOG.info("[EVL] CEFormula : {}", oCEResult);
		
		return oCEResult; 
	}
	
	public double calculoInteres(double pdFactor, double pdCapital) {
		return pdFactor * pdCapital;
	}

	public void setoCEResult(CEFormula oCEResult) {
		this.oCEResult = oCEResult;
	}
}
