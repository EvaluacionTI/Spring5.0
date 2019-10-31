package pe.etg.bbva.spring.entity;

import java.io.Serializable;
import java.util.Date;

public class CEFechaProgramacionTerapia implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date fechaInicio;
	private Date fechaTermino;
	
	public CEFechaProgramacionTerapia() {}
	
	
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaTermino() {
		return fechaTermino;
	}
	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}
}
