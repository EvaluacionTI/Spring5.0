package pe.bbva.architecture.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.bbva.architecture.entity.CEMascota;
import pe.bbva.architecture.service.CSPetService;

@RestController
public class CCPetController {

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
