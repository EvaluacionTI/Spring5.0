package pe.bbva.evalua.spring5.entity;

import java.util.List;

public class CE04PaisCollection {
	private String nombre;
	private List<CE0202Ciudad> listCiudad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<CE0202Ciudad> getListCiudad() {
		return listCiudad;
	}
	public void setListCiudad(List<CE0202Ciudad> listCiudad) {
		this.listCiudad = listCiudad;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CE04PaisCollection [nombre=");
		builder.append(nombre);
		builder.append(", listCiudad=");
		builder.append(listCiudad);
		builder.append("]");
		return builder.toString();
	}
}
