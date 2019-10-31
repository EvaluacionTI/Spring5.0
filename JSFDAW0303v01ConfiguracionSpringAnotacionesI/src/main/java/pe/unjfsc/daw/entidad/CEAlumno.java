package pe.unjfsc.daw.entidad;

import org.springframework.beans.factory.annotation.Value;

public class CEAlumno {
	
	// Asignando un valor de inicialización a la propiedad
	@Value("Esteban Alexander, bienvenido")
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "CEAlumno [nombre=" + nombre + "]";
	}
	
}
