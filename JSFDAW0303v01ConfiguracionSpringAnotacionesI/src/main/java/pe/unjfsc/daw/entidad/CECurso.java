package pe.unjfsc.daw.entidad;

import org.springframework.beans.factory.annotation.Value;

public class CECurso {
	
	@Value("108")
	private int id;
	
	@Value("Desarrollo Aplicaciones Web")
	private String nombre;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "CECurso [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
