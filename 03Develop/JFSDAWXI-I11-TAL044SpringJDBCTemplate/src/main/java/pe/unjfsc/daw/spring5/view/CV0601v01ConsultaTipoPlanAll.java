package pe.unjfsc.daw.spring5.view;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CE01TipoPlan;
import pe.unjfsc.daw.spring5.model.impl.CD01TipoPlan;

public class CV0601v01ConsultaTipoPlanAll {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0601v01ConsultaTipoPlanAll.class);
	private static ConfigurableApplicationContext moCntx;
	private static String[] configContexto = {
			"classpath:/pe/unjfsc/daw/spring5/database/spring-postgres.xml",
			"classpath:/pe/unjfsc/daw/spring5/entity/spring-bean-tipo-plan.xml"
    };
	public static void main(String[] args){
		MOLOG.info("[EVL] =====[ Start main ]=====");

		List<CE01TipoPlan> oListaTipoPlan = new ArrayList<CE01TipoPlan>();
		MOLOG.info("[EVL] Instance List<CE01TipoPlan>     : {}", oListaTipoPlan);
		
		moCntx = new ClassPathXmlApplicationContext(configContexto);
		MOLOG.info("[EVL] Instance of context     : {}", moCntx);
		
		CD01TipoPlan oCDTipoPlan = (CD01TipoPlan) moCntx.getBean("idCDTipoPlan");
		MOLOG.info("[EVL] Controladora Tipo Plan : {}", oCDTipoPlan);
		
		CE01TipoPlan oCETipoPlan = new CE01TipoPlan();
		MOLOG.info("[EVL] Entidad Tipo Plan      : {}", oCETipoPlan);
	
		oListaTipoPlan = oCDTipoPlan.listaAllTipoPlan();
		MOLOG.info("====> Cantidad de Tipo Plan : {} ", oListaTipoPlan.size());
		
		((ConfigurableApplicationContext) moCntx).close();		
	}
}
