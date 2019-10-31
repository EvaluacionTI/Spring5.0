package pe.etg.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("pe.etg")
public class CVIniciarSpringBootWebApplication {
	private static Logger MOLOG = LoggerFactory.getLogger(CVIniciarSpringBootWebApplication.class);
	
	public static void main(String[] args){
		
		SpringApplication oWebApl = new SpringApplication(CVIniciarSpringBootWebApplication.class);
		
		MOLOG.info("=====> 1. Para iniciar @SpringBootApplication");
		oWebApl.run(args);
		// El puerto se ha configurado en application.properties
		
		MOLOG.info("=====> 2. http://localhost:8005/");
		MOLOG.info("=====> 3. http://localhost:8005/inicioControlador \n");
		MOLOG.info("=====> 4. http://localhost:8005/listadoPersona \n");
		
		MOLOG.info("=====> " + oWebApl.getSources());
	}
}
