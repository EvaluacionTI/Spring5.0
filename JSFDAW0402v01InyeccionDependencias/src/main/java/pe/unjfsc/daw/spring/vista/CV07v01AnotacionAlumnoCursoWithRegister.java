package pe.unjfsc.daw.spring.vista;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.unjfsc.daw.spring.entidad.CE05AlumnoNotacion;
import pe.unjfsc.daw.spring.entidad.CECurso;

public class CV07v01AnotacionAlumnoCursoWithRegister {

	public static void main(String[] args) {
		
		//Accediendo al contenedor con Anotaciones
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext(CE05AlumnoNotacion.class, CECurso.class);
		
		System.out.println("Contenedor Spring : " + oCntx);

		CE05AlumnoNotacion oAlumno = (CE05AlumnoNotacion) oCntx.getBean(CE05AlumnoNotacion.class);
		CECurso oCurso = (CECurso) oCntx.getBean(CECurso.class);
		
		System.out.println("Instancia de alumno : " + oAlumno.toString());
		System.out.println("Instancia de curso : " + oCurso.toString());
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
