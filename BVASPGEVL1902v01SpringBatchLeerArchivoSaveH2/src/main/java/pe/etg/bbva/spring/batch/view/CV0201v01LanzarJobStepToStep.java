package pe.etg.bbva.spring.batch.view;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CV0201v01LanzarJobStepToStep {

    private static Logger MOLOG = LogManager.getLogger(CV0201v01LanzarJobStepToStep.class);
    public static void main(String[] args) {

        String[] configJob = {
                "classpath:/batch/jobs/first-job.xml"
        };

        ApplicationContext context = new ClassPathXmlApplicationContext(configJob);

        JobLauncher jobLauncher = (JobLauncher) context.getBean("idJobLauncher");
        Job job = (Job) context.getBean("idFirstJob");

        try {
            JobExecution jobExecution = jobLauncher.run(job, new JobParameters());
            MOLOG.info("[EVL] ApplicationContext : {}", context);
            MOLOG.info("[EVL] Estatus 			 : {}", jobExecution.getStatus());
            MOLOG.info("[EVL] Estatus Salida     : {}", jobExecution.getExitStatus());

        } catch (Exception e) {
        	MOLOG.error("[EVL] Error al ejecutar el JOB : {} ", e.getMessage());
        }
    }
}
