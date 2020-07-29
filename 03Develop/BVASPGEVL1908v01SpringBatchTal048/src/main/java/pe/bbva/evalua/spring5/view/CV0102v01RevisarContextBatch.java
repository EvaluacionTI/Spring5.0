package pe.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CV0102v01RevisarContextBatch {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0102v01RevisarContextBatch.class);
	private static ApplicationContext moContext;
	private static String[] configJob = {
			"classpath:/batch/config/job02-batch-context.xml"
    };

	public static void main(String[] psaLista) {
		MOLOG.info("[EVL] =====[ Start main ]=====");

		MOLOG.info(" => [EVL] psaLista : {}", psaLista.length);
		moContext = new ClassPathXmlApplicationContext(configJob);
		MOLOG.info("[EVL] ClassPathXmlApplicationContext : {}", moContext);
		
		SimpleJobLauncher oJobLau = (SimpleJobLauncher) moContext.getBean("idJobLauncher");
		MOLOG.info("[EVL] SimpleJobLauncher : {}", oJobLau);

        ((ConfigurableApplicationContext) moContext).close();
	}
}
