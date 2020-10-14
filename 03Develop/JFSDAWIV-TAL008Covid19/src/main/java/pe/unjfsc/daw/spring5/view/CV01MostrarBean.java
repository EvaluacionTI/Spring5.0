package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEVirusCovid19;

public class CV01MostrarBean {
	private static final Logger LOG = LoggerFactory.getLogger("CV01MostrarBeans");
	
    public static void main( String[] args ){
    	LOG.info("[EVL] Iniciando ");
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("covid19-context.xml");
	
		LOG.info("[EVL] Instancia ApplicationContext : {}", oCntx);
		
		LOG.info("[EVL] Revisando los beans ");
		
		CEVirusCovid19 oCEVirusCovid19 = (CEVirusCovid19) oCntx.getBean("idCEVirusCovid19");
		LOG.info("[EVL] CEVirusCovid19  : {}", oCEVirusCovid19);



		((ConfigurableApplicationContext) oCntx).close();
    }
}
