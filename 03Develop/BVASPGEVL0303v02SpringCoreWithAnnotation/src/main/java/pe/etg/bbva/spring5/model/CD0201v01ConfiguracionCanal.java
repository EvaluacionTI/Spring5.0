package pe.etg.bbva.spring5.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.etg.bbva.spring5.entity.CE0201v01Canal;

@Configuration
public class CD0201v01ConfiguracionCanal {
	
	@Bean
	public CE0201v01Canal oCECanal() {
		// Retorno la instancia de la clase
		return new CE0201v01Canal();
	}
}
