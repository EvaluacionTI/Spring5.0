package pe.etg.bbva.spring.batch.view;

import static org.junit.Assert.assertNotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations = {"classpath:/batch/config/job02-batch-context.xml"})
public class CV0102v01ValidarContextBacthTest {
	private static Logger MOLOG = LogManager.getLogger(CV0102v01ValidarContextBacthTest.class);
	
	@Autowired
	SingleConnectionDataSource moDataSource;
	
	@Test
	public void testValidarContexto() {
		
		try {
			AnnotationConfigApplicationContext oCntx= new AnnotationConfigApplicationContext();

			MOLOG.info("[EVL] Cargando el Contexto [ " + oCntx);
			MOLOG.info("[EVL] Nombre de beans      [ " + oCntx.getDisplayName());
			MOLOG.info("[EVL] Cantidad de beans    [ " + oCntx.getBeanDefinitionCount());
			MOLOG.info("[EVL] Resources    [ " + oCntx.getResource("batch-context.xml"));
			oCntx.refresh();
			MOLOG.debug("[EVL] Bean dataSource      [ " + oCntx.getBean("dataSource").getClass());
			MOLOG.debug("[EVL] Bean transactionManager    [ " + oCntx.getBean("transactionManager"));
			MOLOG.debug("[EVL] Bean del Repository  [ " + oCntx.getBean("JobRepository"));
			MOLOG.debug("[EVL] Bean jobs			   [ " + oCntx.getBean("idJobLauncher"));
			MOLOG.debug("[EVL] Catalogo 			   [ " + moDataSource.getCatalog());
			assertNotNull(oCntx);
			
		}catch(Exception ex) {
			MOLOG.info(ex.getMessage());
		}
	}
}
