package pe.unjfsc.daw.spring5.entity;

public class CEGasto {
	private double baseImponible;
	private double impuesto;
	private double totalGasto;

	public double getBaseImponible() {
		return baseImponible;
	}
	public void setBaseImponible(double baseImponible) {
		this.baseImponible = baseImponible;
	}
	public double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	public double getTotalGasto() {
		return totalGasto;
	}
	public void setTotalGasto(double totalGasto) {
		this.totalGasto = totalGasto;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEGasto [baseImponible=");
		builder.append(baseImponible);
		builder.append(", impuesto=");
		builder.append(impuesto);
		builder.append(", totalGasto=");
		builder.append(totalGasto);
		builder.append("]");
		return builder.toString();
	}
	
}
