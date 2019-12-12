package pe.etg.bbva.spring5.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class CE0502v01ToroConstructor {
	public String nombre;
	public CE0501v01ColorAnimal color;
	
	// @Autowired en el constructor, la inyección se realiza en el momento en que el objeto es creado, lo que nos permite marcar con un final real
	// nuestro recurso inyectado 
	@Autowired
	public CE0502v01ToroConstructor(CE0501v01ColorAnimal poColor) {
		this.color = poColor;
	}
	
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
		builder.append("CE0502v01ToroConstructor [nombre=");
		builder.append(nombre);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}
}
