package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEMeses;
import pe.unjfsc.daw.spring5.logical.CIProyeccion;
import pe.unjfsc.daw.spring5.logical.impl.CMProyeccion;

public class CV03RevisionBuscarTasa {
	private static final Logger LOG = LoggerFactory.getLogger("CV03RevisionBuscarTasa");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-proyeccion-interes.xml");
		LOG.info("[EVL] Context : {}", oCntx);
		
		CEMeses oCEMeses = oCntx.getBean(CEMeses.class);
		LOG.info("[EVL] CEMeses : {}", oCEMeses);
		
		CIProyeccion oCIProyeccion = oCntx.getBean(CMProyeccion.class);
		LOG.info("[EVL] CIProyeccion : {}", oCIProyeccion);
		
		oCEMeses.setIdMes(10);
		LOG.info("[EVL] CEFormula : {}", oCIProyeccion.buscarTasa(oCEMeses));
		
		((ConfigurableApplicationContext) oCntx).close();
	}
}
