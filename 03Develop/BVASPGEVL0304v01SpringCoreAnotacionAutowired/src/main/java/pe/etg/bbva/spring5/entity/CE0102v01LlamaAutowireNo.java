package pe.etg.bbva.spring5.entity;

public class CE0102v01LlamaAutowireNo {
	public String nombre;
	public CE0102v01ColorAnimal color;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public CE0102v01ColorAnimal getColor() {
		return color;
	}
	public void setColor(CE0102v01ColorAnimal color) {
		this.color = color;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CE0102v01LlamaAutowireNo [nombre=").append(nombre).append(", color=").append(color).append("]");
		return builder.toString();
	}
	
}
