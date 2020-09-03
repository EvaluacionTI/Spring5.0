package pe.unjfsc.daw.spring5.entity;

public class CEOperacion {
	private int numerOperacion;
	private double deudaVencida;
	private double creditoProcesar;
	private double creditoDisponible;
	
	public int getNumerOperacion() {
		return numerOperacion;
	}
	public void setNumerOperacion(int numerOperacion) {
		this.numerOperacion = numerOperacion;
	}
	public double getDeudaVencida() {
		return deudaVencida;
	}
	public void setDeudaVencida(double deudaVencida) {
		this.deudaVencida = deudaVencida;
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEOperacion [numerOperacion=");
		builder.append(numerOperacion);
		builder.append(", deudaVencida=");
		builder.append(deudaVencida);
		builder.append(", creditoProcesar=");
		builder.append(creditoProcesar);
		builder.append(", creditoDisponible=");
		builder.append(creditoDisponible);
		builder.append("]");
		return builder.toString();
	}
	
	
}
