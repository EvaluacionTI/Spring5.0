package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CEOrdenar;
import pe.bbva.evalua.spring5.logical.CLOrdenar;

public class CVMostrarOrden3NumerosXml {
	private static final Logger LOG = LoggerFactory.getLogger(CVMostrarOrden3NumerosXml.class);
	
	public static void main(String[] args) {
	
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-numeros.xml");
		
		LOG.info("[EVL] Instancia del Contexto :", oCntx);

		CEOrdenar oCEOrdenar = (CEOrdenar) oCntx.getBean("idCEOrdenar");
		CLOrdenar oCLOrdenar = (CLOrdenar) oCntx.getBean("idCLOrdenar");
		
		oCEOrdenar = oCLOrdenar.ordenarNumeros(7, 4, 3);
		LOG.info(oCEOrdenar.toString());
		oCEOrdenar = oCLOrdenar.ordenarNumeros(1, 3, 4);
		LOG.info(oCEOrdenar.toString());
		oCEOrdenar = oCLOrdenar.ordenarNumeros(3, 5, 4);
		LOG.info(oCEOrdenar.toString());
		oCEOrdenar = oCLOrdenar.ordenarNumeros(8, 17, 9);
		LOG.info(oCEOrdenar.toString());
		oCEOrdenar = oCLOrdenar.ordenarNumeros(18, 19, 3);
		LOG.info(oCEOrdenar.toString());
		oCEOrdenar = oCLOrdenar.ordenarNumeros(14, 19, 4);
		LOG.info(oCEOrdenar.toString());
		oCEOrdenar = oCLOrdenar.ordenarNumeros(7, 4, 6);
		LOG.info(oCEOrdenar.toString());
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
