package pe.etg.bbva.spring.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.etg.bbva.spring.entity.CEAnimal;
import pe.etg.bbva.spring.model.repository.CIAnimalRepository;

@RestController
@RequestMapping("/animales")
public class CCAnimalController {
	private static final Logger MOLOG = LoggerFactory.getLogger(CCAnimalController.class);
	
	//@Autowired
	private CIAnimalRepository oAnimalRepository;
		
	@RequestMapping("/")
	public String getRevisionRest() {
		MOLOG.info("[EVL] =====> Stard method getRevisionRest() <=====");
		
		String sMensaje = "Accesando a Spring Rest";
		
		MOLOG.info("[EVL] => Mensaje : {} ", sMensaje);
		
		MOLOG.info("[EVL] => Intanciando Repositorio : {} ", oAnimalRepository);
		
		MOLOG.info("[EVL] =====> End method getRevisionRest() <=====");
		
		return sMensaje; 
	}
	
	@GetMapping("/todos")
	public List<CEAnimal> listAllAnimal(){
		MOLOG.info("[EVL] =====> Stard method listAllAnimal() <=====");
		
		MOLOG.info("[EVL] => Lista animales : {} ", oAnimalRepository.findAll());
		
		MOLOG.info("[EVL] =====> End method listAllAnimal() <=====");
		return (List<CEAnimal>) oAnimalRepository.findAll();
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public CEAnimal grabarAnimal(@RequestBody CEAnimal poCEAnimal) {
		MOLOG.info("[EVL] =====> Stard method grabarAnimal(@RequestBody CEAnimal poCEAnimal) <=====");
		
		MOLOG.info("[EVL] => Animal : {} ", poCEAnimal.toString());
		
		MOLOG.info("[EVL] =====> End method grabarAnimal(@RequestBody CEAnimal poCEAnimal) <=====");
		return oAnimalRepository.save(poCEAnimal);
		
	}
}
