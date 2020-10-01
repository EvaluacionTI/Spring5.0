package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEAreaSuperficieLateral;
import pe.unjfsc.daw.spring5.entity.CEAreaTotalSuperficie;
import pe.unjfsc.daw.spring5.entity.CEConstant;
import pe.unjfsc.daw.spring5.entity.CEMostrarDatos;
import pe.unjfsc.daw.spring5.logical.CIEvaluarSuperficie;

public class CV06RevisionContexMostrar {
	private static final Logger LOG = LoggerFactory.getLogger("CV06RevisionContexMostrar");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-lsatsa.xml");
		LOG.info("[EVL] Context : {}", oCntx);
		CEAreaSuperficieLateral oCELsa = oCntx.getBean(CEAreaSuperficieLateral.class);
		CEAreaTotalSuperficie oCETsa = oCntx.getBean(CEAreaTotalSuperficie.class);
		CEMostrarDatos oCEMostrar = oCntx.getBean(CEMostrarDatos.class);
		
		LOG.info("[EVL] CEAreaSuperficieLateral : {}", oCELsa);
		LOG.info("[EVL] CEAreaTotalSuperficie : {}", oCETsa);
		LOG.info("[EVL] CEMostrarDatos : {}", oCEMostrar);
		

		oCELsa.setLsa(CEConstant.LSA);
		oCELsa.setAltura(500);
		LOG.info("[EVL] CEAreaSuperficieLateral : {}", oCELsa);
	
		oCEMostrar.setoCELsa(oCELsa);
		LOG.info("[EVL] Request CEMostrarDatos : {}", oCEMostrar);
		
		CIEvaluarSuperficie oCIEvaluar = (CIEvaluarSuperficie) oCntx.getBean("idCMEvaluarArea");
		
		LOG.info("[EVL] Response CEMostrarDatos : {}", oCIEvaluar.procesarData(oCEMostrar));
		
		((ConfigurableApplicationContext) oCntx).close();
	}
}
