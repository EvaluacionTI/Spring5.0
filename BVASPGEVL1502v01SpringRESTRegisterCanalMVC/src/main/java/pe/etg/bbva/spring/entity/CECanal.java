package pe.etg.bbva.spring.entity;

public class CECanal {
	private int id;
	private String codigo;
	private String abreviatura;
	private String descripcion;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CECanal [id=").append(id).append(", codigo=").append(codigo).append(", abreviatura=")
				.append(abreviatura).append(", descripcion=").append(descripcion).append("]");
		return builder.toString();
	}
	
}
