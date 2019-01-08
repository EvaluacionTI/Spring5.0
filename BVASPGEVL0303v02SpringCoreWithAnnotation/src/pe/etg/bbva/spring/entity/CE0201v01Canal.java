package pe.etg.bbva.spring.entity;

import org.springframework.beans.factory.annotation.Value;

public class CE0201v01Canal {
	
	@Value("16")
	private int id;
	
	@Value("Esteban Alexander")
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
		return "CECanal [id=" + id + ", nombre=" + nombre + "]";
	}
}
