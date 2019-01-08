package pe.etg.bbva.spring.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pe.etg.bbva.spring.service.CI0101v01ProductoServicio;
import pe.etg.bbva.spring.service.impl.CM0101v01ProductoServicioImplementar;

@Configuration
@ComponentScan("pe.bbva.architecture.model")
public class CDSpringConfiguration {
	
	@Bean("idCI0101v01ProductoServicio")
	public CI0101v01ProductoServicio anotacionProducto() {
		return new CM0101v01ProductoServicioImplementar();
	}
}
