package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEAreaSuperficieLateral;
import pe.unjfsc.daw.spring5.entity.CEConstant;
import pe.unjfsc.daw.spring5.logical.CIEvaluarSuperficieOnlyInyection;

public class CV07RevisionContexLSAOnlyInyection {
	private static final Logger LOG = LoggerFactory.getLogger("CV07RevisionContexLSAOnlyInyection");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-lsatsaOnlyInyection.xml");
		LOG.info("[EVL] Context : {}", oCntx);
		
		CEAreaSuperficieLateral oCELsa = oCntx.getBean(CEAreaSuperficieLateral.class);
		LOG.info("[EVL] CEAreaSuperficieLateral : {}", oCELsa);
		
		oCELsa.setLsa(CEConstant.LSA);
		oCELsa.setAltura(500);
		LOG.info("[EVL] CEAreaSuperficieLateral : {}", oCELsa);
	
		CIEvaluarSuperficieOnlyInyection oCIEvaluar = (CIEvaluarSuperficieOnlyInyection) oCntx.getBean("idCMEvaluarArea");
		
		LOG.info("[EVL] CIEvaluarSuperficie : {}", oCIEvaluar.calcularLSA(oCELsa));
		
		((ConfigurableApplicationContext) oCntx).close();
	}
}
