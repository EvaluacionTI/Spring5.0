package pe.bbva.evalua.spring5.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;
import pe.bbva.evalua.spring5.model.impl.CDRetiroAFP25ArrayList;

@Configuration
public class CEConfigContext {

	@Bean
	public CESaldoAfiliadoCustom idCESaldoAfiliado() {
		return new CESaldoAfiliadoCustom();
	}
	
	@Bean
	public CDRetiroAFP25ArrayList idCIRetiroAFP25() {
		return new CDRetiroAFP25ArrayList();
	}
}
