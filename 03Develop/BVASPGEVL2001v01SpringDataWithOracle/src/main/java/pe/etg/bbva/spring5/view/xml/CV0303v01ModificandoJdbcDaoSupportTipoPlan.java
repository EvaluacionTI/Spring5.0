package pe.etg.bbva.spring5.view.xml;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring5.entity.CE01TipoPlan;
import pe.etg.bbva.spring5.model.impl.CD03TipoPlanJdbcDaoSupport;

public class CV0303v01ModificandoJdbcDaoSupportTipoPlan {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0303v01ModificandoJdbcDaoSupportTipoPlan.class);
	private static ConfigurableApplicationContext moCntx;
	private static SimpleDateFormat oSDF = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	private static String[] configContexto = {
			"classpath:/database/spring-oracle-jdbcdaosupport.xml"
    };
	
	public static void main(String[] args) throws ParseException {
		MOLOG.info("=====> [EVL] Start method main(String[] args)");

		moCntx = new ClassPathXmlApplicationContext(configContexto);
		CD03TipoPlanJdbcDaoSupport oCDTipoPlan = (CD03TipoPlanJdbcDaoSupport) moCntx.getBean("idTipoPlan");
		
		MOLOG.info("=> [EVL] Iniciando contexto           : {} ", moCntx);
		MOLOG.info("=> [EVL] Iniciando bean  CD01TipoPlan : {} ", oCDTipoPlan);
	
		CE01TipoPlan oCETipoPlan = new CE01TipoPlan();
		
		oCETipoPlan.setCodigoTipoPlan("S");
		oCETipoPlan.setCodigoEmpresa("50");
		oCETipoPlan.setCodigoIdioma("EN");
		oCETipoPlan.setAbreviatura("PCSBSX");
		oCETipoPlan.setDescripcion("XXX PLAN CONTABLE SBS XXX");
		oCETipoPlan.setSiNoVisualizar(false);
		oCETipoPlan.setSiNoEditar(false);
		oCETipoPlan.setSiNoAnula(false);
		oCETipoPlan.setSiNoElimina(false);
		oCETipoPlan.setSiNoDefault(false);
		oCETipoPlan.setSiNoActivo(false);			
		oCETipoPlan.setUsuarioNuevo("EDIAZ");
		oCETipoPlan.setFechaAlta(oSDF.parse("05/01/2002 00:00:00"));
		oCETipoPlan.setUsuarioUltimaModificacion("IADIAZ");
		oCETipoPlan.setFechaUltimaModificacion(oSDF.parse("22/08/2014 15:51:35"));
		
		MOLOG.info("=> [EVL] Objeto CETipoPlan  : {} ", oCETipoPlan);
		oCDTipoPlan.actualizarTipoPlan(oCETipoPlan);
		
		MOLOG.info(" =====> [EVL] End method main(String[] args)");
		((ConfigurableApplicationContext) moCntx).close();
	}

}
