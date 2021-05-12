package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CEToro;
import pe.bbva.evalua.spring5.logical.CIUtilidad;

public class CVMostrarInterface {
	private static final Logger LOG = LoggerFactory.getLogger("CVMostrarInterface");
	
	public static void main(String[] args) {
	
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-interface.xml");
		
		LOG.info("[EVL] Instancia del Contexto :", oCntx);

		CEToro oCEToro = (CEToro) oCntx.getBean("idCEToro");
		oCEToro.setNombre("marco");
		
		CIUtilidad oCLUtilidad = (CIUtilidad) oCntx.getBean("idCMEvaluar");
		
		long numeroGenerado = oCLUtilidad.generarNumero();
		String cadena = oCLUtilidad.convertirMayuscula(oCEToro.getNombre());
		
		LOG.info(" {} ", numeroGenerado);
		LOG.info(cadena);
		
		((ConfigurableApplicationContext) oCntx).close();
	}
}
