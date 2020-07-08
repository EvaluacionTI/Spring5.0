package pe.bbva.spring5.entity;

public class CEDeudaVencida {
	private String moneda;
	private double deudaVencida;
	private double pagoMinimo;
	private double pagoTotal;
	private double creditoUtilizado;

	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public double getDeudaVencida() {
		return deudaVencida;
	}
	public void setDeudaVencida(double deudaVencida) {
		this.deudaVencida = deudaVencida;
	}
	public double getPagoMinimo() {
		return pagoMinimo;
	}
	public void setPagoMinimo(double pagoMinimo) {
		this.pagoMinimo = pagoMinimo;
	}
	public double getPagoTotal() {
		return pagoTotal;
	}
	public void setPagoTotal(double pagoTotal) {
		this.pagoTotal = pagoTotal;
	}
	public double getCreditoUtilizado() {
		return creditoUtilizado;
	}
	public void setCreditoUtilizado(double creditoUtilizado) {
		this.creditoUtilizado = creditoUtilizado;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEDeudaVencida [moneda=");
		builder.append(moneda);
		builder.append(", deudaVencida=");
		builder.append(deudaVencida);
		builder.append(", pagoMinimo=");
		builder.append(pagoMinimo);
		builder.append(", pagoTotal=");
		builder.append(pagoTotal);
		builder.append(", creditoUtilizado=");
		builder.append(creditoUtilizado);
		builder.append("]");
		return builder.toString();
	}
	
	
}
