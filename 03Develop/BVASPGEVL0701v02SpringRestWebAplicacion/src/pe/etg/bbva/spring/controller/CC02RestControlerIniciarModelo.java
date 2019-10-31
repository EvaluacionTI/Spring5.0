package pe.etg.bbva.spring.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CC02RestControlerIniciarModelo {
	private static Logger moLog = LogManager.getLogger(CC02RestControlerIniciarModelo.class);
	
	@RequestMapping("/inicioControlador")
	//public String mostrarInicio(Model poModel) {
	public String mostrarInicio() {		
		moLog.info("=====> Controlador : /inicioControlador");
		
		// poModel.addAttribute("BBVA", "Arquitectura Host y Servicios Rest");
		return "Se inicio el Controlador de la Arquitectura Host";
 
	}
	
}
