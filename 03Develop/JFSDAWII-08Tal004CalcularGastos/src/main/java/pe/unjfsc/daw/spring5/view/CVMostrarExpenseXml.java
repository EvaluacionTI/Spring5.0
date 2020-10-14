package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEGasto;
import pe.unjfsc.daw.spring5.logical.CLExpense;

public class CVMostrarExpenseXml {
	private static final Logger LOG = LoggerFactory.getLogger("CVMostrarExpenseAnotacion");
	
	public static void main(String[] args) {
		LOG.info("[DAW] Iniciando");
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-expense.xml");
		
		LOG.info("[DAW] ApplicationContext  : {}", oCntx);
		
		CEGasto oGasto = (CEGasto) oCntx.getBean("idCEGasto");
		CLExpense oCalcular = (CLExpense) oCntx.getBean("idCLExpense");
		LOG.info("[DAW] CEGasto  : {}", oGasto);
		LOG.info("[DAW] CLExpense  : {}", oCalcular);
		
		oGasto = oCalcular.calcularGastoXml(100);
		LOG.info("[DAW] Datos calculado obtenidos  : {}", oGasto);
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
