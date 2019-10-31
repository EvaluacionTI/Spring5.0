package pe.etg.bbva.evalua.spring5.entity;

import java.util.Date;

public class CE0101v01TipoCanal {
	private int idTipoCanal;
	private String abreviatura;
	private String descripcion;
	private Date fechaRegistro;
	public int getIdTipoCanal() {
		return idTipoCanal;
	}
	public void setIdTipoCanal(int idTipoCanal) {
		this.idTipoCanal = idTipoCanal;
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
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CE0101v01TipoCanal [idTipoCanal=").append(idTipoCanal).append(", abreviatura=").append(abreviatura)
				.append(", descripcion=").append(descripcion).append(", fechaRegistro=").append(fechaRegistro)
				.append("]");
		return builder.toString();
	}
	
}
