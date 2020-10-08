package pe.unjfsc.daw.spring5.entity;

public class CEProyeccion {
	private CESaldoAfiliado oCESaldo;
	private double interesCompleto;
	private double interesSinFeriado;
	private double diferenciaInteres;
	private double SaldoFinal;
	
	public CESaldoAfiliado getoCESaldo() {
		return oCESaldo;
	}
	public void setoCESaldo(CESaldoAfiliado oCESaldo) {
		this.oCESaldo = oCESaldo;
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
		return SaldoFinal;
	}
	public void setSaldoFinal(double saldoFinal) {
		SaldoFinal = saldoFinal;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEProyeccion [oCESaldo=");
		builder.append(oCESaldo);
		builder.append(", interesCompleto=");
		builder.append(interesCompleto);
		builder.append(", interesSinFeriado=");
		builder.append(interesSinFeriado);
		builder.append(", diferenciaInteres=");
		builder.append(diferenciaInteres);
		builder.append(", SaldoFinal=");
		builder.append(SaldoFinal);
		builder.append("]");
		return builder.toString();
	}

}
