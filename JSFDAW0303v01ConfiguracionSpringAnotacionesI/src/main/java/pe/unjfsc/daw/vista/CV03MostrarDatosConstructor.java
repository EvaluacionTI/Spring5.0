package pe.unjfsc.daw.vista;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.entidad.CEHorarioConstructor;

public class CV03MostrarDatosConstructor {
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("spring-constructor.xml");
		
		System.out.println("Mostrando el contexto : " + oCntx);
		
		CEHorarioConstructor oHorario = (CEHorarioConstructor) oCntx.getBean("idHorarioConstructor");
		
		System.out.println("Instancia por constructor : " + oHorario);
		
		System.out.println("Resultado del objeto : " + oHorario.getHoraInicio() + " - " + oHorario.getHoraTermino());
		
		// Cerrando el contexto
		((ConfigurableApplicationContext) oCntx).close();
	}
		
		
}
