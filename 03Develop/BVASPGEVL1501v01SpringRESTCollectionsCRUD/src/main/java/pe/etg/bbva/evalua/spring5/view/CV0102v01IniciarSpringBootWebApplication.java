package pe.etg.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("pe.etg")
public class CV0102v01IniciarSpringBootWebApplication {
	private static Logger MOLOG = LoggerFactory.getLogger(CV0102v01IniciarSpringBootWebApplication.class);
	
	public static void main(String[] args){
		
		SpringApplication oWebApl = new SpringApplication(CV0102v01IniciarSpringBootWebApplication.class);
		
		MOLOG.info("=====> 1. Para iniciar @SpringBootApplication");
		oWebApl.run(args);
		// El puerto se ha configurado en application.properties
		
		MOLOG.info("=====> 2. http://localhost:8020/");
		MOLOG.info("=====> 3. http://localhost:8020/inicioControlador \n");
		MOLOG.info("=====> 4. http://localhost:8020/listadoPersona \n");
		
		MOLOG.info("=====> " + oWebApl.getSources());
	}
}
