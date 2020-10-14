package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pe.unjfsc.daw.spring5.entity.CEConfigContext;
import pe.unjfsc.daw.spring5.entity.CEProducto;


public class CV01MostrarBean{
	private static final Logger LOG = LoggerFactory.getLogger("CV01MostrarBean");
	
    public static void main( String[] args ){
    	 LOG.info("[EVL] Start");
    	 AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
         
         LOG.info("[EVL] Instance Applicationcontext : {}", oCntx);
         
         LOG.info("[EVL] Registro de anotaciones ");
         oCntx.register(CEConfigContext.class);
         oCntx.refresh();
         
         CEProducto oCEProducto = (CEProducto) oCntx.getBean("idCEProducto");
         
         oCEProducto.setId(83738);
         LOG.info("[EVL] Producto : {}", oCEProducto);
         
         ((ConfigurableApplicationContext) oCntx).close();    	
    }
}
