package pe.unjfsc.daw.spring5.entity;

public class CEFormula {
	private double tasa;
	private double plazo;
	private double factor;
	private double plazoSinFeriado;
	private double factorSinFeriado;
	
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
	public double getPlazoSinFeriado() {
		return plazoSinFeriado;
	}
	public void setPlazoSinFeriado(double plazoSinFeriado) {
		this.plazoSinFeriado = plazoSinFeriado;
	}
	public double getFactorSinFeriado() {
		return factorSinFeriado;
	}
	public void setFactorSinFeriado(double factorSinFeriado) {
		this.factorSinFeriado = factorSinFeriado;
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
		builder.append(", plazoSinFeriado=");
		builder.append(plazoSinFeriado);
		builder.append(", factorSinFeriado=");
		builder.append(factorSinFeriado);
		builder.append("]");
		return builder.toString();
	}
}
