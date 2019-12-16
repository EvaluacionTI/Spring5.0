package pe.etg.bbva.spring5.view.xml;

import java.sql.Connection;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import pe.etg.bbva.spring5.model.impl.CD03TipoPlanJdbcDaoSupport;

public class CV0301v01ConsultaXmlJdbcDaoConexionOracle {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0301v01ConsultaXmlJdbcDaoConexionOracle.class);
	private static ConfigurableApplicationContext moCntx;
	private static String[] configContexto = {
			"classpath:/database/spring-oracle-jdbcdaosupport.xml"
    };
	public static void main(String[] args) throws SQLException{
		MOLOG.info("=====> [EVL] Start method main(String[] args)");
		
		moCntx = new ClassPathXmlApplicationContext(configContexto);
		DriverManagerDataSource oDataSource = (DriverManagerDataSource) moCntx.getBean("dataSource");
		CD03TipoPlanJdbcDaoSupport oCDTipoPlan = (CD03TipoPlanJdbcDaoSupport) moCntx.getBean("idTipoPlan");
		Connection oConnection = oDataSource.getConnection();

		MOLOG.info("=> [EVL] Context 				 : {}", moCntx);
		MOLOG.info("=> [EVL] DriverManagerDataSource : {}", oDataSource);
		MOLOG.info("=> [EVL] Connection 			 : {}", oConnection);
		MOLOG.info("=> [EVL] JdbcDaoSupport 		 : {}", oCDTipoPlan);
		
		MOLOG.info(" =====> [EVL] End method main(String[] args)");
		((ConfigurableApplicationContext) moCntx).close();
	}

}
