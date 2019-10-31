package pe.etg.bbva.spring.batch.view;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class CV0501v01JobLauncherTest {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0501v01JobLauncherTest.class);
	private String[] configJob = {
			"classpath:/batch/jobs/job03-define-jobs.xml"
    };
	private ApplicationContext moContext;
	
	@Before
	public void setUp() {
        moContext = new ClassPathXmlApplicationContext(configJob);
        MOLOG.info("[EVL] Inicia el Context ", moContext);
        	
	}
	
	@Test
	public void testLaunchJob() throws Exception {
		JobLauncher jobLauncher = (JobLauncher) moContext.getBean("idJobLauncher");
        Job job = (Job) moContext.getBean("idFirstJobBatch");	
        JobExecution jobExecution = null;
        
        MOLOG.info("[EVL] Iniciando Ejecucion del JOB");
		try {
            jobExecution = jobLauncher.run(job, new JobParameters());
            MOLOG.info("Estatus {}", jobExecution.getStatus());
            MOLOG.info("Estatus de Salida {}", jobExecution.getExitStatus());

        } catch (Exception e) {
        	MOLOG.error("[EVL] Error al ejecutar el JOB", e.getMessage());
        }
		Assert.assertTrue(jobExecution.getExitStatus().equals(ExitStatus.COMPLETED));
	}
}
