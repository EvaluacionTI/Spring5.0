package pe.bbva.architecture.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pe.bbva.architecture.service.CI0101v01ProductoServicio;
import pe.bbva.architecture.service.impl.CM0101v01ProductoServicioImplementar;

@Configuration
@ComponentScan("pe.bbva.architecture.model")
public class CDSpringConfiguration {
	
	@Bean("idCI0101v01ProductoServicio")
	public CI0101v01ProductoServicio anotacionProducto() {
		return new CM0101v01ProductoServicioImplementar();
	}
}
