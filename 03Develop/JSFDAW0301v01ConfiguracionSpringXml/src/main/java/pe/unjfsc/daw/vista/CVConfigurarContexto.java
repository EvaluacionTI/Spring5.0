package pe.unjfsc.daw.vista;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CVConfigurarContexto {

	public static void main(String[] args) {
		
		// Definición del contexto de la aplicación
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("spring-config-xml.xml");

		System.out.println("Mostrando el contexto de la aplicación " + oCntx);

		// Cerrando el contexto
		((ConfigurableApplicationContext) oCntx).close();
	}

}
