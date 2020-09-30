package pe.bbva.evalua.spring5.entity;

public class CE0201Pais {
	private String nombre;
	
	private CE0202Ciudad ciudad;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CE0202Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(CE0202Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CE0201Pais [nombre=");
		builder.append(nombre);
		builder.append(", ciudad=");
		builder.append(ciudad);
		builder.append("]");
		return builder.toString();
	}

}
