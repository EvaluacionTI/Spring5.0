package pe.etg.bbva.spring.entity;

public class CE0401v01Person {
	private int id;
	private String codigo;
	private String nombre;
	private String apodo;
	private CE0402v01Pais pais;
	private CE0403v01Ciudad ciudad;
	
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
	public CE0402v01Pais getPais() {
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
	public void setPais(CE0402v01Pais pais) {
		this.pais = pais;
	}
	public CE0403v01Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(CE0403v01Ciudad ciudad) {
		this.ciudad = ciudad;
	}

}
