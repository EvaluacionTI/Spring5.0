package pe.unjfsc.daw.spring5.entity;

public class CETotales {
	private CEMoneda oMoneda;
	private double operacionGratuita;
	private double operacionExonerada;
	private double operacionInafecta;
	private double operacionGravada;
	private double descuento;
	private double Impuesto;
	private double totalPagar;
	
	public CEMoneda getoMoneda() {
		return oMoneda;
	}
	public void setoMoneda(CEMoneda oMoneda) {
		this.oMoneda = oMoneda;
	}
	public double getOperacionGratuita() {
		return operacionGratuita;
	}
	public void setOperacionGratuita(double operacionGratuita) {
		this.operacionGratuita = operacionGratuita;
	}
	public double getOperacionExonerada() {
		return operacionExonerada;
	}
	public void setOperacionExonerada(double operacionExonerada) {
		this.operacionExonerada = operacionExonerada;
	}
	public double getOperacionInafecta() {
		return operacionInafecta;
	}
	public void setOperacionInafecta(double operacionInafecta) {
		this.operacionInafecta = operacionInafecta;
	}
	public double getOperacionGravada() {
		return operacionGravada;
	}
	public void setOperacionGravada(double operacionGravada) {
		this.operacionGravada = operacionGravada;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public double getImpuesto() {
		return Impuesto;
	}
	public void setImpuesto(double impuesto) {
		Impuesto = impuesto;
	}
	public double getTotalPagar() {
		return totalPagar;
	}
	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CETotales [oMoneda=");
		builder.append(oMoneda);
		builder.append(", operacionGratuita=");
		builder.append(operacionGratuita);
		builder.append(", operacionExonerada=");
		builder.append(operacionExonerada);
		builder.append(", operacionInafecta=");
		builder.append(operacionInafecta);
		builder.append(", operacionGravada=");
		builder.append(operacionGravada);
		builder.append(", descuento=");
		builder.append(descuento);
		builder.append(", Impuesto=");
		builder.append(Impuesto);
		builder.append(", totalPagar=");
		builder.append(totalPagar);
		builder.append("]");
		return builder.toString();
	}

}
