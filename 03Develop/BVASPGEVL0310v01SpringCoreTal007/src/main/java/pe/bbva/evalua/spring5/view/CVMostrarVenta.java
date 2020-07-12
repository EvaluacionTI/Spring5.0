package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.bbva.evalua.spring5.entity.CEConfigContext;
import pe.bbva.evalua.spring5.entity.CEProducto;
import pe.bbva.evalua.spring5.logical.CLCalcularVenta;

public class CVMostrarVenta {
	public static final Logger LOG = LoggerFactory.getLogger("CVMostrarVenta");

	public static void main(String[] args) {
		LOG.error("Iniciando revisión");
		
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
		
		LOG.info("[EVL] Mostrando la instancia de la anotaciónt : {} " + oCntx);
		
		LOG.info("[EVL] Registrar la notación : ");
		oCntx.register(CEConfigContext.class);
		oCntx.refresh();
		
		LOG.info("[EVL] Declarar la instancia de la clase :");
		
		CEProducto oCEProduct = (CEProducto) oCntx.getBean("oCEProducto");
		CLCalcularVenta oCLCalcular = (CLCalcularVenta) oCntx.getBean("oCLCalcular");
		
		oCEProduct.setPrecioVenta(10);
		double dSumTotalVenta = oCLCalcular.descuento(oCEProduct.getPrecioVenta());
		LOG.info("[EVL] Suma Acumulada-0 : {} ", dSumTotalVenta);
		
		oCEProduct.setPrecioVenta(10);
		dSumTotalVenta += oCLCalcular.descuento(oCEProduct.getPrecioVenta());
		LOG.info("[EVL] Suma Acumulada-1 : {} ", dSumTotalVenta);
		
		oCEProduct.setPrecioVenta(10);
		dSumTotalVenta += oCLCalcular.descuento(oCEProduct.getPrecioVenta());
		LOG.info("[EVL] Suma Acumulada-3 : {} ", dSumTotalVenta);
		
		oCEProduct.setPrecioVenta(10);
		dSumTotalVenta += oCLCalcular.descuento(oCEProduct.getPrecioVenta());
		LOG.info("[EVL] Suma Acumulada-4 : {} ", dSumTotalVenta);

		oCEProduct.setPrecioVenta(10);
		dSumTotalVenta += oCLCalcular.descuento(oCEProduct.getPrecioVenta());
		LOG.info("[EVL] Suma Acumulada-5 : {} ", dSumTotalVenta);

		LOG.info("[EVL] Cerrando el contextt : " + oCntx);
		((ConfigurableApplicationContext) oCntx).close();
	}

}
