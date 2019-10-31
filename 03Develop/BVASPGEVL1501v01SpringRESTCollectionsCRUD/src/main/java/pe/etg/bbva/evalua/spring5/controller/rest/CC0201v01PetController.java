package pe.etg.bbva.evalua.spring5.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.etg.bbva.evalua.spring5.entity.CEMascota;
import pe.etg.bbva.evalua.spring5.service.CSPetService;

@RestController
public class CC0201v01PetController {

	@Autowired
	CSPetService oCSPetService;
	
	@RequestMapping(value="/mascota", method= {RequestMethod.GET}, produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<CEMascota> findAll(){
		return oCSPetService.findAll();
	}
	
	@RequestMapping(value="/mascota/{id}", method= {RequestMethod.GET}, produces= {MediaType.APPLICATION_JSON_VALUE})
	public CEMascota findById(@PathVariable("id") int pId) {
		return oCSPetService.findById(pId);
	}
}
