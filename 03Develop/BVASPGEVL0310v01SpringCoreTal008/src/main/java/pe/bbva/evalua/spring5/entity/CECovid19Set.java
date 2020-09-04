package pe.bbva.evalua.spring5.entity;

public class CECovid19Set {
	private int day;
	private int fallecido;
	private int nacimiento;
	private int contagio;

	public void setDay(int day) {
		this.day = day;
	}

	public void setFallecido(int fallecido) {
		this.fallecido = fallecido;
	}

	public void setNacimiento(int nacimiento) {
		this.nacimiento = nacimiento;
	}

	public void setContagio(int contagio) {
		this.contagio = contagio;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CECovid19.java [day=");
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