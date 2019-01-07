package pe.etg.bbva.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CCSaludo {
	
	@RequestMapping("/hello")
	public String mostrarSaludo() {
		String sMensaje = "PAAS : Arquitectura Host";
		
		return sMensaje;
	}
}
