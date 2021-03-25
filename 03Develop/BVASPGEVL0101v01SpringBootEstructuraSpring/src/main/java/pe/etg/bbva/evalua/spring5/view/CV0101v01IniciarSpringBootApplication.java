package pe.etg.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("pe")
public class CV0101v01IniciarSpringBootApplication {

	private static final Logger MOLOG = LoggerFactory.getLogger(CV0101v01IniciarSpringBootApplication.class);
	
	public static void main(String[] args) {
		MOLOG.info("1. Para iniciar @SpringBootApplication - Modo Escritorio");
		MOLOG.info("Configurar POM con : spring-boot-starter");
		
		MOLOG.info("2. Para iniciar @SpringBootApplication - Modo Web");
		MOLOG.info("Configurar POM con : spring-boot-starter-web");
		
		MOLOG.info("3. Para iniciar @SpringBootApplication - Modo Test");
		MOLOG.info("Configurar POM con : spring-boot-starter-test");
		
		SpringApplication app = new SpringApplication(CV0101v01IniciarSpringBootApplication.class);
		app.run(args);
		MOLOG.info("4. Digitar url : http://localhost:8015");
		MOLOG.info("4. Digitar url : http://localhost:8015/");
		MOLOG.info("4. Digitar url : http://localhost:8015/Evalua");
	}
}
