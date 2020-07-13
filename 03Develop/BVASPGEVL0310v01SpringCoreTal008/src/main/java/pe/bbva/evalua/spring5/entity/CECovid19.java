package pe.bbva.evalua.spring5.entity;

public class CECovid19 {
	private int day;
	private int fallecido;
	private int nacimiento;
	private int contagio;

	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getFallecido() {
		return fallecido;
	}
	public void setFallecido(int fallecido) {
		this.fallecido = fallecido;
	}
	public int getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(int nacimiento) {
		this.nacimiento = nacimiento;
	}
	public int getContagio() {
		return contagio;
	}
	public void setContagio(int contagio) {
		this.contagio = contagio;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CECovid19 [day=");
		builder.append(day);
		builder.append(", fallecido=");
		builder.append(fallecido);
		builder.append(", nacimiento=");
		builder.append(nacimiento);
		builder.append(", contagio=");
		builder.append(contagio);
		builder.append("]");
		return builder.toString();
	}
}