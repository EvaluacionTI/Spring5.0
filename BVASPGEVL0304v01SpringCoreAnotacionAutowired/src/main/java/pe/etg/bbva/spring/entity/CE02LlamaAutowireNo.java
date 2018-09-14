package pe.etg.bbva.spring.entity;

public class CE02LlamaAutowireNo {
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
		StringBuilder builder = new StringBuilder();
		builder.append("CE02LlamaAutowireNo [nombre=").append(nombre).append(", color=").append(color).append("]");
		return builder.toString();
	}
	
}
