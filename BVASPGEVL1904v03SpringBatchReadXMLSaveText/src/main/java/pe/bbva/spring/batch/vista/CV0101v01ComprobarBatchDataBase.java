package pe.bbva.spring.batch.vista;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class CV0101v01ComprobarBatchDataBase {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0101v01ComprobarBatchDataBase.class);
	
	public static void main(String[] args) throws SQLException {
		String[] configJob = {
                "classpath:batch/config/job01-batch-database.xml"
        };

		ConfigurableApplicationContext moCntx = new ClassPathXmlApplicationContext(configJob);
		MOLOG.info("[EVL] ConfigurableApplicationContext	: {} ", moCntx);
		MOLOG.info("[EVL] ApplicationName			: {} ", moCntx.getApplicationName());
		MOLOG.info("[EVL] BeanDefinitionCount		: {} ", moCntx.getBeanDefinitionCount());
		MOLOG.info("[EVL] DisplayName				: {} ", moCntx.getDisplayName());
		MOLOG.info("[EVL] Environment				: {} ", moCntx.getEnvironment());
		
        DriverManagerDataSource oDMDSource = (DriverManagerDataSource) moCntx.getBean("dataSource");
        MOLOG.info("[EVL] DriverManagerDataSource 			: {} ", oDMDSource);
        MOLOG.info("[EVL] Catalog 			: {} ", oDMDSource.getCatalog());
        MOLOG.info("[EVL] LoginTimeout 			: {} ", oDMDSource.getLoginTimeout());
        MOLOG.info("[EVL] Schema 			: {} ", oDMDSource.getSchema());
        MOLOG.info("[EVL] Url 			: {} ", oDMDSource.getUrl());
        
        
        DataSourceTransactionManager oDSTManager = (DataSourceTransactionManager) moCntx.getBean("transactionManager");
        MOLOG.info("[EVL] DataSourceTransactionManager 		: {} ", oDSTManager);
        MOLOG.info("[EVL] ResourceFactory 		: {} ", oDSTManager.getResourceFactory());
        MOLOG.info("[EVL] DataSource 		: {} ", oDSTManager.getDataSource());
        MOLOG.info("[EVL] DefaultTimeout 		: {} ", oDSTManager.getDefaultTimeout());
        MOLOG.info("[EVL] TransactionSynchronization 		: {} ", oDSTManager.getTransactionSynchronization());
        
        ((ConfigurableApplicationContext) moCntx).close();	
	}
}