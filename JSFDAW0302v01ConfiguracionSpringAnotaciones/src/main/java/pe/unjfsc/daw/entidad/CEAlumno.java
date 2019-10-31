package pe.unjfsc.daw.entidad;

import org.springframework.beans.factory.annotation.Value;

public class CEAlumno {
	
	@Value("Illari laskhmi Isabel")
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
