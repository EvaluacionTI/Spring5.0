package pe.etg.bbva.spring5.entity;

public class CE05VizcachaAutowireConstructor {
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
		builder.append("CEVizcachaAutowireConstructor [nombre=").append(nombre).append(", color=").append(color)
				.append("]");
		return builder.toString();
	}
}
