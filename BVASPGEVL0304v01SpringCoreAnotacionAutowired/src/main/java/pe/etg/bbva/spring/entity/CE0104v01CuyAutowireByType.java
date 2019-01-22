package pe.etg.bbva.spring.entity;

public class CE0104v01CuyAutowireByType {
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
		StringBuilder builder = new StringBuilder();
		builder.append("CECuyAutowireByType [nombre=");
		builder.append(nombre);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}
}
