package pe.etg.bbva.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.etg.bbva.spring.entity.CE0701v01Person;

@Configuration
public class CC0702v02ConfigurationUnPerson {
	
	@Bean
	public CE0701v01Person oCEPerson() {
		return new CE0701v01Person(20);
	}
}
