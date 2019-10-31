package pe.bbva.spring.batch.vista;

import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations = {"classpath:/batch/config/batch-context.xml"})
public class CV0102v01ValidarContextBacthTest {
	private static Logger MOLOG = LogManager.getLogger(CV0102v01ValidarContextBacthTest.class);
	
	@Autowired
	SingleConnectionDataSource moDataSource;
	
	@Test
	public void testValidarContexto() {
		
		try {
			AnnotationConfigApplicationContext oCntx= new AnnotationConfigApplicationContext();

			MOLOG.info("====> Cargando el Contexto [ " + oCntx);
			MOLOG.info("====> Nombre de beans      [ " + oCntx.getDisplayName());
			MOLOG.info("====> Cantidad de beans    [ " + oCntx.getBeanDefinitionCount());
			MOLOG.info("====> Resources    [ " + oCntx.getResource("batch-context.xml"));
			oCntx.refresh();
			MOLOG.debug("====> Bean dataSource      [ " + oCntx.getBean("dataSource").getClass());
			MOLOG.debug("====> Bean transactionManager    [ " + oCntx.getBean("transactionManager"));
			MOLOG.debug("====> Bean del Repository  [ " + oCntx.getBean("JobRepository"));
			MOLOG.debug("====> Bean jobs			   [ " + oCntx.getBean("idJobLauncher"));
			MOLOG.debug("====> Catalogo 			   [ " + moDataSource.getCatalog());
			assertNotNull(oCntx);
			
		}catch(Exception ex) {
			MOLOG.info(ex.getMessage());
		}
		

	
//		fail("Not yet implemented");
	}

}
