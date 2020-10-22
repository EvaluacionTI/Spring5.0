package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CE01TipoPlan;
import pe.unjfsc.daw.spring5.model.impl.CD01TipoPlan;

public class CV0501v01ConsultaTipoPlanPorCodigo {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0501v01ConsultaTipoPlanPorCodigo.class);
	private static ConfigurableApplicationContext moCntx;
	private static String[] configContexto = {
			"classpath:/pe/unjfsc/daw/spring5/database/spring-postgres.xml",
			"classpath:/pe/unjfsc/daw/spring5/entity/spring-bean-tipo-plan.xml"
    };
	public static void main(String[] args){
		MOLOG.info("[EVL] =====[ Start main ]=====");

		moCntx = new ClassPathXmlApplicationContext(configContexto);
		MOLOG.info("[EVL] Iniciando contexto     : {}", moCntx);
		CD01TipoPlan oCDTipoPlan = (CD01TipoPlan) moCntx.getBean("idCDTipoPlan");
		MOLOG.info("[EVL] CD01TipoPlan : {}", oCDTipoPlan);
	
		CE01TipoPlan oCETipoPlan = oCDTipoPlan.buscarTipoPlan("G");;
		MOLOG.info("[EVL] CETipoPlan: {} ", oCETipoPlan);
		
		((ConfigurableApplicationContext) moCntx).close();		
	}
}
