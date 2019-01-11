package pe.etg.bbva.spring.entity;

public class CE0801v03Pais {

	private String nombre;
	
	private CE0801v03Ciudad ciudad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CE0801v03Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(CE0801v03Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	
}
