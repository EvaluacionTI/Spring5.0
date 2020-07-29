package pe.bbva.evalua.spring5.view;

import java.sql.Connection;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class CV0101v01ValidarConexionPostgres {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0101v01ValidarConexionPostgres.class);
	private static ConfigurableApplicationContext moCntx;
	
	public static void main(String[] args) throws SQLException {
		MOLOG.info("[EVL] =====[ Start main ]=====");
		
		// Referencio a la ruta donde se ubica el contexto
		moCntx = new ClassPathXmlApplicationContext("classpath:/pe/bbva/evalua/spring5/database/spring-postgres.xml");
		MOLOG.info("[EVL] Context : {}", moCntx);
		
		// Conexion a bd
		DriverManagerDataSource oDataSource = (DriverManagerDataSource) moCntx.getBean("dataSource");
		MOLOG.info("[EVL] DriverManagerDataSource : {}", oDataSource);
		
		Connection oConnection = oDataSource.getConnection();
		MOLOG.info("[EVL] Connection : {}", oConnection.isValid(0));
		

		((ConfigurableApplicationContext) moCntx).close();		
	}
}
