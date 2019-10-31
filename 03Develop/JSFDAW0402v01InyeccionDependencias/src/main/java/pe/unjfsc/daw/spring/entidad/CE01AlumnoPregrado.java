package pe.unjfsc.daw.spring.entidad;

public class CE01AlumnoPregrado {
	// Sin inyección de dependencias
	// La clase Alumno Pregrado se encuentra fuertemente ligada a la clase Alumno CPU
	CE01AlumnoCPU oAlumno = new CE01AlumnoCPU();
	
	public void mostrarDatos() {
		oAlumno.datosAlumnoCPU();
	}
}
