package pe.bbva.evalua.spring5.logical;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.bbva.evalua.spring5.entity.CEConstant;
import pe.bbva.evalua.spring5.entity.CESaldoAfiliado;

public abstract class CARetiroAFP {
	public static final Logger LOG = LoggerFactory.getLogger("CARetiroAFP");
	
	public abstract double saldoDisponible(CESaldoAfiliado poCESaldo);
	
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
	
	public int getNumeroItem(double[] paSaldoCIC) {
		LOG.info("[EVL] Size Vector");
		int iResult = 0;
		for (int i=0;i<paSaldoCIC.length;i++) {
			if (paSaldoCIC[i] > 0 ) {
				iResult++;
			}
		}
		LOG.info("[EVL] Size paSaldoCIC : {} ", iResult);
		return iResult;
	}
	
	public double[] listaSaldoBucleWhile(double[] paSaldoCIC) {
		
		double dTestSaldo = 0;
		int iSizeVector = getNumeroItem(paSaldoCIC);
		double[] aResult = new double[iSizeVector];
		
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
