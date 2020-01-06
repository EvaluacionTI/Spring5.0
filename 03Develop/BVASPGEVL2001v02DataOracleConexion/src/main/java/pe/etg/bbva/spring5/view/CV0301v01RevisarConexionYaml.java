package pe.etg.bbva.spring5.view;

import java.sql.Connection;
import java.sql.SQLException;

import javax.activation.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import pe.etg.bbva.spring5.model.CD0401v01ConfiguracionConexionAnotacionOracle;

public class CV0301v01RevisarConexionYaml {
	public static final Logger MOLOG = LoggerFactory.getLogger(CV0301v01RevisarConexionYaml.class);
	private static AnnotationConfigApplicationContext oCntx;
	
	public static void main(String[] args) throws SQLException {
		MOLOG.info("[EVL] Start");
		oCntx = new AnnotationConfigApplicationContext(CD0401v01ConfiguracionConexionAnotacionOracle.class);
		MOLOG.info("[EVL] Instanciando el contexto : {} ", oCntx);
		
		DriverManagerDataSource oDS = oCntx.getBean("dataSource", DriverManagerDataSource.class);
		MOLOG.info("[EVL] DataSource : {}", oDS);
		
		Connection oCxn = oDS.getConnection();
		MOLOG.info("[EVL] Revisar estatus de conexión : {}", oCxn.isValid(0));

	}

}
