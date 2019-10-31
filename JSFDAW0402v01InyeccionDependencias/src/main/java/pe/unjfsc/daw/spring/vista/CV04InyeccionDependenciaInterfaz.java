package pe.unjfsc.daw.spring.vista;

import pe.unjfsc.daw.spring.controladora.CC04AlumnoCPU;
import pe.unjfsc.daw.spring.entidad.CE04AlumnoPregrado;

public class CV04InyeccionDependenciaInterfaz {

	public static void main(String[] args) {
		
		CE04AlumnoPregrado oAlumno = new CE04AlumnoPregrado(new CC04AlumnoCPU());

		System.out.println("Instancia por construcctor : " + oAlumno);
		oAlumno.mostrarAlumnoCPU();

		// Instanciando al alumno por medio del constructor
		oAlumno.setoAlumnoCPU(new CC04AlumnoCPU());
		System.out.println("Instancia por Constructor generada" + oAlumno.getoAlumnoCPU());
		oAlumno.mostrarAlumnoCPU();		
	}

}
