package pe.etg.bbva.spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class CE0802v03Pais {

	@Value("PERÚ")
	private String nombre;
	
	@Autowired
	private CE0802v03Ciudad ciudad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CE0802v03Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(CE0802v03Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "CE0802v03Pais [nombre=" + nombre + ", ciudad=" + ciudad + "]";
	}
	
}
