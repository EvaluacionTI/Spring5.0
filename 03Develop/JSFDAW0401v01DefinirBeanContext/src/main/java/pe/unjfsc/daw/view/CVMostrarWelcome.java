package pe.unjfsc.daw.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.logica.CIWelcome;

public class CVMostrarWelcome {

	public static void main(String[] args) {

		ApplicationContext oCntx = new ClassPathXmlApplicationContext("spring-welcome.xml");
		
		CIWelcome oMensaje = oCntx.getBean("idWelcome", CIWelcome.class);
		
		oMensaje.bienvenido();
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
