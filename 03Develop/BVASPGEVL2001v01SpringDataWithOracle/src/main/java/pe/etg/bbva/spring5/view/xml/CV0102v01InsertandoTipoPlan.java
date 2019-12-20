package pe.etg.bbva.spring5.view.xml;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring5.entity.CE01TipoPlan;
import pe.etg.bbva.spring5.model.impl.CD01TipoPlan;

public class CV0102v01InsertandoTipoPlan {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0102v01InsertandoTipoPlan.class);
	private static ConfigurableApplicationContext moCntx;
	private static SimpleDateFormat oSDF = new SimpleDateFormat("dd/MM/yyyy");
	private static String[] configContexto = {
			"classpath:/database/spring-oracle.xml"
    };

	public static void main(String[] args) throws SQLException, ParseException {
		MOLOG.info("=====> [EVL] Start method main(String[] args)");

		moCntx = new ClassPathXmlApplicationContext(configContexto);
		CD01TipoPlan oCDTipoPlan = (CD01TipoPlan) moCntx.getBean("idTipoPlan");

		MOLOG.info("=> [EVL] Iniciando contexto          : {} ", moCntx);
		MOLOG.info("=> [EVL] Iniciando bean CD01TipoPlan : {} ", oCDTipoPlan);
	
		CE01TipoPlan oCETipoPlan = new CE01TipoPlan();
		
		oCETipoPlan.setCodigoTipoPlan("S");
		oCETipoPlan.setCodigoEmpresa("05");
		oCETipoPlan.setCodigoIdioma("ES");
		oCETipoPlan.setAbreviatura("PCSBS");
		oCETipoPlan.setDescripcion("PLAN CONTABLE SBS");
		oCETipoPlan.setSiNoVisualizar(true);
		oCETipoPlan.setSiNoEditar(false);
		oCETipoPlan.setSiNoAnula(true);
		oCETipoPlan.setSiNoElimina(false);
		oCETipoPlan.setSiNoDefault(true);
		oCETipoPlan.setSiNoActivo(true);			
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
