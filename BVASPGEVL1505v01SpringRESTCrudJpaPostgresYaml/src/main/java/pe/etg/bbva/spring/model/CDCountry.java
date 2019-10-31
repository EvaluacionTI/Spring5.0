package pe.etg.bbva.spring.model;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.etg.bbva.spring.entity.CECountry;
import pe.etg.bbva.spring.model.service.CICountryService;

@Service
public class CDCountry implements CICountryService{
	private static final Logger MOLOG = LoggerFactory.getLogger(CDCountry.class);
	
	@Autowired
	private CICountryService oCountryRepository;
	
	@Override
	public List<CECountry> findAll() {
		MOLOG.info("[EVL] =====> Stard method findAll() <=====");
		
		List<CECountry> oaListCountry = (List<CECountry>) oCountryRepository.findAll();
		
		MOLOG.debug("[EVL] => Lista : {} ", oaListCountry);

		MOLOG.info("[EVL] =====> End method findAll() <=====");
		return oaListCountry;
	}

}
