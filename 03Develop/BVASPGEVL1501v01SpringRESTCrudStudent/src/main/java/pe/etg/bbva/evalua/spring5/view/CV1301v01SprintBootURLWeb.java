package pe.etg.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("pe.etg.bbva.spring")
public class CV1301v01SprintBootURLWeb {
	private static Logger MOLOG = LoggerFactory.getLogger(CV1301v01SprintBootURLWeb.class);
	
	public static void main(String[] args) {
		MOLOG.info("[EVL] =====> Stard method main() <=====");
		
		SpringApplication.run(CV1301v01SprintBootURLWeb.class, args);
		
		MOLOG.info("[EVL] => argumentos de main() {}", args.length);
		MOLOG.info("[EVL] => invocar URL: http://localhost:8020", args.length);
		MOLOG.info("[EVL] => invocar URL: http://127.0.0.1:8020/", args.length);
		MOLOG.info("[EVL] => invocar URL: http://localhost:8020/", args.length);
		
		MOLOG.info("[EVL] =====> End method main() <=====");
	}

}
