package pe.etg.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("pe.etg.bbva.evalua.spring5")
public class CV0301v01IniciarPetService {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0301v01IniciarPetService.class);
	
	public static void main(String[] args) {
		SpringApplication oApp = new SpringApplication(CV0301v01IniciarPetService.class);
		MOLOG.info("[REST] Aplicacion principal : {} ", oApp);
		MOLOG.info("[REST] http://localhost:8020 : {} ", oApp);
		MOLOG.info("[REST] http://localhost:8020/mascota : {}", oApp);
		MOLOG.info("[REST] http://localhost:8020/mascota/5 : {} ", oApp);
		oApp.run(args);
	}

}
