package pe.etg.bbva.evalua.spring5.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CCIndexController {
	private static final Logger MOLOG = LoggerFactory.getLogger(CCIndexController.class);
	
	@RequestMapping("/")
	public String index() {
		String sMensaje = "Para iniciar la página con el @RequestMappint y @RestController, se usa localhost:8080 o localhost:8080/" +
				"por defecto. Se ha cambiado al puerto 8015 para desarrollo";
		MOLOG.info("[REST] index() ====> {} ", sMensaje);
		return sMensaje;
	}
}
