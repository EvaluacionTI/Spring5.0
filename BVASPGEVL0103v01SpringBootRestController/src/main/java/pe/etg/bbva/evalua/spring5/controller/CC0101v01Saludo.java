package pe.etg.bbva.evalua.spring5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CC0101v01Saludo {
	
	@RequestMapping("/hello")
	public String mostrarSaludo() {
		String sMensaje = "PAAS : Arquitectura Host";
		
		return sMensaje;
	}
}
