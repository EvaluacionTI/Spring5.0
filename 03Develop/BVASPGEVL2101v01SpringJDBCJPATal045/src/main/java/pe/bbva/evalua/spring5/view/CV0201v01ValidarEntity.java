package pe.bbva.evalua.spring5.view;

import java.text.ParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.entity.CE01TipoPlan;

public class CV0201v01ValidarEntity {
	private static Logger MOLOG = LoggerFactory.getLogger("CV0201v01ValidarEntity");
	
	private static ConfigurableApplicationContext moCntx;
	// 2. Definimos el contexto
	private static String[] configContexto = {
			"classpath:/pe/bbva/evalua/spring5/entity/spring-bean-entity.xml"
    };
	
	public static void main(String[] args) throws ParseException {
		MOLOG.info("[EVL] =====[ Start main ]=====");

		moCntx = new ClassPathXmlApplicationContext(configContexto);
		MOLOG.info("[EVL] Iniciando contexto     : {}", moCntx);
		
		CE01TipoPlan oCETipoPlan = (CE01TipoPlan) moCntx.getBean("idCETipoPlan");
		MOLOG.info("[EVL] Entidad Tipo Plan      : {}", oCETipoPlan);

		((ConfigurableApplicationContext) moCntx).close();		
	}
}
