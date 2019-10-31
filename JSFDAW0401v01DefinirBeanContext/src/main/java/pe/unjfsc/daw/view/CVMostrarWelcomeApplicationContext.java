package pe.unjfsc.daw.view;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.logica.CIWelcome;

public class CVMostrarWelcomeApplicationContext {
	private static ClassPathXmlApplicationContext oContext;

	public static void main(String[] args) {

		oContext = new ClassPathXmlApplicationContext("spring-welcome.xml");
		
		CIWelcome oMensaje = (CIWelcome) oContext.getBean("idWelcome");
		
		oMensaje.bienvenido();
		
		oContext.close();
	}
}
