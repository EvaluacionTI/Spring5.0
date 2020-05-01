package pe.bbva.evalua.spring5.modulo.inventario;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Jsfdaw5002v01ModuleBasicInventoryJpaApplication.class);
	}

}
