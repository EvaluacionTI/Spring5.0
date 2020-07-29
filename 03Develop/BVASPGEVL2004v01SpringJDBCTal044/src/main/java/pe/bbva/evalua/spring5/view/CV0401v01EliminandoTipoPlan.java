package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.model.impl.CD01TipoPlan;

public class CV0401v01EliminandoTipoPlan {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0401v01EliminandoTipoPlan.class);
	private static ConfigurableApplicationContext moCntx;
	private static String[] configContexto = {
			"classpath:/pe/bbva/evalua/spring5/database/spring-postgres.xml",
			"classpath:/pe/bbva/evalua/spring5/entity/spring-bean-tipo-plan.xml"
    };

	public static void main(String[] args) {
		MOLOG.info("[EVL] =====[ Start main ]=====");

		moCntx = new ClassPathXmlApplicationContext(configContexto);
		MOLOG.info("[EVL] Instance context     : {}", moCntx);
		CD01TipoPlan oCDTipoPlan = (CD01TipoPlan) moCntx.getBean("idCDTipoPlan");
		MOLOG.info("[EVL] Instance CD01TipoPlan : {}", oCDTipoPlan);
				
		oCDTipoPlan.eliminarTipoPlan("C");
		MOLOG.info("[EVL] Instance After CD01TipoPlan : {}", oCDTipoPlan);
		((ConfigurableApplicationContext) moCntx).close();		
	}
}
