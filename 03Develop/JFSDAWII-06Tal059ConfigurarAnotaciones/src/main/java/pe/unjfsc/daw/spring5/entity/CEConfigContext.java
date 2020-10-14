package pe.unjfsc.daw.spring5.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CEConfigContext {
	private static final Logger LOG = LoggerFactory.getLogger("CEConfigContext");

	@Bean
	public CECreditoProcesar oCECreditoProcesar() {
		LOG.info("[DAW] Generando la instancia de la clase CECreditoProcesar");
		return new CECreditoProcesar();
	}
}
