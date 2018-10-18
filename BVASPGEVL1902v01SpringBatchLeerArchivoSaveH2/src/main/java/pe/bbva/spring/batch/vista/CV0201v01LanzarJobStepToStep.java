package pe.bbva.spring.batch.vista;

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

    	MOLOG.info("=====> Iniciando la Ejecucion del JOB");

        String[] configJob = {
                "classpath:spring/batch/jobs/first-job.xml"
        };

        ApplicationContext context = new ClassPathXmlApplicationContext(configJob);
        MOLOG.info(" =====> ", context);
        JobLauncher jobLauncher = (JobLauncher) context.getBean("idJobLauncher");
        Job job = (Job) context.getBean("idFirstJob");

        try {
            JobExecution jobExecution = jobLauncher.run(job, new JobParameters());
            MOLOG.info("Estatus {}", jobExecution.getStatus());
            MOLOG.info("Estatus de Salida {}", jobExecution.getExitStatus());

        } catch (Exception e) {
        	MOLOG.error("Error al ejecutar el JOB", e.getMessage());
        }

        MOLOG.info("Finalizo la Ejecucion del JOB");
    }
}
