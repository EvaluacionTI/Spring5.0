package com.bbva.qwpu.dto.evolutivo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.apx.dto.AbstractDTO;

public class CECanalDTO extends AbstractDTO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory.getLogger(CECanalDTO.class);
	
	private int id;
	private String codigo;
	private String abreviatura;
	private String descripcion;
	private Boolean siNoActivo;
	private Date fechaRegistro;

	public CECanalDTO(){}
	
	public CECanalDTO(int piId, String psCodigo, String psAbreviatura, String psDescripcion, Boolean pbSiNoActivo, String psFechaRegistro){
		SimpleDateFormat oFechaFormato = new SimpleDateFormat("dd/mm/yyyy");
		Date dFechaFormato = null;
		
		try {
			dFechaFormato = oFechaFormato.parse(psFechaRegistro);
		} catch (ParseException e) {
			LOGGER.debug("[APX] Fecha errada {} {} ", psFechaRegistro, e.getMessage());
		}
		
		this.id = piId;
		this.codigo = psCodigo;
		this.abreviatura = psAbreviatura;
		this.descripcion = psDescripcion;
		this.siNoActivo = pbSiNoActivo;
		this.fechaRegistro = dFechaFormato;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	public Boolean getSiNoActivo() {
		return siNoActivo;
	}
	public void setSiNoActivo(Boolean siNoActivo) {
		this.siNoActivo = siNoActivo;
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
		builder.append("CECanalDTO [id=");
		builder.append(id);
		builder.append(", codigo=");
		builder.append(codigo);
		builder.append(", abreviatura=");
		builder.append(abreviatura);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", siNoActivo=");
		builder.append(siNoActivo);
		builder.append(", fechaRegistro=");
		builder.append(fechaRegistro);
		builder.append("]");
		return builder.toString();
	}
}
