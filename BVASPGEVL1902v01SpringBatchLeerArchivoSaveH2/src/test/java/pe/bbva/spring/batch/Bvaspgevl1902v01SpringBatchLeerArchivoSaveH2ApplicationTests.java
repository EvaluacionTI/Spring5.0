package pe.bbva.spring.batch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)

@SpringBootTest
@ContextConfiguration(locations= {"classpath:/spring/batch/jobs/first-job.xml"})
public class Bvaspgevl1902v01SpringBatchLeerArchivoSaveH2ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
