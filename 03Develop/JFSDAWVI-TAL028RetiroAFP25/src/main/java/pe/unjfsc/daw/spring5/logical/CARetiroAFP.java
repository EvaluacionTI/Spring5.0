package pe.unjfsc.daw.spring5.logical;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEConstant;
import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;

public abstract class CARetiroAFP {
	private static final Logger LOG = LoggerFactory.getLogger("CARetiroAFP");
	
	public abstract double saldoDisponible(CESaldoAfiliado poCESaldo);

	protected double saldoWithBucle(double pSaldoCIC) {
		double dSaldoResult=0;
		
		if (pSaldoCIC <= CEConstant.UNO_UNIT) {
			LOG.info("[EVL] Hasta 1 UIT");
			dSaldoResult = pSaldoCIC;
		}else if(pSaldoCIC > CEConstant.UNO_UNIT && pSaldoCIC <= CEConstant.RANGO_17200 ) {
			LOG.info("[EVL] el 50% de la UIT en cada armada");
			dSaldoResult = CEConstant.UNO_UNIT;
		}else if (pSaldoCIC>CEConstant.RANGO_17200 && pSaldoCIC<=CEConstant.RANGO_51600) {
			LOG.info("[EVL] el 25% del saldo CIC");
			dSaldoResult = pSaldoCIC*CEConstant.PORCENTAJE_25;
		}else {
			LOG.info("[EVL] Hasta 3 UIT");
			dSaldoResult = CEConstant.TRES_UIT;
		}
		
		return dSaldoResult;
	}	
	
	public double[] listaSaldoBucleWhile(double[] paSaldoCIC) {
		double[] aResult = new double[100];
		
		LOG.info("[EVL] Iniciando WHILE");
		int item=0, item_ok=0;
		while (item<=paSaldoCIC.length-1) {
			if(paSaldoCIC[item]>0) {
				aResult[item_ok]=saldoWithBucle(paSaldoCIC[item]);
				item_ok ++;
			}
			item++;
		}
		return aResult;
	}

	public double[] listaSaldoBucleDoWhile(double[] paSaldoCIC) {
		double[] aResult = new double[100];
		double dSaldoRevisado = 0;
		
		LOG.info("[EVL] Iniciando DO WHILE");
		int item=0, item_ok=0;
		do {
			if(paSaldoCIC[item]>0) {
				dSaldoRevisado = saldoWithBucle(paSaldoCIC[item]);
				aResult[item_ok] = dSaldoRevisado;
				item_ok ++;
			}
			item++;
			dSaldoRevisado = 0;
		}while(item<paSaldoCIC.length-1);
		
		return aResult;
	}

	public double[] listaSaldoFor(double[] paSaldoCIC) {
		double[] aResult = new double[100];
		double dSaldoRevisado = 0;
		
		LOG.info("[EVL] Iniciando FOR");
		int item_ok=0;
		for (int item=0;item<paSaldoCIC.length;item++) {
			if(paSaldoCIC[item]>0) {
				dSaldoRevisado = saldoWithBucle(paSaldoCIC[item]);
				aResult[item_ok] = dSaldoRevisado;
				item_ok ++;
				dSaldoRevisado = 0;
			}
		}
		return aResult;
	}	
}
