package pe.bbva.architecture.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.bbva.architecture.entity.CEPersona;

@RestController
public class CCPersona {
	
	@RequestMapping("/listado")
	public List<CEPersona> listadoPersonas(){
		ArrayList<CEPersona> oaListaPersonas = new ArrayList<>();
		
		oaListaPersonas.add(new CEPersona(1L, "Alex", "San Luis", 48, true));
		oaListaPersonas.add(new CEPersona(2L, "Esteban", "Z�rate", 16, true));
		oaListaPersonas.add(new CEPersona(3L, "Illari", "Chilca", 3, false));
		oaListaPersonas.add(new CEPersona(4L, "Luis", "Chilca", 1, true));
		
		return oaListaPersonas;
	}
}
