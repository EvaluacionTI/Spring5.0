package pe.etg.bbva.spring.batch.view;

import static org.junit.Assert.assertNotNull;

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
            "classpath:batch/config/job01-database-h2.xml"
    };

	@Test
	public void testContextNotNulo() throws SQLException {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext(configBD);
		
		MOLOG.info("[EVL] Cargando el Contexto de la Base de Datos [ " + oCntx);
		
		SingleConnectionDataSource oCxnDataSource = (SingleConnectionDataSource) oCntx.getBean("dataSource");
		
		MOLOG.info("[EVL] Invocando al DataSource 	  [ " + oCxnDataSource);
		MOLOG.info("[EVL] Referencia al getConnection [ " + oCxnDataSource.getConnection());
		
		DataSourceTransactionManager oDSTrn = (DataSourceTransactionManager) oCntx.getBean("transactionManager");
		MOLOG.info("[EVL] oDSTrn.toString() 		 			[ " +oDSTrn.toString());
		MOLOG.info("[EVL] oDSTrn.getDefaultTimeout() 			[ " +oDSTrn.getDefaultTimeout());
		MOLOG.info("[EVL] oDSTrn.getTransactionSynchronization()[ " +oDSTrn.getTransactionSynchronization());
		MOLOG.info("[EVL] oDSTrn.getDataSource() 				[ " +oDSTrn.getDataSource());
		MOLOG.info("[EVL] oDSTrn.getResourceFactory()	 		[ " +oDSTrn.getResourceFactory());
		MOLOG.info("[EVL] oDSTrn.getTransaction(null) 			[ " +oDSTrn.getTransaction(null));
		
		assertNotNull(oCntx);
		
		//fail("Not yet implemented");
	}

}
