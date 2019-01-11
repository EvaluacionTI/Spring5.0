package pe.etg.bbva.spring.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.etg.bbva.spring.controller.CC0702v01ConfigurationPerson;
import pe.etg.bbva.spring.entity.CE0701v01Person;

public class CV0702v01MostarAnnotationConstructor {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0702v01MostarAnnotationConstructor.class);
	private static AnnotationConfigApplicationContext oCntx;
	
	public static void main(String[] args) {
		MOLOG.info("[EVL] Start");
		MOLOG.info("[EVL] Antes de instanciar el Context : {}", oCntx);
		oCntx = new AnnotationConfigApplicationContext();
		oCntx.register(CC0702v01ConfigurationPerson.class);
		oCntx.refresh();

		MOLOG.info("[EVL] Instancia del context : {}", oCntx);
		MOLOG.info("[EVL] Vinculando el bean instanciado ");
		
		CE0701v01Person oCEPersona = (CE0701v01Person) oCntx.getBean("oCEPerson");
		
		MOLOG.info("[EVL] Instancia Person : {} ", oCEPersona);
		MOLOG.info("[EVL] Objeto Person : {} {} ", oCEPersona.getCodigo(), oCEPersona.getNombre());
		
		((AnnotationConfigApplicationContext) oCntx).close();
		MOLOG.info("[EVL] Finish");	
	}

}
