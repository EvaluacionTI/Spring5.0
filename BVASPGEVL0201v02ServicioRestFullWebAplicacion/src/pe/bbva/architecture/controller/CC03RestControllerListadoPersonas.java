package pe.bbva.architecture.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.bbva.architecture.entity.CEPersona;

@RestController
public class CC03RestControllerListadoPersonas {
	private static Logger moLog = LogManager.getLogger(CC03RestControllerListadoPersonas.class);
	
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
