package pe.etg.bbva.evalua.spring5.controller.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CC02RestControlerIniciarModelo {
	private static Logger moLog = LoggerFactory.getLogger(CC02RestControlerIniciarModelo.class);
	
	@RequestMapping("/inicioControlador")
	//public String mostrarInicio(Model poModel) {
	public String mostrarInicio() {		
		moLog.info("=====> Controlador : /inicioControlador");
		
		// poModel.addAttribute("BBVA", "Arquitectura Host y Servicios Rest");
		return "Se inicio el Controlador de la Arquitectura Host";
 
	}
	
}
