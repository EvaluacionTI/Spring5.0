package pe.unjfsc.daw.spring.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

public class CV01RevisarContextBaseDatos {
	private static Logger MOLOG = LoggerFactory.getLogger(CV01RevisarContextBaseDatos.class);

	public static void main(String[] args) {
		
		MOLOG.info("[EVL] String[] args : {}", args.toString());
		
		String[] configJob = {
                "classpath:batch/config/job01-database.xml"
        };

        ApplicationContext context = new ClassPathXmlApplicationContext(configJob);
        MOLOG.info("[EVL] ApplicationContext : {} ", context);
        
        SingleConnectionDataSource oBasex = (SingleConnectionDataSource) context.getBean("dataSource");
        DataSourceTransactionManager oTransaction = (DataSourceTransactionManager) context.getBean("idTransactionManager");
        
        MOLOG.info("[EVL] DataSource {} ", oBasex);
        MOLOG.info("[EVL] DataSourceTransactionManager {} ", oTransaction);
	}
	
}
