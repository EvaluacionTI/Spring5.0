
package com.bbva.qwpu.dto.customers;

import java.math.BigDecimal;

import com.bbva.apx.dto.AbstractDTO;

public class DTOTransferencia extends AbstractDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idTransfer;
	private String fechaMovimiento;
	private String ordenante;
	private String monedaOrigen;
	private String numeroCuentaOrigen;
	private Double importeOrigen;
	
	private String monedaDestino;
	private String numeroCuentaDestino;
	private BigDecimal importeDestino;
	private String beneficiario;
	
	public Long getIdTransfer() {
		return idTransfer;
	}
	public void setIdTransfer(Long idTransfer) {
		this.idTransfer = idTransfer;
	}
	public String getFechaMovimiento() {
		return fechaMovimiento;
	}
	public void setFechaMovimiento(String fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}
	public String getOrdenante() {
		return ordenante;
	}
	public void setOrdenante(String ordenante) {
		this.ordenante = ordenante;
	}
	public String getMonedaOrigen() {
		return monedaOrigen;
	}
	public void setMonedaOrigen(String monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}
	public String getNumeroCuentaOrigen() {
		return numeroCuentaOrigen;
	}
	public void setNumeroCuentaOrigen(String numeroCuentaOrigen) {
		this.numeroCuentaOrigen = numeroCuentaOrigen;
	}
	public Double getImporteOrigen() {
		return importeOrigen;
	}
	public void setImporteOrigen(Double importeOrigen) {
		this.importeOrigen = importeOrigen;
	}
	public String getMonedaDestino() {
		return monedaDestino;
	}
	public void setMonedaDestino(String monedaDestino) {
		this.monedaDestino = monedaDestino;
	}
	public String getNumeroCuentaDestino() {
		return numeroCuentaDestino;
	}
	public void setNumeroCuentaDestino(String numeroCuentaDestino) {
		this.numeroCuentaDestino = numeroCuentaDestino;
	}
	public BigDecimal getImporteDestino() {
		return importeDestino;
	}
	public void setImporteDestino(BigDecimal importeDestino) {
		this.importeDestino = importeDestino;
	}
	public String getBeneficiario() {
		return beneficiario;
	}
	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DTOTransferencia [idTransfer=");
		builder.append(idTransfer);
		builder.append(", fechaMovimiento=");
		builder.append(fechaMovimiento);
		builder.append(", ordenante=");
		builder.append(ordenante);
		builder.append(", monedaOrigen=");
		builder.append(monedaOrigen);
		builder.append(", numeroCuentaOrigen=");
		builder.append(numeroCuentaOrigen);
		builder.append(", importeOrigen=");
		builder.append(importeOrigen);
		builder.append(", monedaDestino=");
		builder.append(monedaDestino);
		builder.append(", numeroCuentaDestino=");
		builder.append(numeroCuentaDestino);
		builder.append(", importeDestino=");
		builder.append(importeDestino);
		builder.append(", beneficiario=");
		builder.append(beneficiario);
		builder.append("]");
		return builder.toString();
	}
	
}
