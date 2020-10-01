package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEAreaSuperficieLateral;
import pe.unjfsc.daw.spring5.entity.CEAreaTotalSuperficie;
import pe.unjfsc.daw.spring5.entity.CEMostrarDatos;

public class CV01RevisionContext {
	private static final Logger LOG = LoggerFactory.getLogger("CV01RevisionContext");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-lsa.xml");
		LOG.info("[EVL] Context : {}", oCntx);
		
		CEAreaSuperficieLateral oCELsa = oCntx.getBean(CEAreaSuperficieLateral.class);
		LOG.info("[EVL] CEAreaSuperficieLateral : {}", oCELsa);
		
		CEAreaTotalSuperficie oCETsa = oCntx.getBean(CEAreaTotalSuperficie.class);
		LOG.info("[EVL] CEAreaTotalSuperficie : {}", oCETsa);
		
		CEMostrarDatos oCEMostrar = oCntx.getBean(CEMostrarDatos.class);
		LOG.info("[EVL] CEMostrarDatos : {}", oCEMostrar);
		
		((ConfigurableApplicationContext) oCntx).close();
	}
}
