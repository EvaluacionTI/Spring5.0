package pe.unjfsc.daw.sesion09.view;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.sesion09.entity.CE01TipoPlan;
import pe.unjfsc.daw.sesion09.model.postgres.CD01TipoPlan;

public class CV0601v01ConsultaTipoPlanAll {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0601v01ConsultaTipoPlanAll.class);
	private static ConfigurableApplicationContext moCntx;
	private static String[] configContexto = {
			"classpath:/spring/database/spring-postgres.xml",
			"classpath:/spring/entity/spring-bean-tipo-plan.xml"
    };
	public static void main(String[] args){
		MOLOG.info("=====> [EVL] Start method main(String[] args)");

		List<CE01TipoPlan> oListaTipoPlan = new ArrayList<>();
		moCntx = new ClassPathXmlApplicationContext(configContexto);
		CD01TipoPlan oCDTipoPlan = (CD01TipoPlan) moCntx.getBean("idCDTipoPlan");
 		CE01TipoPlan oCETipoPlan = new CE01TipoPlan();
 		
		MOLOG.info("=> [EVL] Iniciando contexto     : {}", moCntx);
		MOLOG.info("=> [EVL] Controladora Tipo Plan : {}", oCDTipoPlan);
		MOLOG.info("=> [EVL] Entidad Tipo Plan      : {}", oCETipoPlan);
	
		oListaTipoPlan = oCDTipoPlan.listaAllTipoPlan();
		
		MOLOG.info("====> Cantidad de Tipo Plan : {} ", oListaTipoPlan.size());
		
		MOLOG.info(" =====> [EVL] End method main(String[] args)");
		((ConfigurableApplicationContext) moCntx).close();		
	}
}
