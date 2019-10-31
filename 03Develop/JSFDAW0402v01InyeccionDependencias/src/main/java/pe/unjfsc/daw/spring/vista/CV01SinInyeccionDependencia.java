package pe.unjfsc.daw.spring.vista;

import pe.unjfsc.daw.spring.entidad.CEAlumno;

public class CV01SinInyeccionDependencia {

	public static void main(String[] args) {
		CEAlumno oAlumno = new CEAlumno();
		
		System.out.println("Instancia sin ID : " + oAlumno);
		System.out.println("Instancia sin ID : " + oAlumno.toString());

	}

}
