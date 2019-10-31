package pe.etg.bbva.evalua.spring5.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.etg.bbva.evalua.spring5.entity.CE0101v01Persona;

@RestController
public class CC0102v01Persona {
	
	@RequestMapping("/listado")
	public List<CE0101v01Persona> listadoPersonas(){
		ArrayList<CE0101v01Persona> oaListaPersonas = new ArrayList<>();
		
		oaListaPersonas.add(new CE0101v01Persona(1L, "Alex", "San Luis", 48, true));
		oaListaPersonas.add(new CE0101v01Persona(2L, "Esteban", "Z�rate", 16, true));
		oaListaPersonas.add(new CE0101v01Persona(3L, "Illari", "Chilca", 3, false));
		oaListaPersonas.add(new CE0101v01Persona(4L, "Luis", "Chilca", 1, true));
		
		return oaListaPersonas;
	}
}
