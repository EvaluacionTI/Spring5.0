package pe.etg.bbva.spring5.view;

import java.sql.Connection;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class CV0201v01RevisarConexionOracleXml {
	public static final Logger MOLOG = LoggerFactory.getLogger(CV0201v01RevisarConexionOracleXml.class);
	private static ApplicationContext oCntx;
	
	public static void main(String[] args) throws SQLException {
		MOLOG.info("[EVL] Start");
		oCntx = new ClassPathXmlApplicationContext("/database/spring-oracle01.xml");
		MOLOG.info("[EVL] Instanciando el contexto : {} ", oCntx);
		
		DriverManagerDataSource oDS = (DriverManagerDataSource) oCntx.getBean ("dataSource");
		
		//DriverManagerDataSource oDS = oCntx.getBean("dataSource", DriverManagerDataSource.class);
		MOLOG.info("[EVL] DataSource : {}", oDS);
		
		Connection oCxn = oDS.getConnection();
		MOLOG.info("[EVL] Revisar estatus de conexión : {}", oCxn.isValid(0));
		
		MOLOG.info("[EVL] Finish");
	}
}
