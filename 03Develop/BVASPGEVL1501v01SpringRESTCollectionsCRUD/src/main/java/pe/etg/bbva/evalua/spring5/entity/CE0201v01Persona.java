package pe.etg.bbva.evalua.spring5.entity;

import java.io.Serializable;

public class CE0201v01Persona implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nombre;
	private String direccion;
	private int edad;
	private boolean sexo;

	public CE0201v01Persona() {};
	
	public CE0201v01Persona(Long plId, String psNombre, String psDireccion, int piEdad, boolean pbSexo) {
		this.id = plId;
		this.nombre = psNombre;
		this.direccion = psDireccion;
		this.edad = piEdad;
		this.sexo = pbSexo;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
}
