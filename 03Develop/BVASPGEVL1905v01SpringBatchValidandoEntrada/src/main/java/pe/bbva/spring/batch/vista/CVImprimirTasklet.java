package pe.bbva.spring.batch.vista;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CVImprimirTasklet {
	private static Logger MOLOG = LogManager.getLogger(CVImprimirTasklet.class);
	public static void main(String[] args) {
		MOLOG.info("=====> Iniciando la Ejecucion del JOB");

        String[] configJob = {
                "classpath:/batch/jobs/spring-batch-jobs.xml"
        };

        ApplicationContext context = new ClassPathXmlApplicationContext(configJob);
        MOLOG.info(" =====> ", context);

	}

}
