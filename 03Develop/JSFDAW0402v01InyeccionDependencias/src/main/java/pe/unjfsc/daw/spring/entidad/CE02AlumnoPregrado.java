package pe.unjfsc.daw.spring.entidad;

public class CE02AlumnoPregrado {
	CE01AlumnoCPU oAlumno;
	
	// Inyección de dependencias por Constructor
	public CE02AlumnoPregrado(CE01AlumnoCPU poAlumno) {
		this.oAlumno = poAlumno;
	}

	// Inyección de dependencias por set
	public void setoAlumno(CE01AlumnoCPU oAlumno) {
		this.oAlumno = oAlumno;
	}
	
	public CE01AlumnoCPU getoAlumno() {
		return oAlumno;
	}

	public void mostrarAlumno() {
		oAlumno.datosAlumnoCPU();
	}
}
