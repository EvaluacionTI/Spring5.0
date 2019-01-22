package pe.etg.bbva.spring.entity.formaI;

import org.springframework.beans.factory.annotation.Autowired;

import pe.etg.bbva.spring.entity.CE0101v01ColorAnimal;

public class CE03ToroField {
	public String nombre;
	
	// @Autowired sobre el atributo, Spring crea la instancia del objeto y una vez creada le inyecta la independencia.
	@Autowired
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
		builder.append("CE01Toro [nombre=");
		builder.append(nombre);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}
}
