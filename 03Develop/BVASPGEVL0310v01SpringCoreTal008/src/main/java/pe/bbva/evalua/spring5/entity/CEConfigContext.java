package pe.bbva.evalua.spring5.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.bbva.evalua.spring5.logical.impl.CMProyectarConvidAnotacion;

@Configuration
public class CEConfigContext {
	
	@Bean
	public CECovidAnotacion oCECovidA() {
		return new CECovidAnotacion(0, 0, 0, 0);
	}
	
	@Bean
	public CMProyectarConvidAnotacion oCMCovidA() {
		return new CMProyectarConvidAnotacion();
	}
}
