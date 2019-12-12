package pe.etg.bbva.spring5.entity;

public class CE0701v01Person {
	
	private int id;
	private String codigo;
	private String nombre;
	private String apodo;
	
	public CE0701v01Person(int piId) {
		this.id = piId;
	}
	
	public CE0701v01Person(int piId, String psNombre, String psApodo) {
		this.id = piId;
		this.nombre = psNombre;
		this.apodo = psApodo;
	}
	
	public CE0701v01Person(int piId, String psCodigo, String psNombre, String psApodo) {
		this.id = piId;
		this.codigo = psCodigo;
		this.nombre = psNombre;
		this.apodo = psApodo;
	}
	
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
	
	@Override
	public String toString() {
		return "CE0701v01Person [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", apodo=" + apodo + "]";
	}
}
