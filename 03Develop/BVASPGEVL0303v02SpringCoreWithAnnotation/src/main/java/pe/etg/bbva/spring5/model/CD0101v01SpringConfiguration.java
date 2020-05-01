package pe.etg.bbva.spring5.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pe.etg.bbva.spring5.service.CI0101v01ProductoServicio;
import pe.etg.bbva.spring5.service.impl.CM0101v01ProductoServicioImplementar;

@Configuration
@ComponentScan("pe.etg.bbva.spring5.model")
public class CD0101v01SpringConfiguration {
	
	@Bean("idCI0101v01ProductoServicio")
	// Defino una interface asociado al método
	public CI0101v01ProductoServicio anotacionProducto() {
		//Instancio la clase que lo implementa
		return new CM0101v01ProductoServicioImplementar();
	}
}
