package pe.bbva.evalua.spring5.logical.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.bbva.evalua.spring5.entity.CEConstant;
import pe.bbva.evalua.spring5.entity.CESaldoAfiliado;
import pe.bbva.evalua.spring5.logical.CIRetiroAFP;

public class CMSaldoDisponible implements CIRetiroAFP {
	public static final Logger LOG = LoggerFactory.getLogger("CMSaldoDisponible");
	
	@Override
	public double saldoDisponible(CESaldoAfiliado poCESaldo) {
		double iSaldoResult = 0;
		
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
	
	protected double saldoWithBucle(double pSaldoCIC) {
		double iSaldoResult = 0;

		if (pSaldoCIC <= CEConstant.UNO_UIT) {
			LOG.info("[EVL] HASTA 1 UIT");
			iSaldoResult = pSaldoCIC;
		}else if(pSaldoCIC > CEConstant.UNO_UIT && pSaldoCIC <= CEConstant.RANGO_17200) {
			LOG.info("[EVL] UIT al 50% cada armada");
			iSaldoResult = CEConstant.UNO_UIT;
		}else if(pSaldoCIC > CEConstant.RANGO_17200 && pSaldoCIC <= CEConstant.RANGO_51600) {
			LOG.info("[EVL] 25% del saldo CIC");
			iSaldoResult = pSaldoCIC*CEConstant.PORCENTAJE_25;
		}else {
			LOG.info("[EVL] HASTA 3 UIT");
			iSaldoResult = CEConstant.TRES_UIT;
		}
		return iSaldoResult;
	}
	
	@Override
	public double[] listaSaldoBucleWhile(double[] paSaldoCIC) {
		double[] aResult = new double[100];
		double dTestSaldo = 0;
		
		LOG.info("[EVL] Iniciando proceso While");
		int item = 0, item_ok=0;
		while (item <= paSaldoCIC.length-1) {
			if (paSaldoCIC[item] > 0 ) {
				dTestSaldo = saldoWithBucle(paSaldoCIC[item]);
				aResult[item_ok] = dTestSaldo;
				item_ok ++;
				dTestSaldo = 0;
			}
			item++;
		}
		return aResult;
	}
	
	@Override
	public double[] listaSaldoBucleDoWhile(double[] paSaldoCIC) {
		double[] aResult = new double[100];
		double dTestSaldo = 0;
		
		LOG.info("[EVL] Iniciando proceso Do While");
		int item = 0, item_ok=0;
		do {
			if (paSaldoCIC[item] > 0 ) {
				dTestSaldo = saldoWithBucle(paSaldoCIC[item]);
				aResult[item_ok] = dTestSaldo;
				item_ok ++;
			}
			item++;
			dTestSaldo=0;
		}while(item < paSaldoCIC.length-1);

		return aResult;
	}
	
	@Override
	public double[] listaSaldoFor(double[] paSaldoCIC) {
		double[] aResult = new double[100];
		double dTestSaldo = 0;
		
		LOG.info("[EVL] Iniciando proceso FOR");
		int item_ok=0;
		for (int item=0;item<paSaldoCIC.length;item++) {
			if (paSaldoCIC[item] > 0 ) {
				dTestSaldo = saldoWithBucle(paSaldoCIC[item]);
				aResult[item_ok] = dTestSaldo;
				item_ok ++;
				dTestSaldo=0;
			}
		}
		return aResult;
	}
}
