package pe.unjfsc.daw.spring5.entity;

public class CEValoresMate {
	private double raizCubica;
	private double coseno;
	private double valorMasGrande;
	private double logNatural;
	private double seno;
	private double raizCuadrada;
	private double tangente;
	private double logBase10;
	private double valorMasPequeno;
	private double valorMasCercano;
	public double getRaizCubica() {
		return raizCubica;
	}
	public void setRaizCubica(double raizCubica) {
		this.raizCubica = raizCubica;
	}
	public double getCoseno() {
		return coseno;
	}
	public void setCoseno(double coseno) {
		this.coseno = coseno;
	}
	public double getValorMasGrande() {
		return valorMasGrande;
	}
	public void setValorMasGrande(double valorMasGrande) {
		this.valorMasGrande = valorMasGrande;
	}
	public double getLogNatural() {
		return logNatural;
	}
	public void setLogNatural(double logNatural) {
		this.logNatural = logNatural;
	}
	public double getSeno() {
		return seno;
	}
	public void setSeno(double seno) {
		this.seno = seno;
	}
	public double getRaizCuadrada() {
		return raizCuadrada;
	}
	public void setRaizCuadrada(double raizCuadrada) {
		this.raizCuadrada = raizCuadrada;
	}
	public double getTangente() {
		return tangente;
	}
	public void setTangente(double tangente) {
		this.tangente = tangente;
	}
	public double getLogBase10() {
		return logBase10;
	}
	public void setLogBase10(double logBase10) {
		this.logBase10 = logBase10;
	}
	public double getValorMasPequeno() {
		return valorMasPequeno;
	}
	public void setValorMasPequeno(double valorMasPequeno) {
		this.valorMasPequeno = valorMasPequeno;
	}
	public double getValorMasCercano() {
		return valorMasCercano;
	}
	public void setValorMasCercano(double valorMasCercano) {
		this.valorMasCercano = valorMasCercano;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEValoresMate [raizCubica=");
		builder.append(raizCubica);
		builder.append(", coseno=");
		builder.append(coseno);
		builder.append(", valorMasGrande=");
		builder.append(valorMasGrande);
		builder.append(", logNatural=");
		builder.append(logNatural);
		builder.append(", seno=");
		builder.append(seno);
		builder.append(", raizCuadrada=");
		builder.append(raizCuadrada);
		builder.append(", tangente=");
		builder.append(tangente);
		builder.append(", logBase10=");
		builder.append(logBase10);
		builder.append(", valorMasPequeno=");
		builder.append(valorMasPequeno);
		builder.append(", valorMasCercano=");
		builder.append(valorMasCercano);
		builder.append("]");
		return builder.toString();
	}
	
}
