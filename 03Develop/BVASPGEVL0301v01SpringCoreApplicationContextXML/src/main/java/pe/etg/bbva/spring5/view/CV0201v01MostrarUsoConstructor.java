package pe.etg.bbva.spring5.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring5.entity.CEMensaje;

public class CV0201v01MostrarUsoConstructor {
	private static ApplicationContext oCntx;
	public static void main(String[] args) {
		oCntx = new ClassPathXmlApplicationContext("springXML01Config.xml");
		
		System.out.println("ApplicationContext -----> " + oCntx);
		
		oCntx = new ClassPathXmlApplicationContext("springXML02Constructor.xml");
		
		System.out.println("Constructor -----> " + oCntx);
		CEMensaje oCEMensaje = oCntx.getBean("idCEMensaje", CEMensaje.class);
		
		System.out.println("Datos : -----> " + oCEMensaje.getId() + " - " + oCEMensaje.getMensaje());	
	}

}
