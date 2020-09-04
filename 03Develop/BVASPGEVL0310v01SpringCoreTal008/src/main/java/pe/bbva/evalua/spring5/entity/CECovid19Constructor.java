package pe.bbva.evalua.spring5.entity;

public class CECovid19Constructor {
	private int day;
	private int fallecido;
	private int nacimiento;
	private int contagio;

	public CECovid19Constructor() {
		
	}
	public CECovid19Constructor(int piDay, int piFallecido, int piNacimiento, int piContagio) {
		this.day = piDay;
		this.fallecido = piFallecido;
		this.nacimiento = piNacimiento;
		this.contagio = piContagio;
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