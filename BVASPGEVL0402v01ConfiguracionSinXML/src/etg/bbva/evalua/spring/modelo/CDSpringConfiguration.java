package etg.bbva.evalua.spring.modelo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import etg.bbva.evalua.spring.servicio.CIHelloService;
import etg.bbva.evalua.spring.servicio.impl.CMHelloService;

@Configuration
@ComponentScan("etg.bbva.evalua")
public class CDSpringConfiguration {

	@Bean("idCIHelloService")
	public CIHelloService saludaServicioSinXML() {
		return new CMHelloService();
	}
}
