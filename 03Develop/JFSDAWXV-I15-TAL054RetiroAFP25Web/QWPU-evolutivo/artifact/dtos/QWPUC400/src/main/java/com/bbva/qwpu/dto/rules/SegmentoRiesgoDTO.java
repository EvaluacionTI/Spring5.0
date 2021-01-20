package com.bbva.qwpu.dto.rules;

import com.bbva.apx.dto.AbstractDTO;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Class Name: SegmentoRiesgoDTO
 * Description: Initial class to develop the DTO
 */

public class SegmentoRiesgoDTO extends AbstractDTO {
	private static final long serialVersionUID = 2931699728946643245L;

    // Attributes section for the DTO
	private String nacionalidad;
	private String filtros;
	private int segmento;
	private int grupoRiesgo;
	private double interesPrecio=0.00;
	private double interesAjuste=0.00;
	private double interesTotal=0.00;

	public SegmentoRiesgoDTO(String psNacionalidad, String psFiltros, int piSegmento, int piGrupoRiesgo){
		this.nacionalidad = psNacionalidad;
		this.filtros = psFiltros;
		this.segmento = piSegmento;
		this.grupoRiesgo=piGrupoRiesgo;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getFiltros() {
		return filtros;
	}

	public void setFiltros(String filtros) {
		this.filtros = filtros;
	}

	public int getSegmento() {
		return segmento;
	}

	public void setSegmento(int segmento) {
		this.segmento = segmento;
	}

	public int getGrupoRiesgo() {
		return grupoRiesgo;
	}

	public void setGrupoRiesgo(int grupoRiesgo) {
		this.grupoRiesgo = grupoRiesgo;
	}

	public double getInteresPrecio() {
		return interesPrecio;
	}

	public void setInteresPrecio(double interesPrecio) {
		this.interesPrecio = interesPrecio;
	}

	public double getInteresAjuste() {
		return interesAjuste;
	}

	public void setInteresAjuste(double interesAjuste) {
		this.interesAjuste = interesAjuste;
	}

	public double getInteresTotal() {
		return interesTotal;
	}

	public void setInteresTotal(double interesTotal) {
		this.interesTotal = interesTotal;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("SegmentoRiesgoDTO{");
		sb.append("nacionalidad='").append(nacionalidad).append('\'');
		sb.append(", filtros='").append(filtros).append('\'');
		sb.append(", segmento=").append(segmento);
		sb.append(", grupoRiesgo=").append(grupoRiesgo);
		sb.append(", interesPrecio=").append(interesPrecio);
		sb.append(", interesAjuste=").append(interesAjuste);
		sb.append(", interesTotal=").append(interesTotal);
		sb.append('}');
		return sb.toString();
	}

}
