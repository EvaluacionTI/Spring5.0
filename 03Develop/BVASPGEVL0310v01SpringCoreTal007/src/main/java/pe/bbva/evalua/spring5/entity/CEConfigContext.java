package pe.bbva.evalua.spring5.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pe.bbva.evalua.spring5.logical.CLCalcularVenta;

@Configuration
@ComponentScan("pe.bbva.evalua")
public class CEConfigContext {

	@Bean
	public CEEntity oCEEntity(){
		return new CEEntity();
		
	}
	
	@Bean
	public CEProducto oCEProducto() {
		return new CEProducto();
	}
	
	@Bean
	public CLCalcularVenta oCLCalcular() {
		return new CLCalcularVenta();
	}
}
