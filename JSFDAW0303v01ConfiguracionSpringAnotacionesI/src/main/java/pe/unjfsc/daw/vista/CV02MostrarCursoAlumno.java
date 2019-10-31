package pe.unjfsc.daw.vista;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.unjfsc.daw.entidad.CEAlumno;
import pe.unjfsc.daw.entidad.CEConfiguracion;
import pe.unjfsc.daw.entidad.CECurso;

public class CV02MostrarCursoAlumno {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();

		oCntx.register(CEConfiguracion.class);
		oCntx.refresh();
		
		System.out.println("Mostrando el contexto : " + oCntx);
		
		// Instanciando el bean CEAlumno
		CEAlumno oAlumno = (CEAlumno) oCntx.getBean("oCEAlumno");
				
		System.out.println("Instancia de Alumno : " + oAlumno);
		
		// Instanciando el bean CECurso
		CECurso oCurso = (CECurso) oCntx.getBean("oCECurso");
						
		System.out.println("Instancia de Curso : " + oCurso);
		
		// Cerrando el contexto
		((ConfigurableApplicationContext) oCntx).close();
	}

}
