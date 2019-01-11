package pe.etg.bbva.spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class CE0802v03Person {
	
	@Value("152027")
	private int id;
	private String codigo;
	private String nombre;
	
	@Value("Bigote")
	private String apodo;
	
	@Autowired
	private CE0802v03Pais pais;
	
	public int getId() {
		return id;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApodo() {
		return apodo;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public CE0802v03Pais getPais() {
		return pais;
	}
	public void setPais(CE0802v03Pais pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CE0802v01Person [id=");
		builder.append(id);
		builder.append(", codigo=");
		builder.append(codigo);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apodo=");
		builder.append(apodo);
		builder.append(", pais=");
		builder.append(pais);
		builder.append("]");
		return builder.toString();
	}
	
}
