package pe.etg.bbva.evalua.spring5.controller.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CC0101v01Saludo {
	private static final Logger MOLOG = LoggerFactory.getLogger(CC0101v01Saludo.class);
	@RequestMapping("/hello")
	public String mostrarSaludo() {
		String sMensaje = "PAAS : Arquitectura Host";
		
		MOLOG.info("=====> Controlador : /hello");
		
		return sMensaje;
	}
}
