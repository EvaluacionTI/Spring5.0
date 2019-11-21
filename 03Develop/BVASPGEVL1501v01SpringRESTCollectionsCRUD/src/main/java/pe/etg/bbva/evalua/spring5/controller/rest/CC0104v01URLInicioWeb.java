package pe.etg.bbva.evalua.spring5.controller.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class CC0104v01URLInicioWeb {
	private static Logger MOLOG = LoggerFactory.getLogger(CC0104v01URLInicioWeb.class);
	
	@RequestMapping("/URLinicio")
	public String getRevisionTest() {
	
		String sMensaje = "Revisión Test con Spring Boot";
		
		MOLOG.info("[EVL] => sMensaje : {} ", sMensaje);
		
		return sMensaje; 
	}
	
}
