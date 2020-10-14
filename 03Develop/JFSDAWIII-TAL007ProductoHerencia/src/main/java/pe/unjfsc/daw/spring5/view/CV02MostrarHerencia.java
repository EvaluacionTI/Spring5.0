package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEConfigContext;
import pe.unjfsc.daw.spring5.entity.CEProducto;
import pe.unjfsc.daw.spring5.logical.impl.CMProducto;

public class CV02MostrarHerencia {
	private static final Logger LOG = LoggerFactory.getLogger("CV02MostrarHerencia");
	
	public static void main(String[] args) {
   	 AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
     
     LOG.info("[EVL] Instance Applicationcontext : {}", oCntx);
     
     LOG.info("[EVL] Registro de anotaciones ");
     oCntx.register(CEConfigContext.class);
     oCntx.refresh();
     
     CEProducto oCEProducto = (CEProducto) oCntx.getBean("idCEProducto");
     CMProducto oCMProducto = (CMProducto) oCntx.getBean("idCMProducto");
     
     LOG.info("[EVL] Instancia CEProducto : {} ", oCEProducto);
     LOG.info("[EVL] Instancia CMProducto : {} ", oCMProducto);
     
     oCEProducto.setId(83738);
     oCEProducto.setPrecioVenta(9);
     double dResult = oCMProducto.calcularDescuento(oCEProducto.getPrecioVenta());
     LOG.info("[EVL] Producto con 10%: {}", dResult);
     
     oCEProducto.setPrecioVenta(19);
     dResult = oCMProducto.calcularDescuento(oCEProducto.getPrecioVenta());
     LOG.info("[EVL] Producto con 20%: {}", dResult);

     oCEProducto.setPrecioVenta(31);
     dResult = oCMProducto.calcularDescuento(oCEProducto.getPrecioVenta());
     LOG.info("[EVL] Producto con 30%: {}", dResult);
     
     ((ConfigurableApplicationContext) oCntx).close();    

	}

}
