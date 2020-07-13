package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.bbva.evalua.spring5.entity.CEConfigContext;
import pe.bbva.evalua.spring5.entity.CECovidAnotacion;
import pe.bbva.evalua.spring5.logical.impl.CMProyectarConvidAnotacion;

public class CVMostrarCovidAnotacion {
	public static final Logger LOG = LoggerFactory.getLogger("CVMostrarCovidAnotacion");

	public static void main(String[] args) {
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
		oCntx.register(CEConfigContext.class);
		oCntx.refresh();
		
		LOG.info("[EVL] ApplicationContext : {} ", oCntx);
		CECovidAnotacion oCECovid = (CECovidAnotacion) oCntx.getBean("oCECovidA");
		CMProyectarConvidAnotacion oCMProyectar = (CMProyectarConvidAnotacion) oCntx.getBean("oCMCovidA");
		
		LOG.info("[EVL] Entidad Covid : {} ", oCECovid);
		LOG.info("[EVL] Entidad Proyectar : {} ", oCMProyectar);
		oCECovid = oCMProyectar.proyectarCovid19();
		
		LOG.info("[EVL] New Entidad Covid : {} ", oCECovid);
		((ConfigurableApplicationContext) oCntx).close();
	}
}
