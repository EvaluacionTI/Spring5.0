package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.bbva.evalua.spring5.entity.CEConfigContext;
import pe.bbva.evalua.spring5.entity.CEGasto;
import pe.bbva.evalua.spring5.logical.CLExpense;


public class CVMostrarExpense {
	private static final Logger LOG = LoggerFactory.getLogger("CVMostrarExpense");
	
	public static void main(String[] args) {
		LOG.info("[EVL] Iniciando :");
		
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
		
		LOG.info("[EVL] Mostrando la instancia de la anotaciónt : " + oCntx);
		
		LOG.info("[EVL] Registrar la notación : ");
		oCntx.register(CEConfigContext.class);
		oCntx.refresh();
		
		LOG.info("[EVL] Declarar la instancia de la clase :");
		
		CEGasto oCEExpense = (CEGasto) oCntx.getBean("oCEGasto");
		CLExpense oCLExpense = (CLExpense) oCntx.getBean("oCLExpense");
		
		oCEExpense = oCLExpense.calculateExpense(100);
		
		LOG.info("[EVL] Datos obtenidos : " + oCEExpense.toString());
		
		LOG.info("[EVL] Cerrando el contextt : " + oCntx);
		((ConfigurableApplicationContext) oCntx).close();
	}
}
