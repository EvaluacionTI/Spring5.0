package pe.bbva.evalua.spring5.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;
import pe.bbva.evalua.spring5.service.CSSaldoAfiliado;

@Configuration
public class CEConfigEntity {
	private static final Logger LOG = LoggerFactory.getLogger("CEConfigEntity");
	
	@Bean
	public CESaldoAfiliadoCustom idCESaldo() {
		LOG.info("[EVL] =====[ Start idCESaldo ]=====");
		
		LOG.info("[EVL] new idCESaldo : {}", (CESaldoAfiliadoCustom) new CESaldoAfiliadoCustom());
		return new CESaldoAfiliadoCustom();
	}
	
	@Bean
	public CSSaldoAfiliado idCSSaldoAfiliado() {
		LOG.info("[EVL] =====[ Start idCSSaldoAfiliado ]=====");
		
		return new CSSaldoAfiliado();
	}
}
