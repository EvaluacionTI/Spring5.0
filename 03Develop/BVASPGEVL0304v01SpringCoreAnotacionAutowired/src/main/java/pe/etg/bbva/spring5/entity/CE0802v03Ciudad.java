package pe.etg.bbva.spring5.entity;

import org.springframework.beans.factory.annotation.Value;

public class CE0802v03Ciudad {
	@Value("CABANA")
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
