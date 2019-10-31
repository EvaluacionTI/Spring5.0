package pe.unjfsc.daw.spring.entidad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CEConfiguracion {

	// Se define la instancia de la clase
	@Bean
	public CE05AlumnoNotacion alumnoPregrado() {
		return new CE05AlumnoNotacion();
	}
}
