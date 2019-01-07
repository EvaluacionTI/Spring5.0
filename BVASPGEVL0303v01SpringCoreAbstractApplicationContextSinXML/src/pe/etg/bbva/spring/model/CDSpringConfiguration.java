package pe.etg.bbva.spring.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pe.etg.bbva.spring.service.CIHelloService;
import pe.etg.bbva.spring.service.impl.CMHelloService;

@Configuration
@ComponentScan("pe.etg.bbva.spring")
public class CDSpringConfiguration {

	@Bean("idCIHelloService")
	public CIHelloService saludaServicioSinXML() {
		return new CMHelloService();
	}
}
