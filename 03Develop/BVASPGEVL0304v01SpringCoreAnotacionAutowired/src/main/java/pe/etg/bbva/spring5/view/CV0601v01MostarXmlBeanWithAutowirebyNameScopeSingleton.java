package pe.etg.bbva.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring5.entity.CE0601v01Person;

public class CV0601v01MostarXmlBeanWithAutowirebyNameScopeSingleton {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0601v01MostarXmlBeanWithAutowirebyNameScopeSingleton.class);
	private static ApplicationContext oCntx;
	
	public static void main(String[] args) {
		MOLOG.info("[EVL] Start");
		MOLOG.info("[EVL] Antes de instanciar el Context : {}", oCntx);
		oCntx = new ClassPathXmlApplicationContext("classpath:/spring5/spring0601v01-declarar-bean-scopes-singleton.xml");

		MOLOG.info("[EVL] Instancia del context : {}", oCntx);
		MOLOG.info("[EVL] Vinculando el bean instanciado ");
		
		// El resultado final es que obtenemos la misma instancia para el objeto definido en el archivo xml
		CE0601v01Person oCEPersona = (CE0601v01Person) oCntx.getBean("idCEPerson");
		MOLOG.info("[EVL] Instancia Person    : {} ", oCEPersona);
		MOLOG.info("[EVL] Inyeccion Pais      : {} ", oCEPersona.getPais());
		MOLOG.info("[EVL] Inyeccion Ciudad    : {} ", oCEPersona.getPais().getNombre());
		MOLOG.info("[EVL] Person Pais Ciudad  : {} {} {} {} {} {} ", oCEPersona.getId(), oCEPersona.getCodigo(), oCEPersona.getNombre(), oCEPersona.getApodo(), oCEPersona.getPais().getNombre(), oCEPersona.getCiudad().getNombre());		

		CE0601v01Person oCEPersona2 = (CE0601v01Person) oCntx.getBean("idCEPerson");
		MOLOG.info("[EVL] Instancia Person    : {} ", oCEPersona2);
		MOLOG.info("[EVL] Inyeccion Pais      : {} ", oCEPersona2.getPais());
		MOLOG.info("[EVL] Inyeccion Ciudad    : {} ", oCEPersona2.getPais().getNombre());
		MOLOG.info("[EVL] Person Pais Ciudad  : {} {} {} {} {} {} ", oCEPersona2.getId(), oCEPersona2.getCodigo(), oCEPersona2.getNombre(), oCEPersona2.getApodo(), oCEPersona2.getPais().getNombre(), oCEPersona2.getCiudad().getNombre());		

		
		((ClassPathXmlApplicationContext) oCntx).close();
		MOLOG.info("[EVL] Finish");	
	}
}
