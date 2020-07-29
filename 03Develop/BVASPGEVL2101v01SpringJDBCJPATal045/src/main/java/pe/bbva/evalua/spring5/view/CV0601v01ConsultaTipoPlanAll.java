package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.bbva.evalua.spring5.model.impl.CDTipoPlanService;

public class CV0601v01ConsultaTipoPlanAll {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0601v01ConsultaTipoPlanAll.class);
	private static ConfigurableApplicationContext moCntx;
	private static String[] configContexto = {
			"classpath:/pe/bbva/evalua/spring5/database/spring-persistence-jpa.xml"
    };
	public static void main(String[] args){
		MOLOG.info("[EVL] =====[ Start main ]=====");

		moCntx = new ClassPathXmlApplicationContext(configContexto);
		MOLOG.info("[EVL] Instance of context     : {}", moCntx);
		
		CDTipoPlanService oCDTipoPlan = moCntx.getBean(CDTipoPlanService.class);
		MOLOG.info("[EVL] Instance of CDTipoPlanService : {}", oCDTipoPlan);
		MOLOG.info("[EVL] listAll : {}", oCDTipoPlan.listAll());
		
		((ConfigurableApplicationContext) moCntx).close();		
	}
}
