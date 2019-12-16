package pe.etg.bbva.spring5.view.xml;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring5.entity.CE01TipoPlan;
import pe.etg.bbva.spring5.model.impl.CD03TipoPlanJdbcDaoSupport;

public class CV0306v01ConsultaJdbcDaoSupportTipoPlanAll {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0306v01ConsultaJdbcDaoSupportTipoPlanAll.class);
	private static ConfigurableApplicationContext moCntx;
	private static String[] configContexto = {
			"classpath:/database/spring-oracle-jdbcdaosupport.xml"
    };

	public static void main(String[] args) throws ParseException {
		MOLOG.info("=====> [EVL] Start method main(String[] args)");

		List<CE01TipoPlan> oListaTipoPlan = new ArrayList<>();
		moCntx = new ClassPathXmlApplicationContext(configContexto);
		CD03TipoPlanJdbcDaoSupport oCDTipoPlan = (CD03TipoPlanJdbcDaoSupport) moCntx.getBean("idTipoPlan");
		
		MOLOG.info("=> [EVL] Iniciando contexto           : {} ", moCntx);
		MOLOG.info("=> [EVL] Iniciando bean  CD01TipoPlan : {} ", oCDTipoPlan);
	
		oListaTipoPlan = oCDTipoPlan.listaAllTipoPlan();
		
		MOLOG.info("====> Cantidad de Tipo Plan : {} ", oListaTipoPlan.size());
		
		MOLOG.info(" =====> [EVL] End method main(String[] args)");
		((ConfigurableApplicationContext) moCntx).close();		
	}
}
