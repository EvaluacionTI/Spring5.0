package pe.etg.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("pe.etg.bbva.spring")
public class CV0201v01IniciarPetService {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0201v01IniciarPetService.class);
	
	public static void main(String[] args) {
		SpringApplication oApp = new SpringApplication(CV0201v01IniciarPetService.class);
		MOLOG.info("[REST] Aplicacion principal : {} ", oApp);
		MOLOG.info("[REST] http://localhost:8005 : {} ", oApp);
		MOLOG.info("[REST] http://localhost:8005/mascota : {}", oApp);
		MOLOG.info("[REST] http://localhost:8005/mascota/5 : {} ", oApp);
		oApp.run(args);
	}

}
