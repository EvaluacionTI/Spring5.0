package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEPeriodo;
import pe.unjfsc.daw.spring5.entity.CEVirusCovid19Anidado;

public class CV04MostrarBeanAnidado {
	private static final Logger LOG = LoggerFactory.getLogger("CV02MostrarBeanSet");
	
    public static void main( String[] args ){
    	LOG.info("[EVL] Iniciando ");
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("covid19-contextAnidado.xml");
	
		LOG.info("[EVL] Instancia ApplicationContext : {}", oCntx);
		
		LOG.info("[EVL] Revisando los beans ");

		CEPeriodo oCEPeriodo = (CEPeriodo) oCntx.getBean("idCEPeriodo");
		LOG.info("[EVL] CEPeriodo  : {}", oCEPeriodo);
		
		CEVirusCovid19Anidado oCEVirusCovid19 = (CEVirusCovid19Anidado) oCntx.getBean("idCEVirusCovid19Anidado");
		LOG.info("[EVL] CEVirusCovid19Anidado  : {}", oCEVirusCovid19);

		((ConfigurableApplicationContext) oCntx).close();
    }
}
