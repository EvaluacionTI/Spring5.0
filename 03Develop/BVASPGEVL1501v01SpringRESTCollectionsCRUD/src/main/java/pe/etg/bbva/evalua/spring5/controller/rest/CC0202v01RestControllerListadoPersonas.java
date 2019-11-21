package pe.etg.bbva.evalua.spring5.controller.rest;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.etg.bbva.evalua.spring5.entity.CE0201v01Persona;

@RestController
public class CC0202v01RestControllerListadoPersonas {
	private static Logger moLog = LoggerFactory.getLogger(CC0202v01RestControllerListadoPersonas.class);
	
	@RequestMapping("/listadoPersona")
	public List<CE0201v01Persona> listadoPersonas(){
		moLog.info("=====> Controlador : /listadoPersona");
		ArrayList<CE0201v01Persona> oaListaPersonas = new ArrayList<>();
		
		oaListaPersonas.add(new CE0201v01Persona(1L, "Alex", "San Luis", 48, true));
		oaListaPersonas.add(new CE0201v01Persona(2L, "Esteban", "Zárate", 16, true));
		oaListaPersonas.add(new CE0201v01Persona(3L, "Illari", "Chilca", 3, false));
		oaListaPersonas.add(new CE0201v01Persona(4L, "Luis", "Chilca", 1, true));
		
		return oaListaPersonas;
	}
}
