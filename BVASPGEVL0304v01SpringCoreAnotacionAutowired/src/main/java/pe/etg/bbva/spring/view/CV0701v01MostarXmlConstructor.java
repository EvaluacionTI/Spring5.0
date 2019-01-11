package pe.etg.bbva.spring.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring.entity.CE0701v01Person;

public class CV0701v01MostarXmlConstructor {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0701v01MostarXmlConstructor.class);
	private static ApplicationContext oCntx;
	
	public static void main(String[] args) {
		MOLOG.info("[EVL] Start");
		MOLOG.info("[EVL] Antes de instanciar el Context : {}", oCntx);
		oCntx = new ClassPathXmlApplicationContext("classpath:/spring/spring0701v01-person-constructor.xml");

		MOLOG.info("[EVL] Instancia del context : {}", oCntx);
		MOLOG.info("[EVL] Vinculando el bean instanciado ");
		
		CE0701v01Person oCEPersona = (CE0701v01Person) oCntx.getBean("idCEPerson");
		
		MOLOG.info("[EVL] Instancia Person : {} ", oCEPersona);
		MOLOG.info("[EVL] Objeto Person : {} {} ", oCEPersona.getCodigo(), oCEPersona.getNombre());
		
		((ClassPathXmlApplicationContext) oCntx).close();
		MOLOG.info("[EVL] Finish");	
	}

}
