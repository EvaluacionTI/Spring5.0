package pe.etg.bbva.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring5.entity.CEPerson;
import pe.etg.bbva.spring5.model.CI0201v01Person;

public class CV0206v02ConsultaAllDataPerson {
	public static final Logger MOLOG = LoggerFactory.getLogger(CV0206v02ConsultaAllDataPerson.class);
	private static ApplicationContext oCntx;
	
	public static void main(String[] args) {
		MOLOG.info("[EVL] Start");
		MOLOG.info("[EVL] Start");
		oCntx = new ClassPathXmlApplicationContext("/beans/spring0201v02-person.xml");
		MOLOG.info("[EVL] Instanciando el contexto : {} ", oCntx);
		
		CI0201v01Person oCDPerson = oCntx.getBean(CI0201v01Person.class);
		MOLOG.info("[EVL] Instanciando el CI0201v01Person : {} ", oCDPerson);
		
		for( CEPerson p : oCDPerson.loadAll()) {
			MOLOG.info("[EVL] Registro leido : {} {} {} {}", p.getId(), p.getFirstName(), p.getLastName(), p.getAddress());
		}
		
		((ClassPathXmlApplicationContext) oCntx).close();
		MOLOG.info("[EVL] Finish");
	}

}
