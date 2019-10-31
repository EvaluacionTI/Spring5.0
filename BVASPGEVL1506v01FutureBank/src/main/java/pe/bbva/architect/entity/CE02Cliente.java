package pe.bbva.architect.entity;

import java.io.Serializable;

public class CE02Cliente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7184435042500623237L;
	private int idCliente;
	private String numeroDocumento;
	private String nombrePersona;
	
	public int getIdCliente() {
		return idCliente;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public String getNombrePersona() {
		return nombrePersona;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CE02Cliente [idCliente=");
		builder.append(idCliente);
		builder.append(", numeroDocumento=");
		builder.append(numeroDocumento);
		builder.append(", nombrePersona=");
		builder.append(nombrePersona);
		builder.append("]");
		return builder.toString();
	}

}
