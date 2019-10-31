package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CVCompraLanzarJobStepStep {
	private static Logger MOLOG = LoggerFactory.getLogger(CVCompraLanzarJobStepStep.class);
	
	public static void main(String[] args) {
		String[] configJob = {
                "classpath:batch/jobs/job03-define-jobs.xml"
        };

        ApplicationContext context = new ClassPathXmlApplicationContext(configJob);

        JobLauncher jobLauncher = (JobLauncher) context.getBean("idJobLauncher");
        Job job = (Job) context.getBean("idFirstJobBatch");

        MOLOG.info("[EVL] ApplicationContext : {} ", context);
        MOLOG.info("[EVL] JobLauncher 		 : {} ", jobLauncher);
        MOLOG.info("[EVL] Job 				 : {} ", job);
        
        try {
            JobExecution jobExecution = jobLauncher.run(job, new JobParameters());
            MOLOG.info("[EVL] Estatus 			: {}", jobExecution.getStatus());
            MOLOG.info("[EVL] Estatus de Salida : {}", jobExecution.getExitStatus());

        } catch (Exception e) {
        	MOLOG.error("[EVL] Error al ejecutar el JOB", e.getMessage());
        }
	}
}
