package pe.etg.bbva.spring5.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class CE0504v01ToroField {
	public String nombre;
	
	// @Autowired sobre el atributo, Spring crea la instancia del objeto y una vez creada le inyecta la independencia.
	@Autowired
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
	
	public void setColor(CE0501v01ColorAnimal color) {
		this.color = color;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CE0504v01ToroField [nombre=");
		builder.append(nombre);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}
}
