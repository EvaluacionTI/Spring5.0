package pe.bbva.architect.entity;

import java.io.Serializable;
import java.util.Date;

public class CE03Cuenta implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idCuenta;
	private String numeroCuenta;
	private int idProducto;
	private int idCliente;
	private Date fechaRegistro;
	private Date fechaAlta;
	private String usuarioAlta;
	private Date fechaLastModify;
	private String usuarioLastModify;
	
	public int getIdCuenta() {
		return idCuenta;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public String getUsuarioAlta() {
		return usuarioAlta;
	}
	public Date getFechaLastModify() {
		return fechaLastModify;
	}
	public String getUsuarioLastModify() {
		return usuarioLastModify;
	}
	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public void setUsuarioAlta(String usuarioAlta) {
		this.usuarioAlta = usuarioAlta;
	}
	public void setFechaLastModify(Date fechaLastModify) {
		this.fechaLastModify = fechaLastModify;
	}
	public void setUsuarioLastModify(String usuarioLastModify) {
		this.usuarioLastModify = usuarioLastModify;
	}
}
