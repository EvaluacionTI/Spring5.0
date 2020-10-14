package pe.unjfsc.daw.spring5.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.unjfsc.daw.spring5.logical.impl.CMProducto;

@Configuration
public class CEConfigContext {

	@Bean
	public CEEntity idCEEntity() {
		return new CEEntity();
	}

	@Bean
	public CEProducto idCEProducto() {
		return new CEProducto();
	}

	@Bean
	public CMProducto idCMProducto() {
		return new CMProducto();
	}
}
