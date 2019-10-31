package pe.etg.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("pe.etg.bbva.evalua.spring5")
public class CVURLInicioWebWithSpringBoot {
	private static Logger MOLOG = LoggerFactory.getLogger(CVURLInicioWebWithSpringBoot.class);
	
	public static void main(String[] args) {
	
		SpringApplication.run(CVURLInicioWebWithSpringBoot.class, args);
		
		MOLOG.info("[EVL] argumentos de main() {}", args.length);
		MOLOG.info("[EVL] invocar URL: http://localhost:8020", args.length);
		MOLOG.info("[EVL] invocar URL: http://127.0.0.1:8020/", args.length);
		MOLOG.info("[EVL] invocar URL: http://localhost:8020/", args.length);
	}
}
