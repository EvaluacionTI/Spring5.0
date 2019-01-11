package pe.etg.bbva.spring.entity;

import org.springframework.beans.factory.annotation.Value;

public class CE0802v01Pais {

	@Value("Italy")
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "CE0802v01Pais [nombre=" + nombre + "]";
	}
	
}
