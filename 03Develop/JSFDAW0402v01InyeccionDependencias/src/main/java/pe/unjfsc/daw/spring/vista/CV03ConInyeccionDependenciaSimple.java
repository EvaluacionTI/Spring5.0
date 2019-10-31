package pe.unjfsc.daw.spring.vista;

import pe.unjfsc.daw.spring.entidad.CE01AlumnoCPU;
import pe.unjfsc.daw.spring.entidad.CE02AlumnoPregrado;

public class CV03ConInyeccionDependenciaSimple {

	public static void main(String[] args) {
		
		// Instanciando al alumno por medio del constructor
		CE02AlumnoPregrado oCEAlumno = new CE02AlumnoPregrado(new CE01AlumnoCPU());

		System.out.println("Instancia por Constructor generada" + oCEAlumno);
		oCEAlumno.mostrarAlumno();
		
		// Instanciando al alumno por medio del constructor
		 oCEAlumno.setoAlumno(new CE01AlumnoCPU());
		 System.out.println("Instancia por Constructor generada" + oCEAlumno.getoAlumno());
		 oCEAlumno.mostrarAlumno();
		 
	}

}
