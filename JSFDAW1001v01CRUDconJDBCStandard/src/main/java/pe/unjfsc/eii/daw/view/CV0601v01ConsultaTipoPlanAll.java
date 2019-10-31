package pe.unjfsc.eii.daw.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import pe.unjfsc.eii.daw.entity.CE01TipoPlan;
import pe.unjfsc.eii.daw.model.CD01TipoPlan;

public class CV0601v01ConsultaTipoPlanAll {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0601v01ConsultaTipoPlanAll.class);
	private static ConfigurableApplicationContext moCntx;
	private static String[] configContexto = {
			"classpath:/spring/database/spring-postgres.xml",
			"classpath:/spring/entity/spring-bean-tipo-plan.xml"
    };
	public static void main(String[] args) throws SQLException {
		MOLOG.info("=====> [EVL] Start method main(String[] args)");

		List<CE01TipoPlan> oListaTipoPlan = new ArrayList<>();
		moCntx = new ClassPathXmlApplicationContext(configContexto);
		DriverManagerDataSource oDataSource = (DriverManagerDataSource) moCntx.getBean("idDriverManagerDataSource");
		CD01TipoPlan oCDTipoPlan = (CD01TipoPlan) moCntx.getBean("idTipoPlan");
		
		MOLOG.info("=> [EVL] Iniciando contexto           : {} ", moCntx);
		MOLOG.info("=> [EVL] DriverManagerDataSource      : {}", oDataSource);
		MOLOG.info("=> [EVL] Iniciando bean  CD01TipoPlan : {} ", oCDTipoPlan);
	
		oListaTipoPlan = oCDTipoPlan.listarAllTipoPlan();
		
		MOLOG.info("====> Cantidad de Tipo Plan : {} ", oListaTipoPlan.size());
		
		MOLOG.info(" =====> [EVL] End method main(String[] args)");
		((ConfigurableApplicationContext) moCntx).close();		

	}

}
