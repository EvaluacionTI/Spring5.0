package pe.etg.bbva.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring5.entity.CE0801v03Person;

public class CV0801v03MostarXmlYnyeccionCiudad {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0801v03MostarXmlYnyeccionCiudad.class);
	private static ApplicationContext oCntx;
	
	public static void main(String[] args) {
		MOLOG.info("[EVL] Start");
		MOLOG.info("[EVL] Antes de instanciar el Context : {}", oCntx);
		oCntx = new ClassPathXmlApplicationContext("classpath:/spring5/spring0801v03-person-object-ciudad.xml");

		MOLOG.info("[EVL] Instancia del context : {}", oCntx);
		MOLOG.info("[EVL] Vinculando el bean instanciado ");
		
		CE0801v03Person oCEPersona = (CE0801v03Person) oCntx.getBean("idCEPerson");
		
		MOLOG.info("[EVL] Instancia Person    : {} ", oCEPersona);
		MOLOG.info("[EVL] Inyeccion Pais      : {} ", oCEPersona.getPais());
		MOLOG.info("[EVL] Inyeccion Ciudad    : {} ", oCEPersona.getPais().getCiudad());
		MOLOG.info("[EVL] Objeto Person Pais  : {} {} {} {} {} ", oCEPersona.getId(), oCEPersona.getCodigo(), oCEPersona.getNombre(), oCEPersona.getApodo(), oCEPersona.getPais().getNombre());
		
		((ClassPathXmlApplicationContext) oCntx).close();
		MOLOG.info("[EVL] Finish");	
	}
}
