package pe.bbva.spring5.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pe.bbva.spring5.service.CIHelloService;
import pe.bbva.spring5.service.impl.CMHelloService;

@Configuration
@ComponentScan("pe.bbva.spring5")
public class CDSpringConfiguration {

	@Bean("idCIHelloService")
	public CIHelloService saludaServicioSinXML() {
		return new CMHelloService();
	}
}
