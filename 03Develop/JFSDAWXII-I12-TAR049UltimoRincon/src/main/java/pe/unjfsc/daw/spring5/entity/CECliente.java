package pe.unjfsc.daw.spring5.entity;

public class CECliente {
	private String codigoCliente;
	private String numeroDNI;
	private String correo;
	private String nombre;

	public CECliente() {}
	
	public CECliente(String codigoCliente, String numeroDNI, String correo, String nombre) {
		super();
		this.codigoCliente = codigoCliente;
		this.numeroDNI = numeroDNI;
		this.correo = correo;
		this.nombre = nombre;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getNumeroDNI() {
		return numeroDNI;
	}
	public void setNumeroDNI(String numeroDNI) {
		this.numeroDNI = numeroDNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CECliente [codigoCliente=");
		builder.append(codigoCliente);
		builder.append(", numeroDNI=");
		builder.append(numeroDNI);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", correo=");
		builder.append(correo);
		builder.append("]");
		return builder.toString();
	}
	
}
