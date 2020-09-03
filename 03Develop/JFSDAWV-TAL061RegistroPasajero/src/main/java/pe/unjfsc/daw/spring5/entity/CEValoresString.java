package pe.unjfsc.daw.spring5.entity;

public class CEValoresString {
	private String longitud;
	private String enMayuscula;
	private String enMinuscula;
	private String mostrarSubCadena;
	private String remplazarSubcadena;
	private String concatenar;
	private String primerAparicion;
	private String eliminarEspacios;
	private String caracterIndice;
	private String ultimAparicion;
	public String getLongitud() {
		return longitud;
	}
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	public String getEnMayuscula() {
		return enMayuscula;
	}
	public void setEnMayuscula(String enMayuscula) {
		this.enMayuscula = enMayuscula;
	}
	public String getEnMinuscula() {
		return enMinuscula;
	}
	public void setEnMinuscula(String enMinuscula) {
		this.enMinuscula = enMinuscula;
	}
	public String getMostrarSubCadena() {
		return mostrarSubCadena;
	}
	public void setMostrarSubCadena(String mostrarSubCadena) {
		this.mostrarSubCadena = mostrarSubCadena;
	}
	public String getRemplazarSubcadena() {
		return remplazarSubcadena;
	}
	public void setRemplazarSubcadena(String remplazarSubcadena) {
		this.remplazarSubcadena = remplazarSubcadena;
	}
	public String getConcatenar() {
		return concatenar;
	}
	public void setConcatenar(String concatenar) {
		this.concatenar = concatenar;
	}
	public String getPrimerAparicion() {
		return primerAparicion;
	}
	public void setPrimerAparicion(String primerAparicion) {
		this.primerAparicion = primerAparicion;
	}
	public String getEliminarEspacios() {
		return eliminarEspacios;
	}
	public void setEliminarEspacios(String eliminarEspacios) {
		this.eliminarEspacios = eliminarEspacios;
	}
	public String getCaracterIndice() {
		return caracterIndice;
	}
	public void setCaracterIndice(String caracterIndice) {
		this.caracterIndice = caracterIndice;
	}
	public String getUltimAparicion() {
		return ultimAparicion;
	}
	public void setUltimAparicion(String ultimAparicion) {
		this.ultimAparicion = ultimAparicion;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEValoresString [longitud=");
		builder.append(longitud);
		builder.append(", enMayuscula=");
		builder.append(enMayuscula);
		builder.append(", enMinuscula=");
		builder.append(enMinuscula);
		builder.append(", mostrarSubCadena=");
		builder.append(mostrarSubCadena);
		builder.append(", remplazarSubcadena=");
		builder.append(remplazarSubcadena);
		builder.append(", concatenar=");
		builder.append(concatenar);
		builder.append(", primerAparicion=");
		builder.append(primerAparicion);
		builder.append(", eliminarEspacios=");
		builder.append(eliminarEspacios);
		builder.append(", caracterIndice=");
		builder.append(caracterIndice);
		builder.append(", ultimAparicion=");
		builder.append(ultimAparicion);
		builder.append("]");
		return builder.toString();
	}
	
}
