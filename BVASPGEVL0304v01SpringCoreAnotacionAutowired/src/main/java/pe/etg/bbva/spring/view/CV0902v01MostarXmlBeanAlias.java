package pe.etg.bbva.spring.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring.entity.CE0801v03Person;

public class CV0902v01MostarXmlBeanAlias {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0902v01MostarXmlBeanAlias.class);
	private static ApplicationContext oCntx;
	
	public static void main(String[] args) {
		MOLOG.info("[EVL] Start");
		MOLOG.info("[EVL] Antes de instanciar el Context : {}", oCntx);
		oCntx = new ClassPathXmlApplicationContext("classpath:/spring/spring0902v01-beans-alias.xml");

		MOLOG.info("[EVL] Instancia del context : {}", oCntx);
		MOLOG.info("[EVL] Vinculando el bean instanciado ");
		
		CE0801v03Person oCEPersona = (CE0801v03Person) oCntx.getBean("oCEPersona");
		
		MOLOG.info("[EVL] Instancia Person    : {} ", oCEPersona);
		MOLOG.info("[EVL] Inyeccion Pais      : {} ", oCEPersona.getPais());
		MOLOG.info("[EVL] Inyeccion Ciudad    : {} ", oCEPersona.getPais().getCiudad());
		MOLOG.info("[EVL] Objeto Person Pais  : {} {} {} {} {} {} ", oCEPersona.getId(), oCEPersona.getCodigo(), oCEPersona.getNombre(), oCEPersona.getApodo(), oCEPersona.getPais().getNombre(), oCEPersona.getPais().getCiudad().getNombre());
		
		CE0801v03Person oCEPersona2 = (CE0801v03Person) oCntx.getBean("oCEPersona2");
		
		MOLOG.info("[EVL] Instancia Person    : {} ", oCEPersona2);
		MOLOG.info("[EVL] Inyeccion Pais      : {} ", oCEPersona2.getPais());
		MOLOG.info("[EVL] Inyeccion Ciudad    : {} ", oCEPersona2.getPais().getCiudad());
		MOLOG.info("[EVL] Objeto Person Pais  : {} {} {} {} {} {} ", oCEPersona2.getId(), oCEPersona2.getCodigo(), oCEPersona2.getNombre(), oCEPersona2.getApodo(), oCEPersona2.getPais().getNombre(), oCEPersona2.getPais().getCiudad().getNombre());
				
		((ClassPathXmlApplicationContext) oCntx).close();
		MOLOG.info("[EVL] Finish");	
	}
}
