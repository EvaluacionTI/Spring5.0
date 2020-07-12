package pe.bbva.evalua.spring5.logical;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CLCalcularVenta {
	private static final Logger LOG = LoggerFactory.getLogger("CLCalcularVenta");
	
	private static final double DSCTO_10 = 0.1;
	private static final double DSCTO_20 = 0.2;
	private static final double DSCTO_30 = 0.3;
	
	public double descuento(double pdVentaTotal) {
		
		LOG.info("[EVL] Total venta individual : {}", pdVentaTotal);
		double montoDescuento = 0;
		
		if (pdVentaTotal < 10) {
			montoDescuento = pdVentaTotal*(1-DSCTO_10);
			LOG.info("[EVL] Descuento 10% : {}", montoDescuento);
		}else if (pdVentaTotal > 9 && pdVentaTotal < 31) {
			montoDescuento = pdVentaTotal*(1-DSCTO_20);
			LOG.info("[EVL] Descuento 20% : {}", montoDescuento);
		}else if(pdVentaTotal > 30) {
			montoDescuento = pdVentaTotal*(1-DSCTO_30);
			LOG.info("[EVL] Descuento 30% : {}", montoDescuento);
		}
		
		return montoDescuento;
	}
	
	public double ventaTotal(double pdVentaTotal, double pdDescuento) {
		
		LOG.info("[EVL] Venta con descuento : {}", (pdVentaTotal - pdDescuento));
		
		return (pdVentaTotal - pdDescuento);
	}
}
