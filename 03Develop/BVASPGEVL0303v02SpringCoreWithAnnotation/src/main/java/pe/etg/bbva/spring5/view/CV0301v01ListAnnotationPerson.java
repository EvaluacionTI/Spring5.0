package pe.etg.bbva.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.etg.bbva.spring5.entity.CE0301v01Person;
import pe.etg.bbva.spring5.model.CD0301v01ConfigurationPerson;

public class CV0301v01ListAnnotationPerson {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0301v01ListAnnotationPerson.class);
	private static AnnotationConfigApplicationContext oCntx;
	
	public static void main(String[] args) {
		MOLOG.info("[EVL] Start");
		
		MOLOG.info("[EVL] Antes de instancias la Annotation : {}", oCntx);
		oCntx = new AnnotationConfigApplicationContext(CD0301v01ConfigurationPerson.class);
		
		MOLOG.info("[EVL] Instancia Annotation : {}", oCntx);
		MOLOG.info("[EVL] Vinculando el bean instanciado ");
		
		CE0301v01Person oCEPersona = (CE0301v01Person) oCntx.getBean("oCEPersona");
		MOLOG.info("[EVL] Instancia Person : {} ", oCEPersona);
		MOLOG.info("[EVL] Objeto Person : {} {} ", oCEPersona.getCodigo(), oCEPersona.getNombre());
		
		((AnnotationConfigApplicationContext) oCntx).close();
		MOLOG.info("[EVL] Finish");
	}

}
