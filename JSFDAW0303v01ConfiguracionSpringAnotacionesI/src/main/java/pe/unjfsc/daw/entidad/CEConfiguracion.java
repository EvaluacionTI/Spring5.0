package pe.unjfsc.daw.entidad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CEConfiguracion {

	// Generando la declaracion de la instancia
	// Usando la notación @Bean
	@Bean
	public CEAlumno oCEAlumno() {
		return new CEAlumno();
	}
	
	// Adicionando la segunda instancia
	@Bean
	public CECurso oCECurso() {
		return new CECurso();
	}
}
