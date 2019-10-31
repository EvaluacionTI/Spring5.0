package pe.unjfsc.daw.spring.entidad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CEConfiguracionCurso {

	@Bean
	public CECurso curso() {
		return new CECurso();
	}
}
