package pe.etg.bbva.spring.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.etg.bbva.spring.configuration.CC0802v03ConfigurationPersonCiudad;
import pe.etg.bbva.spring.entity.CE0802v03Person;

public class CV0802v03MostarAnnotationInyectionCiudad {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0802v03MostarAnnotationInyectionCiudad.class);
	private static AnnotationConfigApplicationContext oCntx;
	
	public static void main(String[] args) {
		MOLOG.info("[EVL] Start");
		MOLOG.info("[EVL] Antes de instanciar el Context : {}", oCntx);
		oCntx = new AnnotationConfigApplicationContext();
		oCntx.register(CC0802v03ConfigurationPersonCiudad.class);
		oCntx.refresh();

		MOLOG.info("[EVL] Instancia del context : {}", oCntx);
		MOLOG.info("[EVL] Vinculando el bean instanciado ");
		
		CE0802v03Person oCEPersona = (CE0802v03Person) oCntx.getBean("oCEPerson");
		

		MOLOG.info("[EVL] Instancia Person   : {} ", oCEPersona);
		MOLOG.info("[EVL] Instancia Pais     : {} {} ", oCEPersona.getPais());
		MOLOG.info("[EVL] Instancia Ciudad   : {} {} ", oCEPersona.getPais().getCiudad());		
		MOLOG.info("[EVL] Objeto Person Pais : {} {} ", oCEPersona.getApodo(), oCEPersona.getPais());
		
		MOLOG.info("[EVL] Objeto Person      : {} {} {} {} {} {} ", oCEPersona.getId(), oCEPersona.getCodigo(), oCEPersona.getNombre(), oCEPersona.getApodo(), oCEPersona.getPais().getNombre(), oCEPersona.getPais().getCiudad().getNombre());
		
		((AnnotationConfigApplicationContext) oCntx).close();
		MOLOG.info("[EVL] Finish");	
	}

}
