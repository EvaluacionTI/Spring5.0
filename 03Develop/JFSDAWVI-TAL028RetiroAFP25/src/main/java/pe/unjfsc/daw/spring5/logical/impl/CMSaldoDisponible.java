package pe.unjfsc.daw.spring5.logical.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEConstant;
import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;
import pe.unjfsc.daw.spring5.logical.CARetiroAFP;

public class CMSaldoDisponible extends CARetiroAFP {
	private static final Logger LOG = LoggerFactory.getLogger("CMSaldoDisponible");
	
	@Override
	public double saldoDisponible(CESaldoAfiliado poCESaldo) {
		double dSaldoResult=0;
		
		if (poCESaldo.getSaldoCIC() <= CEConstant.UNO_UNIT) {
			LOG.info("[EVL] Hasta 1 UIT");
			dSaldoResult = poCESaldo.getSaldoCIC();
		}else if(poCESaldo.getSaldoCIC() > CEConstant.UNO_UNIT && poCESaldo.getSaldoCIC() <= CEConstant.RANGO_17200 ) {
			LOG.info("[EVL] el 50% de la UIT en cada armada");
			dSaldoResult = CEConstant.UNO_UNIT;
		}else if (poCESaldo.getSaldoCIC()>CEConstant.RANGO_17200 && poCESaldo.getSaldoCIC()<=CEConstant.RANGO_51600) {
			LOG.info("[EVL] el 25% del saldo CIC");
			dSaldoResult = poCESaldo.getSaldoCIC()*CEConstant.PORCENTAJE_25;
		}else {
			LOG.info("[EVL] Hasta 3 UIT");
			dSaldoResult = CEConstant.TRES_UIT;
		}
		return dSaldoResult;
	}

}
