package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEAreaSuperficieLateral;
import pe.unjfsc.daw.spring5.entity.CEAreaTotalSuperficie;
import pe.unjfsc.daw.spring5.entity.CEConstant;
import pe.unjfsc.daw.spring5.logical.CIEvaluarSuperficie;
import pe.unjfsc.daw.spring5.utility.CUConvert;

public class CV05RevisionUtilidad {
	private static final Logger LOG = LoggerFactory.getLogger("CV05RevisionUtilidad");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-lsatsa.xml");
		LOG.info("[EVL] Context : {}", oCntx);
		CEAreaSuperficieLateral oCELsa = oCntx.getBean(CEAreaSuperficieLateral.class);
		CEAreaTotalSuperficie oCETsa = oCntx.getBean(CEAreaTotalSuperficie.class);
		CUConvert oCUConvert = oCntx.getBean(CUConvert.class);
		
		LOG.info("[EVL] CEAreaSuperficieLateral : {}", oCELsa);
		LOG.info("[EVL] CEAreaTotalSuperficie : {}", oCETsa);
		
		CEAreaSuperficieLateral oCELsaResponse = new CEAreaSuperficieLateral();

		oCELsa.setLsa(CEConstant.LSA);
		oCELsa.setAltura(500);
		LOG.info("[EVL] CEAreaSuperficieLateral : {}", oCELsa);
	
		CIEvaluarSuperficie oCIEvaluar = (CIEvaluarSuperficie) oCntx.getBean("idCMEvaluarArea");
		oCELsaResponse = oCIEvaluar.calcularLSA(oCELsa);
		LOG.info("[EVL] Response LSA : {}", oCELsaResponse);
		
		oCETsa.setoCELsa(oCELsaResponse);
		LOG.info("[EVL] Response TSA : {}", oCIEvaluar.calcularTSA(oCETsa));
		
		String psNumero = "372748.94";
		LOG.info("[EVL] Rotar : {}", oCUConvert.rotarDerechaIzquierda(psNumero));

		psNumero = "372748.94";
		LOG.info("[EVL] Rotar : {}", oCUConvert.extraerPrimerUltimaPosicion(psNumero));
		
		((ConfigurableApplicationContext) oCntx).close();
	}
}
