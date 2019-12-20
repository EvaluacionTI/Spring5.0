package pe.etg.bbva.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.etg.bbva.spring5.entity.CEPerson;
import pe.etg.bbva.spring5.model.CD0401v01ConfiguracionConexionAnotacionOracle;
import pe.etg.bbva.spring5.model.CI0401v01PersonAnotation;

public class CV0406v01ConsultaAllDataPerson {
	public static final Logger MOLOG = LoggerFactory.getLogger(CV0406v01ConsultaAllDataPerson.class);
	private static ApplicationContext oCntx;
	
	public static void main(String[] args) {
		MOLOG.info("[EVL] Start");

		oCntx = new AnnotationConfigApplicationContext(CD0401v01ConfiguracionConexionAnotacionOracle.class);
		MOLOG.info("[EVL] Instanciando el contexto : {} ", oCntx);
		
		CI0401v01PersonAnotation oCDPerson = oCntx.getBean(CI0401v01PersonAnotation.class);
		MOLOG.info("[EVL] Instanciando el CI0201v01Person : {} ", oCDPerson);
		
		for( CEPerson p : oCDPerson.loadAll()) {
			MOLOG.info("[EVL] Registro leido : {} {} {} {}", p.getId(), p.getFirstName(), p.getLastName(), p.getAddress());
		}
		
		((AnnotationConfigApplicationContext) oCntx).close();
		MOLOG.info("[EVL] Finish");
	}

}
