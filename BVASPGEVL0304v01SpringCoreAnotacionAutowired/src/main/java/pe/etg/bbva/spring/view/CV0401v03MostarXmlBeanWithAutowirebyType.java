package pe.etg.bbva.spring.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring.entity.CE0401v01Person;

public class CV0401v03MostarXmlBeanWithAutowirebyType {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0401v03MostarXmlBeanWithAutowirebyType.class);
	private static ApplicationContext oCntx;
	
	public static void main(String[] args) {
		MOLOG.info("[EVL] Start");
		MOLOG.info("[EVL] Antes de instanciar el Context : {}", oCntx);
		oCntx = new ClassPathXmlApplicationContext("classpath:/spring/spring0401v03-tag-autowire-byType.xml");

		MOLOG.info("[EVL] Instancia del context : {}", oCntx);
		MOLOG.info("[EVL] Vinculando el bean instanciado ");
		
		CE0401v01Person oCEPersona = (CE0401v01Person) oCntx.getBean("idCEPerson");
		MOLOG.info("[EVL] Instancia Person    : {} ", oCEPersona);
		MOLOG.info("[EVL] Inyeccion Pais      : {} ", oCEPersona.getPais());
		MOLOG.info("[EVL] Inyeccion Ciudad    : {} ", oCEPersona.getPais().getNombre());
		
		
		MOLOG.info("[EVL] Person Pais Ciudad  : {} {} {} {} {} {} ", oCEPersona.getId(), oCEPersona.getCodigo(), oCEPersona.getNombre(), oCEPersona.getApodo(), oCEPersona.getPais().getNombre(), oCEPersona.getCiudad().getNombre());		

		((ClassPathXmlApplicationContext) oCntx).close();
		MOLOG.info("[EVL] Finish");	
	}
}
