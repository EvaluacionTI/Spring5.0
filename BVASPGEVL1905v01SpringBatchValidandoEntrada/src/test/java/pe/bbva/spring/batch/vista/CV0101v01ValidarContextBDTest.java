package pe.bbva.spring.batch.vista;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;


public class CV0101v01ValidarContextBDTest {
	private static Logger MOLOG = LogManager.getLogger(CV0101v01ValidarContextBDTest.class);
	
	String[] configBD = {
            "classpath:batch/config/database-h2.xml"
    };

	@Test
	public void testContextNotNulo() throws SQLException {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext(configBD);
		
		MOLOG.info("====> Cargando el Contexto de la Base de Datos [ " + oCntx);
		
		SingleConnectionDataSource oCxnDataSource = (SingleConnectionDataSource) oCntx.getBean("dataSource");
		
		
		MOLOG.info("====> Invocando al DataSource [ " + oCxnDataSource);
		MOLOG.info("====> Referencia al getConnection [ " + oCxnDataSource.getConnection());
		
		DataSourceTransactionManager oDSTrn = (DataSourceTransactionManager) oCntx.getBean("transactionManager");
		MOLOG.info("====> Administrador de transacciones del Data Source [ " +oDSTrn.toString());
		MOLOG.info("====> Administrador de transacciones del Data Source [ " +oDSTrn.getDefaultTimeout());
		MOLOG.info("====> Administrador de transacciones del Data Source [ " +oDSTrn.getTransactionSynchronization());
		MOLOG.info("====> Administrador de transacciones del Data Source [ " +oDSTrn.getDataSource());
		MOLOG.info("====> Administrador de transacciones del Data Source [ " +oDSTrn.getResourceFactory());
		MOLOG.info("====> Administrador de transacciones del Data Source [ " +oDSTrn.getTransaction(null));
		
		assertNotNull(oCntx);
		
		//fail("Not yet implemented");
	}

}
