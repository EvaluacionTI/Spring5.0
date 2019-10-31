package pe.unjfsc.daw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.unjfsc.daw.entidad.CEAlumno;

@Configuration
public class CEConfiguracion {
	
	@Bean
	public CEAlumno oCEAlumno() {
		return new CEAlumno();
	}
}
