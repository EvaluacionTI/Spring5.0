package pe.bbva.evalua.spring5.entity;

public class CE03PersonaBeanAnidado {
	private int id;
	private String nombre;
	private String apodo;
	
	public CE0201Pais pais;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public CE0201Pais getPais() {
		return pais;
	}

	public void setPais(CE0201Pais pais) {
		this.pais = pais;
	}

	
}
