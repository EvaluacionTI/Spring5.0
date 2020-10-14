package pe.unjfsc.daw.spring5.logical.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.logical.CIProducto;

public class CMProducto implements CIProducto{
	private static final Logger LOG = LoggerFactory.getLogger("CMProducto");
	private static final double DSCTO_10 = 0.1;
	private static final double DSCTO_20 = 0.2;
	private static final double DSCTO_30 = 0.3;
	
	
	@Override
	public double calcularDescuento(double pVentaTotal) {
		double montoDescuento = 0;
		if (pVentaTotal < 10) {
			montoDescuento = pVentaTotal * (1-DSCTO_10);
			LOG.info("[EVL] Descuento 10% : {}", montoDescuento);
		}else if (pVentaTotal > 9 && pVentaTotal < 31) {
			montoDescuento = pVentaTotal * (1-DSCTO_20);
			LOG.info("[EVL] Descuento 20% : {}", montoDescuento);
		}else if (pVentaTotal > 30) {
			montoDescuento = pVentaTotal * (1-DSCTO_30);
			LOG.info("[EVL] Descuento 30% : {}", montoDescuento);
		}
		return montoDescuento;
	}

	@Override
	public double calcularVentaTotal(double pVentaTotal, double pDescuento) {
		LOG.info("[EVL] Venta con descuento : {}", pVentaTotal - pDescuento);
		return (pVentaTotal - pDescuento);
	}

}
