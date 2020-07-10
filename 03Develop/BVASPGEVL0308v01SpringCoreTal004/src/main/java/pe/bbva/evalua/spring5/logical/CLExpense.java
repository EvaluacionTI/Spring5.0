package pe.bbva.evalua.spring5.logical;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import pe.bbva.evalua.spring5.entity.CEGasto;

public class CLExpense {
	private static final Logger LOG = LoggerFactory.getLogger("CLOrdenar");
	private static final double TASA_IGV = 0.18;

	@Autowired
	CEGasto oCEGasto;

	//calcular gasto = calculate expense
	public CEGasto calculateExpense(double pdBaseImponible) {

		LOG.info("[EVL] Instancia CEOrdenar :", oCEGasto);
		LOG.info("[EVL] Base imponible : {} :", pdBaseImponible);
		
		oCEGasto.setBaseImponible(pdBaseImponible);
		oCEGasto.setImpuesto(pdBaseImponible*TASA_IGV);
		oCEGasto.setTotalGasto(pdBaseImponible*(1+TASA_IGV));
		
		LOG.info("[EVL] Total gasto : {} :", oCEGasto.toString());
		
		return oCEGasto;
	}
}
