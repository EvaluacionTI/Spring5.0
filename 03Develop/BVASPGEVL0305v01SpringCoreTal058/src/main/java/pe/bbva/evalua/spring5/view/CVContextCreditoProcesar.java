package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CECreditoProcesar;

public class CVContextCreditoProcesar {
	private static final Logger LOG = LoggerFactory.getLogger(CVContextCreditoProcesar.class);
	
	public static void main(String[] args) {
		LOG.info("[EVL] Iniciando CVContextCreditoProcesar");
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("spring-context.xml");
		
		LOG.info("[EVL] Mostrando la instancia del context : " + oCntx);
		
		LOG.info("[EVL] Instancia de la clase ");
		
		CECreditoProcesar oCECredito = oCntx.getBean("idCECreditoProcesar", CECreditoProcesar.class);
		
		LOG.info("[EVL] Objecto Credito Procesar : " + oCECredito.toString());
		
		LOG.info("[EVL] Cerrando el contextt : " + oCntx);
		((ConfigurableApplicationContext) oCntx).close();

	}

}
