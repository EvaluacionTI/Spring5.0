package pe.bbva.spring.batch.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.bbva.spring.entity.CEBeanMensaje;

@Configuration
public class CEBeanConfiguracion {

	@Bean
	public CEBeanMensaje mostrarMensaje() {
		return new CEBeanMensaje();
	}
}
