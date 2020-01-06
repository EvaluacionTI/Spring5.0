package pe.etg.bbva.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring5.entity.CEPerson;
import pe.etg.bbva.spring5.model.CI0201v01Person;

public class CV0204v01EliminarDataPerson {
	public static final Logger MOLOG = LoggerFactory.getLogger(CV0204v01EliminarDataPerson.class);
	private static ApplicationContext oCntx;
	
	public static void main(String[] args) {
		MOLOG.info("[EVL] Start");
		MOLOG.info("[EVL] Start");
		oCntx = new ClassPathXmlApplicationContext("/beans/spring-person01.xml");
		MOLOG.info("[EVL] Instanciando el contexto : {} ", oCntx);
		
		CI0201v01Person oCDPerson = oCntx.getBean(CI0201v01Person.class);
		
		CEPerson oCEPerson = new CEPerson();
		
		oCEPerson.setId(20);
		oCEPerson.setFirstName("CANAL APX");
		oCEPerson.setLastName("HOST y APX");
		oCEPerson.setAddress("ARQUITECTURA APX");
		
		oCDPerson.save(oCEPerson);
		
		((ClassPathXmlApplicationContext) oCntx).close();
		MOLOG.info("[EVL] Finish");
	}

}
