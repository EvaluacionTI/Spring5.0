package pe.bbva.spring.batch.vista;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.job.SimpleJob;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:/batch/jobs/spring-batch-demo.xml" 
	}
)
public class CVImprimirTaskletTest {
	//private static final Logger moLog = LogManager.getLogger(CVImprimirTaskletTest.class);
	
	@Autowired
    private SimpleJobLauncher oSJLanzador;
 
    @Autowired
    private SimpleJob oSJTrabajo;

	@Test
	public void contextLoads() {
	}
	
/*	@Test
	public void testIniciarJobs() throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException {

		
		JobParametersBuilder builder = new JobParametersBuilder();
		
		builder.addDate("Ejecucion", new Date());
        builder.addString("jobName", "Imprimir hola mundo por consola");
        JobParameters parameters = builder.toJobParameters();
 
        oSJLanzador.run(oSJTrabajo, parameters);
	}*/

}
