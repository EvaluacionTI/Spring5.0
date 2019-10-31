package pe.unjfsc.daw.vista;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.unjfsc.daw.entidad.CEAlumno;
import pe.unjfsc.daw.entidad.CEConfiguracion;

public class CV01MostrarDatosConAnotaciones {

	public static void main(String[] args) {
		
		// Declaramos el contexto en referencia a la clase Configuracion
		ApplicationContext oCntx = new AnnotationConfigApplicationContext(CEConfiguracion.class);
		
		System.out.println("Mostrando el contexto : " + oCntx);
		
		// Instanciando el bean CEAlumno
		CEAlumno oAlumno = (CEAlumno) oCntx.getBean("oCEAlumno");
		
		System.out.println("Instancia de Alumno : " + oAlumno);
		// Cerrando el contexto
		((ConfigurableApplicationContext) oCntx).close();

	}

}
