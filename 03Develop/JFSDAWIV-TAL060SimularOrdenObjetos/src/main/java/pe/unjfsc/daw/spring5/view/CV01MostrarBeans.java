package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.logical.CLOrdenar;

public class CV01MostrarBeans {
	private static final Logger LOG = LoggerFactory.getLogger("CV01MostrarBeans");
	
	public static void main(String[] args) {
		LOG.info("[EVL] Iniciando ");
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("spring-context.xml");
	
		LOG.info("[EVL] Instancia ApplicationContext : {}", oCntx);
		
		LOG.info("[EVL] Revisando los beans ");
		CLOrdenar oCELogica = (CLOrdenar) oCntx.getBean("idCLogica");

		LOG.info("[EVL] CEOrdenar  : {}", oCELogica.numeroGenerado());
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
