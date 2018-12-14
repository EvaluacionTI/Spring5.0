package pe.etg.bbva.spring.view.xml;

import java.sql.Connection;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class CV0201v01ConsultaXmlJdbcTemplateConexionOracle {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0201v01ConsultaXmlJdbcTemplateConexionOracle.class);
	private static ConfigurableApplicationContext moCntx;
	private static String[] configContexto = {
			"classpath:/database/spring-oracle-jdbctemplate.xml"
    };
	public static void main(String[] args) throws SQLException{
		MOLOG.info("=====> [EVL] Start method main(String[] args)");
		
		moCntx = new ClassPathXmlApplicationContext(configContexto);
		DriverManagerDataSource oDataSource = (DriverManagerDataSource) moCntx.getBean("dataSource");
		Connection oConnection = oDataSource.getConnection();

		MOLOG.info("=> [EVL] Context 				 : {}", moCntx);
		MOLOG.info("=> [EVL] DriverManagerDataSource : {}", oDataSource);
		MOLOG.info("=> [EVL] Connection 			 : {}", oConnection);
		
		MOLOG.info(" =====> [EVL] End method main(String[] args)");
		((ConfigurableApplicationContext) moCntx).close();
	}

}
