package pe.etg.bbva.spring5.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.etg.bbva.spring5.entity.CE0701v01Person;

@Configuration
public class CC0702v01ConfigurationPerson {
	
	@Bean
	public CE0701v01Person oCEPerson() {
		return new CE0701v01Person(12, "09711332", "ROSA POVIS", "REINA");
	}
}
