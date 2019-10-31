package pe.etg.bbva.evalua.spring5.controller.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class CCURLInicioWeb {
	private static Logger MOLOG = LoggerFactory.getLogger(CCURLInicioWeb.class);
	
	@RequestMapping("/")
	public String getRevisionTest() {
		MOLOG.info("[EVL] =====> Stard method getRevisionTest() <=====");
		
		String sMensaje = "Revisión Test con Spring Boot";
		
		MOLOG.info("[EVL] => sMensaje : {} ", sMensaje);
		
		MOLOG.info("[EVL] =====> Stard method getRevisionTest() <=====");
		
		return sMensaje; 
	}
	
}
