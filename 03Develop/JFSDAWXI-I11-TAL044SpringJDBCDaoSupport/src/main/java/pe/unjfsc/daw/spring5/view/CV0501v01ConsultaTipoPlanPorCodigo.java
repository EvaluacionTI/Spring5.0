package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CE01TipoPlan;
import pe.unjfsc.daw.spring5.model.postgres.CD01TipoPlan;

public class CV0501v01ConsultaTipoPlanPorCodigo {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0501v01ConsultaTipoPlanPorCodigo.class);
	private static ConfigurableApplicationContext moCntx;
	private static String[] configContexto = {
			"classpath:/spring/database/spring-postgres.xml",
			"classpath:/spring/entity/spring-bean-tipo-plan.xml"
    };
	public static void main(String[] args){

		MOLOG.info("=====> [EVL] Start method main(String[] args)");

		moCntx = new ClassPathXmlApplicationContext(configContexto);
		CD01TipoPlan oCDTipoPlan = (CD01TipoPlan) moCntx.getBean("idCDTipoPlan");
 		
		MOLOG.info("=> [EVL] Iniciando contexto     : {}", moCntx);
		MOLOG.info("=> [EVL] Controladora Tipo Plan : {}", oCDTipoPlan);
	
		CE01TipoPlan oCETipoPlan = oCDTipoPlan.buscarTipoPlan("G");;
		MOLOG.info("=> [EVL] Bean  CETipoPlan: {} ", oCETipoPlan);
		
		MOLOG.info(" =====> [EVL] End method main(String[] args)");
		((ConfigurableApplicationContext) moCntx).close();		
	}
}
