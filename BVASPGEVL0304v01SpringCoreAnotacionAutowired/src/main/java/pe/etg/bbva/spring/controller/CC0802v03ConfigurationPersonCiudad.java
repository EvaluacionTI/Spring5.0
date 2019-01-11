package pe.etg.bbva.spring.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.etg.bbva.spring.entity.CE0802v03Ciudad;
import pe.etg.bbva.spring.entity.CE0802v03Pais;
import pe.etg.bbva.spring.entity.CE0802v03Person;

@Configuration
public class CC0802v03ConfigurationPersonCiudad {

	@Bean
	public CE0802v03Person oCEPerson() {
		return new CE0802v03Person();
	}

	@Bean
	public CE0802v03Pais oCEPais() {
		return new CE0802v03Pais();
	}

	@Bean
	public CE0802v03Ciudad oCECiudad() {
		return new CE0802v03Ciudad();
	}		
}
