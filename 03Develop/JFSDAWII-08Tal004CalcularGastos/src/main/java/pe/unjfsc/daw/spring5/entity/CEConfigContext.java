package pe.unjfsc.daw.spring5.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pe.unjfsc.daw.spring5.logical.CLExpense;

@Configuration
@ComponentScan("pe.unjfsc.daw")
public class CEConfigContext {
	
	@Bean
	public CEGasto idCEGasto() {
		return new CEGasto();
	}

	@Bean
	public CLExpense idCExpense() {
		return new CLExpense();
	}
}
