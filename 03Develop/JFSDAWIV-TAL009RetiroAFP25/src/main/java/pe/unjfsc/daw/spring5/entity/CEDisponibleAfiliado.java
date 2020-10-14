package pe.unjfsc.daw.spring5.entity;

import java.time.LocalDate;

public class CEDisponibleAfiliado {
	private String codigoAfiliado;
	private LocalDate fechaPrimerDesembolso;
	private double saldoPrimerDesembolso;
	private String estadoPrimerDesembolso;
	private double fechaSegundoDesembolso;
	private double saldoSegundoDesembolso;
	private String estadoSegundoDesembolso;
	
	public String getCodigoAfiliado() {
		return codigoAfiliado;
	}
	public void setCodigoAfiliado(String codigoAfiliado) {
		this.codigoAfiliado = codigoAfiliado;
	}
	public LocalDate getFechaPrimerDesembolso() {
		return fechaPrimerDesembolso;
	}
	public void setFechaPrimerDesembolso(LocalDate fechaPrimerDesembolso) {
		this.fechaPrimerDesembolso = fechaPrimerDesembolso;
	}
	public double getSaldoPrimerDesembolso() {
		return saldoPrimerDesembolso;
	}
	public void setSaldoPrimerDesembolso(double saldoPrimerDesembolso) {
		this.saldoPrimerDesembolso = saldoPrimerDesembolso;
	}
	public String getEstadoPrimerDesembolso() {
		return estadoPrimerDesembolso;
	}
	public void setEstadoPrimerDesembolso(String estadoPrimerDesembolso) {
		this.estadoPrimerDesembolso = estadoPrimerDesembolso;
	}
	public double getFechaSegundoDesembolso() {
		return fechaSegundoDesembolso;
	}
	public void setFechaSegundoDesembolso(double fechaSegundoDesembolso) {
		this.fechaSegundoDesembolso = fechaSegundoDesembolso;
	}
	public double getSaldoSegundoDesembolso() {
		return saldoSegundoDesembolso;
	}
	public void setSaldoSegundoDesembolso(double saldoSegundoDesembolso) {
		this.saldoSegundoDesembolso = saldoSegundoDesembolso;
	}
	public String getEstadoSegundoDesembolso() {
		return estadoSegundoDesembolso;
	}
	public void setEstadoSegundoDesembolso(String estadoSegundoDesembolso) {
		this.estadoSegundoDesembolso = estadoSegundoDesembolso;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEDisponibleAfiliado [codigoAfiliado=");
		builder.append(codigoAfiliado);
		builder.append(", fechaPrimerDesembolso=");
		builder.append(fechaPrimerDesembolso);
		builder.append(", saldoPrimerDesembolso=");
		builder.append(saldoPrimerDesembolso);
		builder.append(", estadoPrimerDesembolso=");
		builder.append(estadoPrimerDesembolso);
		builder.append(", fechaSegundoDesembolso=");
		builder.append(fechaSegundoDesembolso);
		builder.append(", saldoSegundoDesembolso=");
		builder.append(saldoSegundoDesembolso);
		builder.append(", estadoSegundoDesembolso=");
		builder.append(estadoSegundoDesembolso);
		builder.append("]");
		return builder.toString();
	}
	
}
