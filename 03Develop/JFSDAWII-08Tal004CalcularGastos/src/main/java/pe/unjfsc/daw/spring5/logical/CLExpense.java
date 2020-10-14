package pe.unjfsc.daw.spring5.logical;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import pe.unjfsc.daw.spring5.entity.CEGasto;

public class CLExpense {
	private static final Logger LOG = LoggerFactory.getLogger("CLExpense"); 
	private static final double TASA_IGV = 0.18;
	
	@Autowired
	CEGasto oCEGasto;
	
	public CEGasto calcularGasto(double pBaseImponible) {
		LOG.info("[DAW] instancia CEGasto :{}", oCEGasto);
		
		LOG.info("[DAW] Base imponible input , {}", pBaseImponible);
		oCEGasto.setBaseImponible(pBaseImponible);
		oCEGasto.setImpuesto(pBaseImponible * TASA_IGV);
		oCEGasto.setTotalGasto(pBaseImponible*(1+TASA_IGV));
		
		LOG.info("[DAW] Objeto actualizado , {}", oCEGasto);
		return oCEGasto;
	}

	
	public CEGasto calcularGastoXml(double pBaseImponible) {
		CEGasto oGasto = new CEGasto();
		LOG.info("[DAW] instancia CEGasto :{}", oGasto);
		
		LOG.info("[DAW] Base imponible input , {}", pBaseImponible);
		oGasto.setBaseImponible(pBaseImponible);
		oGasto.setImpuesto(pBaseImponible * TASA_IGV);
		oGasto.setTotalGasto(pBaseImponible*(1+TASA_IGV));
		
		LOG.info("[DAW] Objeto actualizado , {}", oGasto);
		return oGasto;
	}
}
