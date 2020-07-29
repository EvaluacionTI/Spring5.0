package pe.bbva.evalua.spring5.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CTBt14_tipo_plan")
public class CE01TipoPlan implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="cod_tipo_plan")
	private String codigoTipoPlan;
	
	@Column(name="cod_emp")
	private String codigoEmpresa;
	
	@Column(name="cod_iso_idio_orgn")
	private String codigoIdioma;
	
	@Column(name="txt_abrv")
	private String abreviatura;
	
	@Column(name="txt_desc")
	private String descripcion;
	
	@Column(name="sn_ver")
	private boolean siNoVisualizar;
	
	@Column(name="sn_upd")
	private boolean siNoEditar;
	
	@Column(name="sn_anu")
	private boolean siNoAnula;
	
	@Column(name="sn_del")
	private boolean siNoElimina;
	
	@Column(name="sn_dlft")
	private boolean siNoDefault;
	
	@Column(name="sn_act")
	private boolean siNoActivo;
	
	@Column(name="txt_user")
	private String usuarioNuevo;
	
	@Column(name="fec_user")
	private Date fechaAlta;
	
	@Column(name="txt_last_user")
	private String usuarioUltimaModificacion;
	
	@Column(name="fec_last_user")
	private Date fechaUltimaModificacion;
	
	public CE01TipoPlan() {}
	
	public CE01TipoPlan(String pcodigoTipoPlan, String pcodigoEmpresa, String pcodigoIdioma, String pabreviatura,
			String pdescripcion, boolean psiNoVisualizar, boolean psiNoEditar, boolean psiNoAnula,
			boolean psiNoElimina, boolean psiNoDefault, boolean psiNoActivo, String pusuarioNuevo,
			Date pfechaAlta, String pusuarioUltimaModificacion, Date pfechaUltimaModificacion) {
		this.codigoTipoPlan=pcodigoTipoPlan;
		this.codigoEmpresa=pcodigoEmpresa;
		this.codigoIdioma=pcodigoIdioma;
		this.abreviatura=pabreviatura;
		this.descripcion=pdescripcion;
		this.siNoVisualizar=psiNoVisualizar;
		this.siNoEditar=psiNoEditar;
		this.siNoAnula=psiNoAnula;
		this.siNoElimina=psiNoElimina;
		this.siNoDefault=psiNoDefault;
		this.siNoActivo=psiNoActivo;
		this.usuarioNuevo=pusuarioNuevo;
		this.fechaAlta=pfechaAlta;
		this.usuarioUltimaModificacion=pusuarioUltimaModificacion;
		this.fechaUltimaModificacion=pfechaUltimaModificacion;
	}
	
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
