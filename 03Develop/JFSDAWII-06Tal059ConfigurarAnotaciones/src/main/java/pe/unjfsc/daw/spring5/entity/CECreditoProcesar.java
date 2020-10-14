package pe.unjfsc.daw.spring5.entity;

import org.springframework.beans.factory.annotation.Value;

public class CECreditoProcesar {
	
	@Value("E")
	private String moneda;
	
	@Value("5000.00")
	private double creditoProcesar;
	
	@Value("10000.99")
	private double creditoDisponible;
	
	@Value("2000.00")
	private double disponibleRestiro;
	
	@Value("30.00")
	private double cargOperacion;
	
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public double getCreditoProcesar() {
		return creditoProcesar;
	}
	public void setCreditoProcesar(double creditoProcesar) {
		this.creditoProcesar = creditoProcesar;
	}
	public double getCreditoDisponible() {
		return creditoDisponible;
	}
	public void setCreditoDisponible(double creditoDisponible) {
		this.creditoDisponible = creditoDisponible;
	}
	public double getDisponibleRestiro() {
		return disponibleRestiro;
	}
	public void setDisponibleRestiro(double disponibleRestiro) {
		this.disponibleRestiro = disponibleRestiro;
	}
	public double getCargOperacion() {
		return cargOperacion;
	}
	public void setCargOperacion(double cargOperacion) {
		this.cargOperacion = cargOperacion;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CECreditoProcesar [moneda=");
		builder.append(moneda);
		builder.append(", creditoProcesar=");
		builder.append(creditoProcesar);
		builder.append(", creditoDisponible=");
		builder.append(creditoDisponible);
		builder.append(", disponibleRestiro=");
		builder.append(disponibleRestiro);
		builder.append(", cargOperacion=");
		builder.append(cargOperacion);
		builder.append("]");
		return builder.toString();
	}
	
}
