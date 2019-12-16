package pe.etg.bbva.spring.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.etg.bbva.spring.model.CD0401v01ConfiguracionConexionAnotacionOracle;
import pe.etg.bbva.spring.model.impl.CD0401v01PersonAnotacion;

public class CV0101v01MostrarPerson {
	public static final Logger MOLOG = LoggerFactory.getLogger(CV0101v01MostrarPerson.class); 
	private static AnnotationConfigApplicationContext oCntx;

	public static void main(String[] args) {
		MOLOG.info("[EVL] Start");
		oCntx = new AnnotationConfigApplicationContext(CD0401v01ConfiguracionConexionAnotacionOracle.class);
		MOLOG.info("[EVL] Instanciando el contexto : {} ", oCntx);
		String sNombreBean = "idCIcrudPerson";
		
		CD0401v01PersonAnotacion oCMPerson = oCntx.getBean(sNombreBean, CD0401v01PersonAnotacion.class);
		MOLOG.info("[EVL] Implementacion : {} ", oCMPerson);

		//context.getBean(CCPerson.class).process();
		MOLOG.info("[EVL] Finish");
	}

}
