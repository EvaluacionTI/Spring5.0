package pe.bbva.architecture.view;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("pe.bbva")
public class CVIniciarSpringBootWebApplication {
	private static Logger moLog = LogManager.getLogger(CVIniciarSpringBootWebApplication.class);
	
	public static void main(String[] args){
		
		SpringApplication oWebApl = new SpringApplication(CVIniciarSpringBootWebApplication.class);
		
		moLog.info("=====> 1. Para iniciar @SpringBootApplication");
		oWebApl.run(args);
		// El puerto se ha configurado en application.properties
		
		moLog.info("=====> 2. http://localhost:8005/");
		moLog.info("=====> 3. http://localhost:8005/inicioControlador \n");
		moLog.info("=====> 4. http://localhost:8005/listadoPersona \n");
		
		moLog.info("=====> " + oWebApl.getSources());
	}
}
