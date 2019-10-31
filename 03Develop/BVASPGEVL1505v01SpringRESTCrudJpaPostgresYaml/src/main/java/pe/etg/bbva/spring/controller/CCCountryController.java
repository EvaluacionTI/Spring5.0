package pe.etg.bbva.spring.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.etg.bbva.spring.entity.CECountry;
import pe.etg.bbva.spring.model.service.CICountryService;

@RestController
@RequestMapping("/country")
public class CCCountryController {
	private static final Logger MOLOG = LoggerFactory.getLogger(CCCountryController.class);

	@Autowired
	private CICountryService oCountryService;

	@RequestMapping("/")
	public String getRevisionRest() {
		MOLOG.info("[EVL] =====> Stard method getRevisionRest() <=====");

		String sMensaje = "Accesando a Spring Rest";

		MOLOG.info("[EVL] => Mensaje : {} ", sMensaje);

		MOLOG.info("[EVL] => Intanciando Country Service : {} ", oCountryService);

		MOLOG.info("[EVL] =====> End method getRevisionRest() <=====");

		return sMensaje;
	}

	@GetMapping("/todosCountry")
	public List<CECountry> listAllCountry(){
		MOLOG.info("[EVL] =====> Stard method listAllCountry() <=====");
		
		MOLOG.info("[EVL] => Lista Country : {} ", oCountryService.findAll());
		
		MOLOG.info("[EVL] =====> End method listAllCountry() <=====");
		return (List<CECountry>) oCountryService.findAll();
	}
	
	@RequestMapping("/showCities")
	public String findCities(Model model) {

		List<CECountry> cities = (List<CECountry>) oCountryService.findAll();

		model.addAttribute("cities", cities);

		return "showCities";
	}
}
