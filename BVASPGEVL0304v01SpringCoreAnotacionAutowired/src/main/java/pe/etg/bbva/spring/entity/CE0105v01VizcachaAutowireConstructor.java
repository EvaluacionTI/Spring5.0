package pe.etg.bbva.spring.entity;

public class CE0105v01VizcachaAutowireConstructor {
	public String nombre;
	public CE0105v01ColorAnimal color;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public CE0105v01ColorAnimal getColor() {
		return color;
	}
	public void setColor(CE0105v01ColorAnimal color) {
		this.color = color;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEVizcachaAutowireConstructor [nombre=").append(nombre).append(", color=").append(color)
				.append("]");
		return builder.toString();
	}
}
