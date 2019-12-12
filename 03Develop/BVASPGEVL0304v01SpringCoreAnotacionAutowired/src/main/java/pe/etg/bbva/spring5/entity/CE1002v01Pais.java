package pe.etg.bbva.spring5.entity;

import java.util.List;

public class CE1002v01Pais {

	private String nombre;
	private List<CE1001v01Ciudad> ciudades;

	public String getNombre() {
		return nombre;
	}
	public List<CE1001v01Ciudad> getCiudades() {
		return ciudades;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCiudades(List<CE1001v01Ciudad> ciudades) {
		this.ciudades = ciudades;
	}
	
	@Override
	public String toString() {
		return "CE1002v01Pais [nombre=" + nombre + ", ciudades=" + ciudades + "]";
	}
	


	
}
