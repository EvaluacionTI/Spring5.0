package pe.bbva.evalua.spring5.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pe.bbva.evalua.spring5.logical.CLExpense;

@Configuration
@ComponentScan("pe")
public class CEConfigContext {

	@Bean
	public CEGasto oCEGasto() {
		return new CEGasto();
	}
	
	@Bean
	public CLExpense oCLExpense(){
		return new CLExpense();
	}
}
