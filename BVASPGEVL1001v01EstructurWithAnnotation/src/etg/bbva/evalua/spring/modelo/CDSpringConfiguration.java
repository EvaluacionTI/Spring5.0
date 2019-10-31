package etg.bbva.evalua.spring.modelo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import etg.bbva.evalua.spring.servicio.CI0101v01ProductoServicio;
import etg.bbva.evalua.spring.servicio.impl.CM0101v01ProductoServicioImplementar;

@Configuration
@ComponentScan("etg.bba.evalua.spring")
public class CDSpringConfiguration {
	
	@Bean("idCI0101v01ProductoServicio")
	public CI0101v01ProductoServicio anotacionProducto() {
		return new CM0101v01ProductoServicioImplementar();
	}
}
