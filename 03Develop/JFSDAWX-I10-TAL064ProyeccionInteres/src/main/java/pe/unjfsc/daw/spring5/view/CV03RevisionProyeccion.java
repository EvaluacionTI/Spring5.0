package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.logical.CIProyeccion;
import pe.unjfsc.daw.spring5.logical.impl.CMProyeccion;
import pe.unjfsc.daw.spring5.utility.CUInteres;


public class CV03RevisionProyeccion {
	private static final Logger LOG = LoggerFactory.getLogger("CV03RevisionProyeccion");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-proyeccion-interes.xml");
		LOG.info("[EVL] Context : {}", oCntx);
		
		CUInteres oCUInteres = oCntx.getBean(CUInteres.class);
		LOG.info("[EVL] CUInteres : {}", oCUInteres);
		
		CIProyeccion oCIProyeccion = oCntx.getBean(CMProyeccion.class);
		LOG.info("[EVL] CIProyeccion : {}", oCIProyeccion);
		
		LOG.info("[EVL] CEFormula : {}", oCIProyeccion.buscarTasa(10));
		
		((ConfigurableApplicationContext) oCntx).close();
	}
}
