package pe.unjfsc.daw.spring.entidad;

import org.springframework.beans.factory.annotation.Value;

public class CE05AlumnoNotacion {
	
	@Value("3310929382")
	private String codigo;
	
	@Value("39828239")
	private String numeroDNI;
	
	@Value("DIAZ")
	private String apellidoPaterno;
	
	@Value("CARDENAS")
	private String apellidoMaterno;
	
	@Value("ESTEBAN")
	private String primerNombre;
	
	@Value("ALEXANDER")
	private String segundoNombre;
	
	@Value("")
	private String tercerNombre;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNumeroDNI() {
		return numeroDNI;
	}
	public void setNumeroDNI(String numeroDNI) {
		this.numeroDNI = numeroDNI;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getTercerNombre() {
		return tercerNombre;
	}
	public void setTercerNombre(String tercerNombre) {
		this.tercerNombre = tercerNombre;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CE05AlumnoNotacion [codigo=");
		builder.append(codigo);
		builder.append(", numeroDNI=");
		builder.append(numeroDNI);
		builder.append(", apellidoPaterno=");
		builder.append(apellidoPaterno);
		builder.append(", apellidoMaterno=");
		builder.append(apellidoMaterno);
		builder.append(", primerNombre=");
		builder.append(primerNombre);
		builder.append(", segundoNombre=");
		builder.append(segundoNombre);
		builder.append(", tercerNombre=");
		builder.append(tercerNombre);
		builder.append("]");
		return builder.toString();
	}
}
