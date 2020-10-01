package pe.unjfsc.daw.spring5.entity;

public class CEAreaSuperficieLateral {
	private double radio;
	private double altura;
	private double lsa;
	private double diametro;
	
	private String radioLetra;
	private String diametroLetra;
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLsa() {
		return lsa;
	}
	public void setLsa(double lsa) {
		this.lsa = lsa;
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public String getRadioLetra() {
		return radioLetra;
	}
	public void setRadioLetra(String radioLetra) {
		this.radioLetra = radioLetra;
	}
	public String getDiametroLetra() {
		return diametroLetra;
	}
	public void setDiametroLetra(String diametroLetra) {
		this.diametroLetra = diametroLetra;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEAreaSuperficieLateral [radio=");
		builder.append(radio);
		builder.append(", altura=");
		builder.append(altura);
		builder.append(", lsa=");
		builder.append(lsa);
		builder.append(", diametro=");
		builder.append(diametro);
		builder.append(", radioLetra=");
		builder.append(radioLetra);
		builder.append(", diametroLetra=");
		builder.append(diametroLetra);
		builder.append("]");
		return builder.toString();
	}
	
}
