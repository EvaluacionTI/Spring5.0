package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEConfigContext;
import pe.unjfsc.daw.spring5.entity.CEGasto;
import pe.unjfsc.daw.spring5.logical.CLExpense;

public class CVMostrarExpenseAnotacion {
	private static final Logger LOG = LoggerFactory.getLogger("CVMostrarExpenseAnotacion");
	
	public static void main(String[] args) {
		LOG.info("[DAW] Iniciando");
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
		LOG.info("[DAW] AnnotationConfigApplicationContext  : {}", oCntx);
		
		oCntx.register(CEConfigContext.class);
		oCntx.refresh();
		
		CEGasto oGasto = (CEGasto) oCntx.getBean("idCEGasto");
		CLExpense oCalcular = (CLExpense) oCntx.getBean("idCExpense");
		LOG.info("[DAW] CEGasto  : {}", oGasto);
		LOG.info("[DAW] CLExpense  : {}", oCalcular);
		
		oGasto = oCalcular.calcularGasto(100);
		LOG.info("[DAW] Datos calculado obtenidos  : {}", oGasto);
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
