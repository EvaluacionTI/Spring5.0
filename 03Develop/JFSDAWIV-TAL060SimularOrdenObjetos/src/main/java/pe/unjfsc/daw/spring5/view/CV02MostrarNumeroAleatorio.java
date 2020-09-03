package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEOperacion;
import pe.unjfsc.daw.spring5.entity.CEOrdenar;
import pe.unjfsc.daw.spring5.entity.CEResumen;

public class CV02MostrarNumeroAleatorio {
	private static final Logger LOG = LoggerFactory.getLogger("CV01MostrarBeans");
	
	public static void main(String[] args) {
		LOG.info("[EVL] Iniciando ");
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("spring-context.xml");
	
		LOG.info("[EVL] Instancia ApplicationContext : {}", oCntx);
		
		LOG.info("[EVL] Revisando los beans ");
		CEOrdenar oCEOrden = (CEOrdenar) oCntx.getBean("idCEOrdenar");
		CEOperacion oCEOperacion = (CEOperacion) oCntx.getBean("idCEOperacion");
		CEResumen oCEResumen = (CEResumen) oCntx.getBean("idCEResumen");
		
		LOG.info("[EVL] CEOrdenar  : {}", oCEOrden);
		LOG.info("[EVL] CEOperacion : {}", oCEOperacion);
		LOG.info("[EVL] CEResumen   : {}", oCEResumen);
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
