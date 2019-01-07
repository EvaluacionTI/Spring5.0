package pe.etg.bbva.spring.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("pe.etg.bbva.spring")
public class CV01v01IniciarSpringBoot {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV01v01IniciarSpringBoot.class);
	
	public static void main(String[] args) {
		SpringApplication oApp = new SpringApplication(CV01v01IniciarSpringBoot.class);
		MOLOG.info("[REST] Aplicacion principal : {} ", oApp);
		MOLOG.info("[REST] http://localhost:8005 : {} ", oApp);
		MOLOG.info("[REST] http://localhost:8005/mascota : {}", oApp);
		MOLOG.info("[REST] http://localhost:8005/mascota/5 : {} ", oApp);
		oApp.run(args);
	}

}
