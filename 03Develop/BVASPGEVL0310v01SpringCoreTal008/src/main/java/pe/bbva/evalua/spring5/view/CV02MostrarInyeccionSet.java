package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CECovid19Set;

public class CV02MostrarInyeccionSet {
	public static final Logger LOG = LoggerFactory.getLogger("CVMostrarCovid");

	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("/pe.bbva.evalua.spring5/context-covid.xml");
		
		LOG.info("[EVL] ApplicationContext : {} ", oCntx);
		CECovid19Set oCECovid = (CECovid19Set) oCntx.getBean("idCECovid19Set");
		
		LOG.info("[EVL] Entidad Covid : {} ", oCECovid);

		((ConfigurableApplicationContext) oCntx).close();
	}
}
