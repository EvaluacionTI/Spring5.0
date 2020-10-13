package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEMeses;
import pe.unjfsc.daw.spring5.logical.CIUnificarListas;
import pe.unjfsc.daw.spring5.logical.impl.CMUnificarProyeccion;

public class CV05RevisionUnionListas {
	private static final Logger LOG = LoggerFactory.getLogger("CV05RevisionUnionListas");
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-unificar-proyeccion.xml");
		LOG.info("[EVL] Context : {}", oCntx);
		
		CEMeses oCEMeses = oCntx.getBean(CEMeses.class);
		LOG.info("[EVL] CEMeses : {}", oCEMeses);
		
		CIUnificarListas oCIProyeccion = oCntx.getBean(CMUnificarProyeccion.class);
		LOG.info("[EVL] CIProyeccion : {}", oCIProyeccion);
		
		oCEMeses.setIdMes(10);
		LOG.info("[EVL] CEProyeccion : {}", oCIProyeccion.llenarListas(oCEMeses));
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
