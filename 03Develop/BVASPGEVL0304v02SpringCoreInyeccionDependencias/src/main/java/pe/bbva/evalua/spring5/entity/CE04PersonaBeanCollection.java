package pe.bbva.evalua.spring5.entity;

public class CE04PersonaBeanCollection {
	private int id;
	private String nombre;
	private String apodo;
	
	public CE04PaisCollection pais;

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

	public CE04PaisCollection getPais() {
		return pais;
	}

	public void setPais(CE04PaisCollection pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CE04PersonaBeanCollection [id=");
		builder.append(id);
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
