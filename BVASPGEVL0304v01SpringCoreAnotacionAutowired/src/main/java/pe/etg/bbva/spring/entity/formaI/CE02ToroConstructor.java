package pe.etg.bbva.spring.entity.formaI;

import org.springframework.beans.factory.annotation.Autowired;

import pe.etg.bbva.spring.entity.CE01ColorAnimal;

public class CE02ToroConstructor {
	public String nombre;
	public CE01ColorAnimal color;
	
	// @Autowired en el constructor, la inyección se realiza en el momento en que el objeto es creado, lo que nos permite marcar con un final real
	// nuestro recurso inyectado 
	@Autowired
	public CE02ToroConstructor(CE01ColorAnimal poColor) {
		this.color = poColor;
	}
	
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
		builder.append("CE02ToroConstructor [nombre=");
		builder.append(nombre);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}
}
