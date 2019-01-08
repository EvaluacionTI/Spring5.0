package pe.etg.bbva.spring.view;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.etg.bbva.spring.controler.CCPerson;
import pe.etg.bbva.spring.model.CDConfiguracionAnotacionOracle;

public class CV0101v01MostrarPerson {

	private static AnnotationConfigApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(CDConfiguracionAnotacionOracle.class);
		context.getBean(CCPerson.class).process();

	}

}
