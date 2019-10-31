package pe.etg.bbva.spring.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"pe.etg.bbva.spring.controller", "pe.etg.bbva.spring.model"})
//@EnableJpaRepositories
public class CV0101v01SpringRestCrudJpaPostgresYaml {

	private static final Logger MOLOG = LoggerFactory.getLogger(CV0101v01SpringRestCrudJpaPostgresYaml.class);
	
	public static void main(String[] args) {
		MOLOG.trace("[EVL] =====> Start method : main(String[] args) <===== ");
		
		SpringApplication.run(CV0101v01SpringRestCrudJpaPostgresYaml.class, args);

		MOLOG.info("[EVL]=> [GET ] http://localhost:8020/country/");
		MOLOG.info("[EVL]=> [GET ] http://localhost:8020/country/todosCountry");
		MOLOG.info("[EVL]=> [GET ] http://localhost:8020/animales/notes/104");
		MOLOG.info("[EVL]=> [POST] http://localhost:8020/animales/notes/");
		MOLOG.info("[EVL]=> [PUT ] http://localhost:8020/animales/notes/");
		MOLOG.info("[EVL]=> [DEL ] http://localhost:8020/animales/notes/104");
		
		MOLOG.trace("[EVL] =====> End method : main(String[] args) <===== ");
	}
}
