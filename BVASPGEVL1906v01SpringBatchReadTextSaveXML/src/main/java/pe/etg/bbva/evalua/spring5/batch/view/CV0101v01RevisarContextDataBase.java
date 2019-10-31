package pe.etg.bbva.evalua.spring5.batch.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

public class CV0101v01RevisarContextDataBase {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0101v01RevisarContextDataBase.class);
	private static ApplicationContext moContext;
	private static String[] configJob = {
			"classpath:/batch/config/job01-database-h2.xml"
    };

	public static void main(String[] psaLista) {
		MOLOG.info("[EVL] Start method main(String[] psaLista)");
		moContext = new ClassPathXmlApplicationContext(configJob);
		SingleConnectionDataSource oCxn = (SingleConnectionDataSource) moContext.getBean("dataSource");
		DataSourceTransactionManager oTrn = (DataSourceTransactionManager) moContext.getBean("transactionManager");
		
		MOLOG.info("[EVL] psaLista 		 : {}", psaLista.length);
		MOLOG.info("[EVL] moContext   	 : {}", moContext);
		MOLOG.info("[EVL] SingleConnectionDataSource : {}", oCxn);
		MOLOG.info("[EVL] .... Url					 : {}", oCxn.getUrl());
		MOLOG.info("[EVL] DataSourceTransactionManager : {}", oTrn);
		MOLOG.info("[EVL] ....					 : {}", oTrn.getDataSource());

        ((ConfigurableApplicationContext) moContext).close();
	}
}
