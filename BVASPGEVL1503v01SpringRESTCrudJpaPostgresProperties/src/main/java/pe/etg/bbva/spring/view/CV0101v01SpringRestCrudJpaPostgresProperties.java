package pe.etg.bbva.spring.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"pe.etg.bbva.spring.controller", "pe.etg.bbva.spring.model"})
//@EnableJpaAuditing
//@EntityScan(basePackages="pe.etg.bbva.spring.entity")
//@EnableJpaRepositories(basePackages="pe.etg.bbva.spring.model.repository")
@EnableJpaRepositories
public class CV0101v01SpringRestCrudJpaPostgresProperties {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0101v01SpringRestCrudJpaPostgresProperties.class);
	
	public static void main(String[] args) {
		MOLOG.info("=====> Start method : main(String[] args) <===== ");
		
		SpringApplication.run(CV0101v01SpringRestCrudJpaPostgresProperties.class, args);
		
		MOLOG.info("=> [GET ] http://localhost:8020/api/ == method getRevisionRest()");
		MOLOG.info("=> [GET ] http://localhost:8020/api/notes == method getAllNotes()");
		MOLOG.info("=> [GET ] http://localhost:8020/api/notes/104");
		MOLOG.info("=> [POST] http://localhost:8020/api/notes/");
		MOLOG.info("=> [PUT ] http://localhost:8020/api/notes/");
		MOLOG.info("=> [DEL ] http://localhost:8020/api/notes/104");

		MOLOG.info("=====> End method : main(String[] args) <===== ");
		
	}
}
