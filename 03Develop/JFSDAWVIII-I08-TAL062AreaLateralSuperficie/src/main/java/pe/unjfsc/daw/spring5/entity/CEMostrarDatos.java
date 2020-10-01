package pe.unjfsc.daw.spring5.entity;

public class CEMostrarDatos {
	private double valorPI;
	private CEAreaSuperficieLateral oCELsa;
	private CEAreaTotalSuperficie oCETsa;
	private String rotarDerechaIzquierda;
	private String primerUltimoCaracter;
	public double getValorPI() {
		return valorPI;
	}
	public void setValorPI(double valorPI) {
		this.valorPI = valorPI;
	}
	public CEAreaSuperficieLateral getoCELsa() {
		return oCELsa;
	}
	public void setoCELsa(CEAreaSuperficieLateral oCELsa) {
		this.oCELsa = oCELsa;
	}
	public CEAreaTotalSuperficie getoCETsa() {
		return oCETsa;
	}
	public void setoCETsa(CEAreaTotalSuperficie oCETsa) {
		this.oCETsa = oCETsa;
	}
	public String getRotarDerechaIzquierda() {
		return rotarDerechaIzquierda;
	}
	public void setRotarDerechaIzquierda(String rotarDerechaIzquierda) {
		this.rotarDerechaIzquierda = rotarDerechaIzquierda;
	}
	public String getPrimerUltimoCaracter() {
		return primerUltimoCaracter;
	}
	public void setPrimerUltimoCaracter(String primerUltimoCaracter) {
		this.primerUltimoCaracter = primerUltimoCaracter;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEMostrarDatos [valorPI=");
		builder.append(valorPI);
		builder.append(", oCELsa=");
		builder.append(oCELsa);
		builder.append(", oCETsa=");
		builder.append(oCETsa);
		builder.append(", rotarDerechaIzquierda=");
		builder.append(rotarDerechaIzquierda);
		builder.append(", primerUltimoCaracter=");
		builder.append(primerUltimoCaracter);
		builder.append("]");
		return builder.toString();
	}
	
	
}
