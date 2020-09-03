package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEDatoEntrada;
import pe.unjfsc.daw.spring5.entity.CEOrdenar;
import pe.unjfsc.daw.spring5.logical.CLOrdenar;

public class CV03MostrarOrdenNumero {
	private static final Logger LOG = LoggerFactory.getLogger("CV01MostrarBeans");
	
	public static void main(String[] args) {
		LOG.info("[EVL] Iniciando ");
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("spring-context.xml");
	
		LOG.info("[EVL] Instancia ApplicationContext : {}", oCntx);
		
		LOG.info("[EVL] Revisando los beans ");
		CEDatoEntrada oCEntrada = (CEDatoEntrada) oCntx.getBean("idCEDatoEntrada");
		CEOrdenar oCEOrdenar = (CEOrdenar) oCntx.getBean("idCEOrdenar");
		CLOrdenar oCLOrdenar = (CLOrdenar) oCntx.getBean("idCLogica");
		
		LOG.info("[EVL] CEOrdenar  : {}", oCEntrada);
		LOG.info("[EVL] CEOperacion : {}", oCEOrdenar);
		LOG.info("[EVL] CLOrdenar : {}", oCLOrdenar);

		
		
//		LOG.info("[EVL] Ordenado  : {}", oCLOrdenar.ordenarNumeros(oCEntrada));
		
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
