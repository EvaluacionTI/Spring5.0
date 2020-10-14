package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.logical.CIUtilidad;

public class CV02MostrarImpl {
	private static final Logger LOG = LoggerFactory.getLogger("CV02MostrarImpl");
	
    public static void main( String[] args ){
        LOG.info("[EVL] Start");
        ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-interface.xml");
        
        LOG.info("[EVL] Instance Applicationcontext : {}", oCntx);
        
        LOG.info("[EVL] Definir la instancia de la interface asociada al impl :");
        CIUtilidad oUtilidad = (CIUtilidad) oCntx.getBean("idCMEValuar");
        
        LOG.info("[EVL] Minuscula : {}", oUtilidad.convertirMinusculaMayuscula("taller 03 interface y herencia"));
        LOG.info("[EVL] Aleatorio : {}", oUtilidad.generarCodigo5Digitos());
        
        ((ConfigurableApplicationContext) oCntx).close();
    }
}
