package pe.etg.bbva.spring.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.etg.bbva.spring.entity.CE0802v01Pais;
import pe.etg.bbva.spring.entity.CE0802v01Person;

@Configuration
public class CC0802v01ConfigurationPerson {

	@Bean
	public CE0802v01Person oCEPerson() {
		return new CE0802v01Person();
	}

	@Bean
	public CE0802v01Pais oCEPais() {
		return new CE0802v01Pais();
	}	
}
