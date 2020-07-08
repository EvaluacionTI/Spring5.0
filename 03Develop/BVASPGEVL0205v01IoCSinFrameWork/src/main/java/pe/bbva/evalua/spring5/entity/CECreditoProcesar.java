package pe.bbva.evalua.spring5.entity;

import java.io.Serializable;

public class CECreditoProcesar implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String moneda;
	private double creditoProcesar;
	private double creditoDisponible;
	private double disponibleRestiro;
	private double cargoOperacion;
	
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
	public double getCargoOperacion() {
		return cargoOperacion;
	}
	public void setCargoOperacion(double cargoOperacion) {
		this.cargoOperacion = cargoOperacion;
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
		builder.append(", cargoOperacion=");
		builder.append(cargoOperacion);
		builder.append("]");
		return builder.toString();
	}
	
	
}
