package pe.unjfsc.daw.entidad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CEAppConfigSpring {

	// Declaro un instancia
	// Para declararlo como un bean 
	// Esta declaración será equivalente a lo definido en el archivo XML
	@Bean
	public CESesion03 sesion() {
		return new CESesion03();
	}
}
