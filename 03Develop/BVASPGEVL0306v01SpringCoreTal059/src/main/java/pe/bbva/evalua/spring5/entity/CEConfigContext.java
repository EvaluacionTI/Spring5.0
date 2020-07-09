package pe.bbva.evalua.spring5.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CEConfigContext {

	@Bean
	public CECreditoProcesar oCECreditoProcesar() {
		return new CECreditoProcesar();
	}
	
	@Bean
	public CESesion03 oCESesion(){
		return new CESesion03();
	}
}
