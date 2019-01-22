package pe.etg.bbva.spring.entity;

public class CE0103v01PumaAutowireByName {
	public String nombre;
	public CE0101v01ColorAnimal color;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public CE0101v01ColorAnimal getColor() {
		return color;
	}
	public void setColor(CE0101v01ColorAnimal color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "CE0103v01PumaAutowireByName [nombre=" + nombre + ", color=" + color + "]";
	}
}
