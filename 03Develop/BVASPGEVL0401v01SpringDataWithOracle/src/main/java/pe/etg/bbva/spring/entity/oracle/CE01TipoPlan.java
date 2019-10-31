package pe.etg.bbva.spring.entity.oracle;

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
	private String siNoVisualizar;
	private String siNoEditar;
	private String siNoAnula;
	private String siNoElimina;
	private String siNoDefault;
	private String siNoActivo;
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
	public String getSiNoVisualizar() {
		return siNoVisualizar;
	}
	public void setSiNoVisualizar(String siNoVisualizar) {
		this.siNoVisualizar = siNoVisualizar;
	}
	public String getSiNoEditar() {
		return siNoEditar;
	}
	public void setSiNoEditar(String siNoEditar) {
		this.siNoEditar = siNoEditar;
	}
	public String getSiNoAnula() {
		return siNoAnula;
	}
	public void setSiNoAnula(String siNoAnula) {
		this.siNoAnula = siNoAnula;
	}
	public String getSiNoElimina() {
		return siNoElimina;
	}
	public void setSiNoElimina(String siNoElimina) {
		this.siNoElimina = siNoElimina;
	}
	public String getSiNoDefault() {
		return siNoDefault;
	}
	public void setSiNoDefault(String siNoDefault) {
		this.siNoDefault = siNoDefault;
	}
	public String getSiNoActivo() {
		return siNoActivo;
	}
	public void setSiNoActivo(String siNoActivo) {
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
