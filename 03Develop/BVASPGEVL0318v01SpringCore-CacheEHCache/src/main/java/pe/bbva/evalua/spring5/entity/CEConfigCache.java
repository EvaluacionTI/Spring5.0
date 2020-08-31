package pe.bbva.evalua.spring5.entity;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan("pe.bbva.evalua.spring5")
//@EnableCaching
public class CEConfigCache {
	

	@Bean
	public CEUsuario oCEUsuario() {
		return new CEUsuario();
	}
}
