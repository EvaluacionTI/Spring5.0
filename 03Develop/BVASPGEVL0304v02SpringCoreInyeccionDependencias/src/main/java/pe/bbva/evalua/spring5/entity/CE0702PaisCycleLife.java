package pe.bbva.evalua.spring5.entity;

public class CE0702PaisCycleLife {
	private String nombre;
	
	private CE0703CiudadCycleLife ciudad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CE0703CiudadCycleLife getCiudad() {
		return ciudad;
	}

	public void setCiudad(CE0703CiudadCycleLife ciudad) {
		this.ciudad = ciudad;
	}
	


}
