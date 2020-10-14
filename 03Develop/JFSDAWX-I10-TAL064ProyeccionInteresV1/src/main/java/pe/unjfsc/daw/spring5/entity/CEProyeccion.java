package pe.unjfsc.daw.spring5.entity;

public class CEProyeccion {
	private CESaldoAfiliado oCESaldo;
	private CEFormula oCEFormula;
	private double interesCompleto;
	private double interesSinFeriado;
	private double diferenciaInteres;
	private double saldoFinal;
	
	public CESaldoAfiliado getoCESaldo() {
		return oCESaldo;
	}
	public void setoCESaldo(CESaldoAfiliado oCESaldo) {
		this.oCESaldo = oCESaldo;
	}
	public CEFormula getoCEFormula() {
		return oCEFormula;
	}
	public void setoCEFormula(CEFormula oCEFormula) {
		this.oCEFormula = oCEFormula;
	}
	public double getInteresCompleto() {
		return interesCompleto;
	}
	public void setInteresCompleto(double interesCompleto) {
		this.interesCompleto = interesCompleto;
	}
	public double getInteresSinFeriado() {
		return interesSinFeriado;
	}
	public void setInteresSinFeriado(double interesSinFeriado) {
		this.interesSinFeriado = interesSinFeriado;
	}
	public double getDiferenciaInteres() {
		return diferenciaInteres;
	}
	public void setDiferenciaInteres(double diferenciaInteres) {
		this.diferenciaInteres = diferenciaInteres;
	}
	public double getSaldoFinal() {
		return saldoFinal;
	}
	public void setSaldoFinal(double saldoFinal) {
		this.saldoFinal = saldoFinal;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEProyeccion [oCESaldo=");
		builder.append(oCESaldo);
		builder.append(", oCEFormula=");
		builder.append(oCEFormula);
		builder.append(", interesCompleto=");
		builder.append(interesCompleto);
		builder.append(", interesSinFeriado=");
		builder.append(interesSinFeriado);
		builder.append(", diferenciaInteres=");
		builder.append(diferenciaInteres);
		builder.append(", saldoFinal=");
		builder.append(saldoFinal);
		builder.append("]");
		return builder.toString();
	}

}
