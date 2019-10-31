package pe.unjfsc.daw.vista;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.config.CEConfiguracion;
import pe.unjfsc.daw.entidad.CEAlumno;

public class CVMostrarAlumno {

	public static void main(String[] args) {
		
		System.out.println("Mostrando el Bean con la configuracion XML");
		ApplicationContext oCntXml = new ClassPathXmlApplicationContext("spring-config.xml");
		
		System.out.println("Mostrando el context : " + oCntXml);
		CEAlumno oAlumno = (CEAlumno) oCntXml.getBean("idCEAlumno");
		
		System.out.println("Mostrando la instancia : " + oAlumno);
		
		System.out.println("Mostrando el valor del objeto : " + oAlumno.getNombre());
		
		((ConfigurableApplicationContext)oCntXml).close();
		
		System.out.println("Mostrando el Bean con Anotaciones");
		
		AnnotationConfigApplicationContext oCntxAnotacion = new AnnotationConfigApplicationContext(CEConfiguracion.class); 
		
		System.out.println("Mostrando el context Anotacion : " + oCntxAnotacion);
		
		CEAlumno oAlumnoAnotado = (CEAlumno) oCntxAnotacion.getBean("oCEAlumno");
			
		System.out.println("Mostrando la instancia CEAlumno : " + oAlumnoAnotado);
			
		System.out.println("Mostrando el valor del objeto Anotacion : " + oAlumnoAnotado.getNombre());

		((ConfigurableApplicationContext) oCntxAnotacion).close();
	}

}
