package pe.etg.bbva.spring.entity;

public class CE04CuyAutowireByType {
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
		builder.append("CECuyAutowireByType [nombre=");
		builder.append(nombre);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}
}
