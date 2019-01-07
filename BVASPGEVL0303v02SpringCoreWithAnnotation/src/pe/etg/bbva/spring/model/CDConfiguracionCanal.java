package pe.etg.bbva.spring.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.etg.bbva.spring.entity.CECanal;

@Configuration
public class CDConfiguracionCanal {
	
	@Bean
	public CECanal oCECanal() {
		return new CECanal();
	}
}
