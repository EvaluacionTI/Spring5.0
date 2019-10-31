package pe.unjfsc.daw.spring.vista;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.unjfsc.daw.spring.entidad.CE05AlumnoNotacion;

public class CV06ContenedorSpringAnotacion {

	public static void main(String[] args) {
		
		//Accediendo al contenedor con Anotaciones
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext(CE05AlumnoNotacion.class);
		
		System.out.println("Contenedor Spring : " + oCntx);

		CE05AlumnoNotacion oAlumno = (CE05AlumnoNotacion) oCntx.getBean(CE05AlumnoNotacion.class);
		
		System.out.println("Instancia con datos del bean : " + oAlumno.toString());
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
