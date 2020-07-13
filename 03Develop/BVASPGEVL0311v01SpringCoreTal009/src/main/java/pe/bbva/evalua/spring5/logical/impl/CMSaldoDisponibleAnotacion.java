package pe.bbva.evalua.spring5.logical.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.bbva.evalua.spring5.entity.CEConstant;
import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoAnotacion;
import pe.bbva.evalua.spring5.logical.CIRetiroAFPAnotacion;

public class CMSaldoDisponibleAnotacion implements CIRetiroAFPAnotacion{
	public static final Logger LOG = LoggerFactory.getLogger("CMSaldoDisponibleAnotacion");
	
	@Override
	public double saldoDisponible(CESaldoAfiliadoAnotacion poCESaldo) {
		double iSaldoResult;
		
		if (poCESaldo.getSaldoCIC() <= CEConstant.UNO_UIT) {
			LOG.info("[EVL] HASTA 1 UIT");
			iSaldoResult = poCESaldo.getSaldoCIC();
		}else if(poCESaldo.getSaldoCIC() > CEConstant.UNO_UIT && poCESaldo.getSaldoCIC() <= CEConstant.RANGO_17200) {
			LOG.info("[EVL] UIT al 50% cada armada");
			iSaldoResult = CEConstant.UNO_UIT;
		}else if(poCESaldo.getSaldoCIC() > CEConstant.RANGO_17200 && poCESaldo.getSaldoCIC() <= CEConstant.RANGO_51600) {
			LOG.info("[EVL] 25% del saldo CIC");
			iSaldoResult = poCESaldo.getSaldoCIC()*CEConstant.PORCENTAJE_25;
		}else {
			LOG.info("[EVL] HASTA 3 UIT");
			iSaldoResult = CEConstant.TRES_UIT;
		}
		return iSaldoResult;
	}

}
