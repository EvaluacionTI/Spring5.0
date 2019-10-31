package pe.etg.bbva.spring.entity;

import java.io.Serializable;
import java.util.Date;

public class CE01TipoPlan implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String codigoTipoPlan;
	private String codigoEmpresa;
	private String codigoIdioma;
	private String abreviatura;
	private String descripcion;
	private boolean siNoVisualizar;
	private boolean siNoEditar;
	private boolean siNoAnula;
	private boolean siNoElimina;
	private boolean siNoDefault;
	private boolean siNoActivo;
	private String usuarioNuevo;
	private Date fechaAlta;
	private String usuarioUltimaModificacion;
	private Date fechaUltimaModificacion;
	
	public String getCodigoTipoPlan() {
		return codigoTipoPlan;
	}
	public void setCodigoTipoPlan(String codigoTipoPlan) {
		this.codigoTipoPlan = codigoTipoPlan;
	}
	public String getCodigoEmpresa() {
		return codigoEmpresa;
	}
	public void setCodigoEmpresa(String codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}
	public String getCodigoIdioma() {
		return codigoIdioma;
	}
	public void setCodigoIdioma(String codigoIdioma) {
		this.codigoIdioma = codigoIdioma;
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
	public boolean isSiNoVisualizar() {
		return siNoVisualizar;
	}
	public void setSiNoVisualizar(boolean siNoVisualizar) {
		this.siNoVisualizar = siNoVisualizar;
	}
	public boolean isSiNoEditar() {
		return siNoEditar;
	}
	public void setSiNoEditar(boolean siNoEditar) {
		this.siNoEditar = siNoEditar;
	}
	public boolean isSiNoAnula() {
		return siNoAnula;
	}
	public void setSiNoAnula(boolean siNoAnula) {
		this.siNoAnula = siNoAnula;
	}
	public boolean isSiNoElimina() {
		return siNoElimina;
	}
	public void setSiNoElimina(boolean siNoElimina) {
		this.siNoElimina = siNoElimina;
	}
	public boolean isSiNoDefault() {
		return siNoDefault;
	}
	public void setSiNoDefault(boolean siNoDefault) {
		this.siNoDefault = siNoDefault;
	}
	public boolean isSiNoActivo() {
		return siNoActivo;
	}
	public void setSiNoActivo(boolean siNoActivo) {
		this.siNoActivo = siNoActivo;
	}
	public String getUsuarioNuevo() {
		return usuarioNuevo;
	}
	public void setUsuarioNuevo(String usuarioNuevo) {
		this.usuarioNuevo = usuarioNuevo;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public String getUsuarioUltimaModificacion() {
		return usuarioUltimaModificacion;
	}
	public void setUsuarioUltimaModificacion(String usuarioUltimaModificacion) {
		this.usuarioUltimaModificacion = usuarioUltimaModificacion;
	}
	public Date getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}
	public void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
		this.fechaUltimaModificacion = fechaUltimaModificacion;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CE01TipoPlan [codigoTipoPlan=");
		builder.append(codigoTipoPlan);
		builder.append(", codigoEmpresa=");
		builder.append(codigoEmpresa);
		builder.append(", codigoIdioma=");
		builder.append(codigoIdioma);
		builder.append(", abreviatura=");
		builder.append(abreviatura);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", siNoVisualizar=");
		builder.append(siNoVisualizar);
		builder.append(", siNoEditar=");
		builder.append(siNoEditar);
		builder.append(", siNoAnula=");
		builder.append(siNoAnula);
		builder.append(", siNoElimina=");
		builder.append(siNoElimina);
		builder.append(", siNoDefault=");
		builder.append(siNoDefault);
		builder.append(", siNoActivo=");
		builder.append(siNoActivo);
		builder.append(", usuarioNuevo=");
		builder.append(usuarioNuevo);
		builder.append(", fechaAlta=");
		builder.append(fechaAlta);
		builder.append(", usuarioUltimaModificacion=");
		builder.append(usuarioUltimaModificacion);
		builder.append(", fechaUltimaModificacion=");
		builder.append(fechaUltimaModificacion);
		builder.append("]");
		return builder.toString();
	}
	


}
