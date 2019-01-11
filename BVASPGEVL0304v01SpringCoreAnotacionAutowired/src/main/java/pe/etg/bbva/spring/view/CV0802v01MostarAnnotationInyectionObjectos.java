package pe.etg.bbva.spring.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.etg.bbva.spring.controller.CC0802v01ConfigurationPerson;
import pe.etg.bbva.spring.entity.CE0802v01Pais;
import pe.etg.bbva.spring.entity.CE0802v01Person;

public class CV0802v01MostarAnnotationInyectionObjectos {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0802v01MostarAnnotationInyectionObjectos.class);
	private static AnnotationConfigApplicationContext oCntx;
	
	public static void main(String[] args) {
		MOLOG.info("[EVL] Start");
		MOLOG.info("[EVL] Antes de instanciar el Context : {}", oCntx);
		oCntx = new AnnotationConfigApplicationContext();
		oCntx.register(CC0802v01ConfigurationPerson.class);
		oCntx.refresh();

		MOLOG.info("[EVL] Instancia del context : {}", oCntx);
		MOLOG.info("[EVL] Vinculando el bean instanciado ");
		
		CE0802v01Pais oCEPais = (CE0802v01Pais) oCntx.getBean("oCEPais");
		CE0802v01Person oCEPersona = (CE0802v01Person) oCntx.getBean("oCEPerson");
		
		MOLOG.info("[EVL] Instancia Pais     : {} {} ", oCEPais);
		MOLOG.info("[EVL] Instancia Person   : {} ", oCEPersona);
		MOLOG.info("[EVL] Objeto Person Pais : {} {} ", oCEPersona.getApodo(), oCEPersona.getPais());
		
		MOLOG.info("[EVL] Objeto Person      : {} {} {} {} {} ", oCEPersona.getId(), oCEPersona.getCodigo(), oCEPersona.getNombre(), oCEPersona.getApodo(), oCEPersona.getPais().getNombre());
		
		((AnnotationConfigApplicationContext) oCntx).close();
		MOLOG.info("[EVL] Finish");	
	}

}
