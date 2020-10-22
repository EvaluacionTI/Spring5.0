package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.logical.CIMostrarListado;

public class CVLookListProduct {
	private static final Logger LOG = LoggerFactory.getLogger("CVLookListProduct");
	public static void main(String[] args) {
		
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-ultimoRincon.xml");
		LOG.info("[EVL] Instancia Context : {}", oCntx);
		
		CIMostrarListado oLista = (CIMostrarListado) oCntx.getBean("idCMListado");
		LOG.info("[EVL] Instancia Interface : {}", oLista);
		
		LOG.info("[EVL] Lista all load : {}", oLista.listaProducto());
		
		((ConfigurableApplicationContext) oCntx).close();
	}
}
