package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEConfigContext;
import pe.unjfsc.daw.spring5.entity.CECreditoProcesar;

public class CVMostrarCreditoProcesar {
	private static final Logger LOG = LoggerFactory.getLogger("CVMostrarCreditoProcesar");
	
	public static void main(String[] args) {
		LOG.info("[DAW] Iniciando execute");
		
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
		LOG.info("[DAW] Instancia de la Annotacion : {}", oCntx);
		
		LOG.info("[DAW] Registro de la Annotacion : {}");
		oCntx.register(CEConfigContext.class);
		oCntx.refresh();
		
		CECreditoProcesar oCECredito = (CECreditoProcesar) oCntx.getBean("oCECreditoProcesar");
		/*
		 * oCECredito.setMoneda("E"); oCECredito.setCreditoDisponible(10000.99);
		 * oCECredito.setCreditoProcesar(5000.00);
		 * oCECredito.setDisponibleRestiro(2000.00); oCECredito.setCargOperacion(30.00);
		 */		
		LOG.info("[] Instancia de la clase CECreditoProcesar : {}", oCECredito);
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
