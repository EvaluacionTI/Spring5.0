package pe.etg.bbva.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CCArquitecturaEvalua {
	private static final Logger MOLOG = LoggerFactory.getLogger(CCArquitecturaEvalua.class);
	
	@RequestMapping("/Evalua")
	public String mostrarMensaje(){
		String sMensaje = "Arquitectura Spring Boot versión 1.5.9.RELEASE";
		MOLOG.info("[REST] mostrarMensaje() ====> {} ", sMensaje);
		return sMensaje;
	}
}
