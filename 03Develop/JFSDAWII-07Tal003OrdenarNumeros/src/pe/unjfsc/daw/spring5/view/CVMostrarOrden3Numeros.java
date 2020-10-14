package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEOrdenar;
import pe.unjfsc.daw.spring5.logical.CLOrdenar;

public class CVMostrarOrden3Numeros {
	private static final Logger LOG = LoggerFactory.getLogger("CVMostrarOrden3Numeros");
	
	public static void main(String[] args) {
		LOG.info("[EVL] Iniciando CVContextCreditoProcesar");
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-numeros.xml");
	
		LOG.info("[EVL] Instancia ApplicationContext : {}", oCntx);

		CEOrdenar oCEOrdenar = (CEOrdenar) oCntx.getBean("idCEOrdenar");
		CLOrdenar oCLOrdenar = (CLOrdenar) oCntx.getBean("idCLOrdenar");
		
		LOG.info("[EVL] Instancia CEOrdenar : {}", oCEOrdenar);
		LOG.info("[EVL] Instancia CLOrdenar : {}", oCLOrdenar);

		oCEOrdenar = oCLOrdenar.ordenarNumeros(7, 4, 3);
		LOG.info("[EVL] Objecto 1 Ordenado : {}", oCEOrdenar);
		
		oCEOrdenar = oCLOrdenar.ordenarNumeros(1, 4, 13);
		LOG.info("[EVL] Objecto 2 Ordenado : {}", oCEOrdenar);

		oCEOrdenar = oCLOrdenar.ordenarNumeros(1, 8, 4);
		LOG.info("[EVL] Objecto 3 Ordenado : {}", oCEOrdenar);

		oCEOrdenar = oCLOrdenar.ordenarNumeros(14, 18, 4);
		LOG.info("[EVL] Objecto 4 Ordenado : {}", oCEOrdenar);
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
