package pe.unjfsc.daw.spring5.entity;

public class CEFormula {
	private double tasa;
	private double plazo;
	private double factor;
	
	public double getTasa() {
		return tasa;
	}
	public void setTasa(double tasa) {
		this.tasa = tasa;
	}
	public double getPlazo() {
		return plazo;
	}
	public void setPlazo(double plazo) {
		this.plazo = plazo;
	}
	public double getFactor() {
		return factor;
	}
	public void setFactor(double factor) {
		this.factor = factor;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEFormula [tasa=");
		builder.append(tasa);
		builder.append(", plazo=");
		builder.append(plazo);
		builder.append(", factor=");
		builder.append(factor);
		builder.append("]");
		return builder.toString();
	}
	
}
