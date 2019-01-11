package pe.etg.bbva.spring.entity;

import org.springframework.beans.factory.annotation.Value;

public class CE0301v01Person {
	
	private String codigo;
	@Value("Alex Luis Díaz Vásquez")
	private String nombre;
	
	@Value("09313658")
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}	
}
