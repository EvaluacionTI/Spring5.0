package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CECreditoProcesar;

public class CVContextCreditoProcesar {
	public static final Logger LOG = LoggerFactory.getLogger("CVContextCreditoProcesar");
	
	public static void main(String[] args) {
		LOG.info("[EVL] Iniciando CVContextCreditoProcesar");
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("spring-context.xml");
	
		LOG.info("[EVL] Instancia ApplicationContext : {}", oCntx);
		
		LOG.info("[EVL] Instancia la clase entity : ");
		
		CECreditoProcesar oEntidad = oCntx.getBean("idCECreditoProcesar", CECreditoProcesar.class);
		
		LOG.info("[EVL] Instancia de entity : {}", oEntidad);
		oEntidad.setMoneda("S/");
		oEntidad.setCreditoProcesar(19022);
		oEntidad.setCreditoDisponible(1500);
		oEntidad.setDisponibleRetiro(89);
		oEntidad.setCargoOperacion(5.76);
		
		LOG.info("[EVL] Instancia with data : {}", oEntidad);
		((ConfigurableApplicationContext) oCntx).close();
	}

}
