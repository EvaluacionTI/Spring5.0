package pe.etg.bbva.spring5.entity;

public class CE1003v01Person {
	private int id;
	private String codigo;
	private String nombre;
	private String apodo;
	private CE1002v01Pais pais;
	
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
	public CE1002v01Pais getPais() {
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
	public void setPais(CE1002v01Pais pais) {
		this.pais = pais;
	}

}
