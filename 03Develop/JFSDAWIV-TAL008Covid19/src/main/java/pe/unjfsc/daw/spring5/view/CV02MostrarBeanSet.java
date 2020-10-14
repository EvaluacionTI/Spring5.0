package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEVirusCovid19Set;

public class CV02MostrarBeanSet {
	private static final Logger LOG = LoggerFactory.getLogger("CV02MostrarBeanSet");
	
    public static void main( String[] args ){
    	LOG.info("[EVL] Iniciando ");
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("covid19-contextSet.xml");
	
		LOG.info("[EVL] Instancia ApplicationContext : {}", oCntx);
		
		LOG.info("[EVL] Revisando los beans ");
		
		CEVirusCovid19Set oCEVirusCovid19 = (CEVirusCovid19Set) oCntx.getBean("idCEVirusCovid19Set");
		LOG.info("[EVL] CEVirusCovid19  : {}", oCEVirusCovid19);

		((ConfigurableApplicationContext) oCntx).close();
    }
}
