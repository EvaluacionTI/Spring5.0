package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CECovid19;
import pe.bbva.evalua.spring5.logical.CICovid19;

public class CVMostrarCovid {
	public static final Logger LOG = LoggerFactory.getLogger("CVMostrarCovid");

	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("/pe.bbva.evalua.spring5/context-covid.xml");
		
		LOG.info("[EVL] ApplicationContext : {} ", oCntx);
		CECovid19 oCECovid = (CECovid19) oCntx.getBean("idCECovid19");
		CICovid19 oCMProyectar = (CICovid19) oCntx.getBean("idCMCovid");
		
		LOG.info("[EVL] Entidad Covid : {} ", oCECovid);
		LOG.info("[EVL] Entidad Proyectar : {} ", oCMProyectar);
		oCECovid = oCMProyectar.proyectarCovid19();
		
		LOG.info("[EVL] New Entidad Covid : {} ", oCECovid);
		((ConfigurableApplicationContext) oCntx).close();
	}
}
