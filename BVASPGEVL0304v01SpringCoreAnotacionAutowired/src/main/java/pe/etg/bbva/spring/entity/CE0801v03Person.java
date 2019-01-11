package pe.etg.bbva.spring.entity;

public class CE0801v03Person {
	private int id;
	private String codigo;
	private String nombre;
	private String apodo;
	private CE0801v03Pais pais;
	
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
	public CE0801v03Pais getPais() {
		return pais;
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
	public void setPais(CE0801v03Pais pais) {
		this.pais = pais;
	}

}
