package pe.bbva.spring5.evalua.modulo.inventario.view;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.bbva.spring5.evalua.modulo.inventario.CE01RevisarBeanLog4j2;

@Configuration
public class CV01RevisarLog4j2 {

	@Bean
	public CE01RevisarBeanLog4j2 oRevisar() {
		return new CE01RevisarBeanLog4j2();
	}
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(CV01RevisarLog4j2.class);

		CE01RevisarBeanLog4j2 bean = context.getBean(CE01RevisarBeanLog4j2.class);

	}

}
