package pe.etg.bbva.evalua.spring5.controller.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CC0102v01RestControllerIndex {
	//private static Logger moLog = LogManager.getLogger(CC01RestControllerIndex.class);
	private static final Logger MOLOG = LoggerFactory.getLogger("CC0102v01RestControllerIndex");
	
	@RequestMapping("/")
	public String indexPage() {
		MOLOG.info("=====> Controlador : /");
		
		return "index";
	}
}
