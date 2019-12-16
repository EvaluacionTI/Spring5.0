package pe.etg.bbva.spring5.view;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.etg.bbva.spring5.config.CG02AnotacionConfigPropertiesOracle;

public class CV0102v01ConsultAnotacionConexionOracle {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0102v01ConsultAnotacionConexionOracle.class);
	private static AnnotationConfigApplicationContext moCntx;
	
	public static void main(String[] args) throws SQLException{
		MOLOG.info("=====> [EVL] Start method main(String[] args)");
		
		moCntx = new AnnotationConfigApplicationContext(CG02AnotacionConfigPropertiesOracle.class);
		DataSource oDS = (DataSource) moCntx.getBean("dataSource");
		Connection oConnection = oDS.getConnection();

		MOLOG.info("=> [EVL] Context           : {}", moCntx);
		MOLOG.info("=> [EVL] DataSource Oracle : {}", oDS);
		MOLOG.info("=> [EVL] Conexion Oracle   : {}", oConnection);
		
		MOLOG.info(" =====> [EVL] End method main(String[] args)");
		((ConfigurableApplicationContext) moCntx).close();
	}	
}
