package pe.etg.bbva.spring.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.etg.bbva.spring.entity.CEFechaProgramacionTerapia;
import pe.etg.bbva.spring.entity.CEMensaje;

public class CV0101v01LecturaApplicationContext {

	private static ApplicationContext oCntx;

	public static void main(String[] args) {
		oCntx = new ClassPathXmlApplicationContext("springXML01Config.xml");
		
		System.out.println("ApplicationContext -----> " + oCntx);

		CEFechaProgramacionTerapia oCEProgramacionTerapia = oCntx.getBean("idCEFechaProgramacionTerapia", CEFechaProgramacionTerapia.class);

		System.out.println("Fecha Inicio -----> " + oCEProgramacionTerapia.getFechaInicio());
		System.out.println("Fecha Término -----> " + oCEProgramacionTerapia.getFechaTermino());
		
		oCntx = new ClassPathXmlApplicationContext("springXML02Constructor.xml");
		
		System.out.println("Constructor -----> " + oCntx);
		CEMensaje oCEMensaje = oCntx.getBean("idCEMensaje", CEMensaje.class);

		oCntx = new ClassPathXmlApplicationContext("springXML03GetterSetter.xml");
		
		System.out.println("Getter / Setter -----> " + oCntx + oCEMensaje);		
	}

}
