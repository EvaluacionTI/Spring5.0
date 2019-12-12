package pe.etg.bbva.spring5.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class CE0503v01ToroSetter {
	public String nombre;
	public CE0501v01ColorAnimal color;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public CE0501v01ColorAnimal getColor() {
		return color;
	}
	
	// Si utilizamos @Autowired en un metodo setter, se creara el metodo y una vez creado, Spring inyectara el bean mediante de dicho metodo
	@Autowired
	public void setColor(CE0501v01ColorAnimal color) {
		this.color = color;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CE0503v01ToroSetter [nombre=");
		builder.append(nombre);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}
}
