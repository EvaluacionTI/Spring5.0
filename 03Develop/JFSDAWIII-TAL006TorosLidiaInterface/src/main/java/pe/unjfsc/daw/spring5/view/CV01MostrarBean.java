package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEToro;

public class CV01MostrarBean {
	private static final Logger LOG = LoggerFactory.getLogger("CV01MostrarBean");
	
    public static void main( String[] args ){
        LOG.info("[EVL] Start");
        ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-interface.xml");
        
        LOG.info("[EVL] Instance Applicationcontext : {}", oCntx);
        
        CEToro oToro = (CEToro) oCntx.getBean("idCEToro");
        LOG.info("[EVL] Instance CEToro : {}", oToro);
        
        ((ConfigurableApplicationContext) oCntx).close();
    }
}
