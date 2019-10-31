package pe.etg.bbva.evalua.spring5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CCIniciarController {

	@RequestMapping("/")
	public String mensaje(){
		return "Iniciando la revisión de Mongo";
	}
	
}
