package pe.etg.bbva.spring.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CV0101v01SpringRestCrudJpaPostgresXml {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0101v01SpringRestCrudJpaPostgresXml.class);
	
	public static void main(String[] args) {
		MOLOG.info("=====> Start method : main(String[] args) <===== ");
		
		SpringApplication.run(CV0101v01SpringRestCrudJpaPostgresXml.class, args);
		
		MOLOG.info("=> [GET ] http://localhost:8020/api/notes");
		MOLOG.info("=> [GET ] http://localhost:8020/api/notes/104");
		MOLOG.info("=> [POST] http://localhost:8020/api/notes/");
		MOLOG.info("=> [PUT ] http://localhost:8020/api/notes/");
		MOLOG.info("=> [DEL ] http://localhost:8020/api/notes/104");
		
		MOLOG.info("=====> End method : main(String[] args) <===== ");
		
	}
}
