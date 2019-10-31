package pe.etg.bbva.evalua.spring5.controller.rest;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.etg.bbva.evalua.spring5.entity.CEPersona;

@RestController
public class CC03RestControllerListadoPersonas {
	private static Logger moLog = LoggerFactory.getLogger(CC03RestControllerListadoPersonas.class);
	
	@RequestMapping("/listadoPersona")
	public List<CEPersona> listadoPersonas(){
		moLog.info("=====> Controlador : /listadoPersona");
		ArrayList<CEPersona> oaListaPersonas = new ArrayList<>();
		
		oaListaPersonas.add(new CEPersona(1L, "Alex", "San Luis", 48, true));
		oaListaPersonas.add(new CEPersona(2L, "Esteban", "Zárate", 16, true));
		oaListaPersonas.add(new CEPersona(3L, "Illari", "Chilca", 3, false));
		oaListaPersonas.add(new CEPersona(4L, "Luis", "Chilca", 1, true));
		
		return oaListaPersonas;
	}
}
