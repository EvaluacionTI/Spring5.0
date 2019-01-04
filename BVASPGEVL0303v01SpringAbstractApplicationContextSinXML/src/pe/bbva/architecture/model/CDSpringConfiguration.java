package pe.bbva.architecture.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pe.bbva.architecture.service.CIHelloService;
import pe.bbva.architecture.service.impl.CMHelloService;

@Configuration
@ComponentScan("pe.bbva.architecture")
public class CDSpringConfiguration {

	@Bean("idCIHelloService")
	public CIHelloService saludaServicioSinXML() {
		return new CMHelloService();
	}
}
