package pe.etg.bbva.spring5.view.xml;

import java.sql.SQLException;
import java.text.ParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring5.model.impl.CD01TipoPlan;

public class CV0104v01EliminandoTipoPlan {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0104v01EliminandoTipoPlan.class);
	private static ConfigurableApplicationContext moCntx;
	private static String[] configContexto = {
			"classpath:/database/spring-oracle.xml"
    };
	
	public static void main(String[] args) throws SQLException, ParseException {
		MOLOG.info("=====> [EVL] Start method main(String[] args)");

		moCntx = new ClassPathXmlApplicationContext(configContexto);
		CD01TipoPlan oCDTipoPlan = (CD01TipoPlan) moCntx.getBean("idTipoPlan");
		
		MOLOG.info("=> [EVL] Iniciando contexto           : {} ", moCntx);
		MOLOG.info("=> [EVL] Iniciando bean  CD01TipoPlan : {} ", oCDTipoPlan);
		
		oCDTipoPlan.eliminarTipoPlan("S");;
		
		MOLOG.info(" =====> [EVL] End method main(String[] args)");
		((ConfigurableApplicationContext) moCntx).close();		
	}
}
