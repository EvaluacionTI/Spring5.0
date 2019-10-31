package pe.etg.bbva.evalua.spring5.view;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("pe.etg")
public class CVIniciarSpringBootWebApplication {
	private static Logger moLog = LogManager.getLogger(CVIniciarSpringBootWebApplication.class);
	
	public static void main(String[] args){
		
		SpringApplication oWebApl = new SpringApplication(CVIniciarSpringBootWebApplication.class);
		
		moLog.info("[EVL] 1. Para iniciar @SpringBootApplication");
		oWebApl.run(args);
		// El puerto se ha configurado en application.properties
		
		moLog.info("[EVL] 2. http://localhost:8020/");
		moLog.info("[EVL] 3. http://localhost:8020/inicioControlador \n");
		moLog.info("[EVL] 4. http://localhost:8020/listadoPersona \n");
		
		moLog.info("[EVL] " + oWebApl.getSources());
	}
}
