package pe.etg.bbva.spring.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.etg.bbva.spring.configuration.CC0702v02ConfigurationUnPerson;
import pe.etg.bbva.spring.entity.CE0701v01Person;

public class CV0702v02MostarAnnotationUnConstructor {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0702v02MostarAnnotationUnConstructor.class);
	private static AnnotationConfigApplicationContext oCntx;
	
	public static void main(String[] args) {
		MOLOG.info("[EVL] Start");
		MOLOG.info("[EVL] Antes de instanciar el Context : {}", oCntx);
		oCntx = new AnnotationConfigApplicationContext();
		oCntx.register(CC0702v02ConfigurationUnPerson.class);
		oCntx.refresh();

		MOLOG.info("[EVL] Instancia del context : {}", oCntx);
		MOLOG.info("[EVL] Vinculando el bean instanciado ");
		
		CE0701v01Person oCEPersona = (CE0701v01Person) oCntx.getBean("oCEPerson");
		
		MOLOG.info("[EVL] Instancia Person : {} ", oCEPersona);
		MOLOG.info("[EVL] Objeto Person : {} {} ", oCEPersona.getId(), oCEPersona.getCodigo(), oCEPersona.getNombre(), oCEPersona.getApodo());
		
		((AnnotationConfigApplicationContext) oCntx).close();
		MOLOG.info("[EVL] Finish");	
	}

}
