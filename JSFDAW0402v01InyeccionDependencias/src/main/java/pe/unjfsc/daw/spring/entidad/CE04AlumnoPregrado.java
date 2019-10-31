package pe.unjfsc.daw.spring.entidad;

public class CE04AlumnoPregrado {
	private CI04Alumno oAlumnoCPU;
	
	// Instancia por constructor
	public CE04AlumnoPregrado(CI04Alumno poCIAlumno) {
		this.oAlumnoCPU = poCIAlumno;
	}
	
	public CI04Alumno getoAlumnoCPU() {
		return oAlumnoCPU;
	}

	// Instancia por set
	public void setoAlumnoCPU(CI04Alumno oAlumnoCPU) {
		this.oAlumnoCPU = oAlumnoCPU;
	}

	public void mostrarAlumnoCPU() {
		oAlumnoCPU.datosAlumnoCPU();
	}	
}
