package pe.etg.bbva.spring.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.etg.bbva.spring.entity.CE0301v01Person;

@Configuration
public class CD0301v01ConfigurationPerson {

	@Bean
	public CE0301v01Person oCEPersona() {
		return new CE0301v01Person();
	}
}
