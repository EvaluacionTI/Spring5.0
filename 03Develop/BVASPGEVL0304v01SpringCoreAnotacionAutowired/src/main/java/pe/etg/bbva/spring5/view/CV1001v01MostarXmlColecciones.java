package pe.etg.bbva.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring5.entity.CE1001v01Ciudad;
import pe.etg.bbva.spring5.entity.CE1003v01Person;

public class CV1001v01MostarXmlColecciones {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV1001v01MostarXmlColecciones.class);
	private static ApplicationContext oCntx;
	
	public static void main(String[] args) {
		MOLOG.info("[EVL] Start");
		MOLOG.info("[EVL] Antes de instanciar el Context : {}", oCntx);
		oCntx = new ClassPathXmlApplicationContext("classpath:/spring5/spring1001v01-beans-colecciones.xml");

		MOLOG.info("[EVL] Instancia del context : {}", oCntx);
		MOLOG.info("[EVL] Vinculando el bean instanciado ");
		
		CE1003v01Person oCEPersona = (CE1003v01Person) oCntx.getBean("idCEPerson");
		MOLOG.info("[EVL] Instancia Person    : {} ", oCEPersona);
		MOLOG.info("[EVL] Inyeccion Pais      : {} ", oCEPersona.getPais());
		MOLOG.info("[EVL] Inyeccion Ciudad    : {} ", oCEPersona.getPais().getCiudades());
		
		String sNombreCiudad = null;
		for (CE1001v01Ciudad oCiudad : oCEPersona.getPais().getCiudades()) {
			sNombreCiudad += oCiudad.getNombre() + "-";
		}
		
		MOLOG.info("[EVL] Mostrar ciudad    : {} ", sNombreCiudad);

		MOLOG.info("[EVL] Objeto Person Pais  : {} {} {} {} {} {} ", oCEPersona.getId(), oCEPersona.getCodigo(), oCEPersona.getNombre(), oCEPersona.getApodo(), oCEPersona.getPais().getNombre(), oCEPersona.getPais().getCiudades().get(0).getNombre());		

		((ClassPathXmlApplicationContext) oCntx).close();
		MOLOG.info("[EVL] Finish");	
	}
}
