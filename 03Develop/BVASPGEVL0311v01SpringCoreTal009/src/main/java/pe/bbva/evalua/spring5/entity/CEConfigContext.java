package pe.bbva.evalua.spring5.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.bbva.evalua.spring5.logical.impl.CMSaldoDisponibleAnotacion;

@Configuration
public class CEConfigContext {
	
	@Bean
	public CESaldoAfiliadoAnotacion oCESaldoAfiliado() {
		return new CESaldoAfiliadoAnotacion();
	}
	
	@Bean
	public CMSaldoDisponibleAnotacion oCMSaldoDisponible() {
		return new CMSaldoDisponibleAnotacion();
	}
}