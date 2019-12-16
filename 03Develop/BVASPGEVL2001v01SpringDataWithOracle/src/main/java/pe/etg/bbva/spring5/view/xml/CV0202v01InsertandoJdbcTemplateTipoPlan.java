package pe.etg.bbva.spring5.view.xml;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring5.entity.oracle.CE01TipoPlan;
import pe.etg.bbva.spring5.model.impl.CD02TipoPlanJdbcTemplate;

public class CV0202v01InsertandoJdbcTemplateTipoPlan {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0202v01InsertandoJdbcTemplateTipoPlan.class);
	private static ConfigurableApplicationContext moCntx;
	private static SimpleDateFormat oSDF = new SimpleDateFormat("dd/MM/yyyy");
	private static String[] configContexto = {
			"classpath:/database/spring-oracle-jdbctemplate.xml"
    };

	public static void main(String[] args) throws ParseException {
		MOLOG.info("=====> [EVL] Start method main(String[] args)");

		moCntx = new ClassPathXmlApplicationContext(configContexto);
		CD02TipoPlanJdbcTemplate oCDTipoPlan = (CD02TipoPlanJdbcTemplate) moCntx.getBean("idTipoPlan");

		MOLOG.info("====> Iniciando contexto : {} ", moCntx);
		MOLOG.info("====> Iniciando bean  CD01TipoPlan: {} ", oCDTipoPlan);
	
		CE01TipoPlan oCETipoPlan = new CE01TipoPlan();
		
		oCETipoPlan.setCodigoTipoPlan("S");
		oCETipoPlan.setCodigoEmpresa("05");
		oCETipoPlan.setCodigoIdioma("ES");
		oCETipoPlan.setAbreviatura("PCSBS");
		oCETipoPlan.setDescripcion("PLAN CONTABLE SBS");
		oCETipoPlan.setSiNoVisualizar("1");
		oCETipoPlan.setSiNoEditar("0");
		oCETipoPlan.setSiNoAnula("1");
		oCETipoPlan.setSiNoElimina("0");
		oCETipoPlan.setSiNoDefault("1");
		oCETipoPlan.setSiNoActivo("1");			
		oCETipoPlan.setUsuarioNuevo("EDIAZ");
		oCETipoPlan.setFechaAlta(oSDF.parse("05/01/2002"));
		oCETipoPlan.setUsuarioUltimaModificacion(null);
		oCETipoPlan.setFechaUltimaModificacion(null);
		
		MOLOG.info("====> Creando objeto CETipoCuenta : {} ", oCETipoPlan);
		
		MOLOG.info("====> Grabando con method agregarTipoCuenta ");
		
		oCDTipoPlan.grabarTipoPlan(oCETipoPlan);
		
		MOLOG.info(" =====> [EVL] End method main(String[] args)");
		((ConfigurableApplicationContext) moCntx).close();		
	}

}
