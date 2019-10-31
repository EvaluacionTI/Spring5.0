package pe.unjfsc.daw.spring.vista;

import pe.unjfsc.daw.spring.entidad.CE01AlumnoPregrado;

public class CV02SinInyeccionDependencia {

	public static void main(String[] args) {
		CE01AlumnoPregrado oAlumno = new CE01AlumnoPregrado();
		
		System.out.println("Sin Inyeccion de dependencias");
		oAlumno.mostrarDatos();

	}

}
