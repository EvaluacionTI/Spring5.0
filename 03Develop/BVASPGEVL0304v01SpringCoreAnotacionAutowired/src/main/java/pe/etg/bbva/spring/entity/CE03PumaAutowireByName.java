package pe.etg.bbva.spring.entity;

public class CE03PumaAutowireByName {
	public String nombre;
	public CE01ColorAnimal color;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public CE01ColorAnimal getColor() {
		return color;
	}
	public void setColor(CE01ColorAnimal color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "CE03PumaAutowireByName [nombre=" + nombre + ", color=" + color + "]";
	}
}
