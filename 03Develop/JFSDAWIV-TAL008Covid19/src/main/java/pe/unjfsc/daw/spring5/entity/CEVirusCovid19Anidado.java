package pe.unjfsc.daw.spring5.entity;

public class CEVirusCovid19Anidado {
	
	private int dayProyectado;
	private int numeroContagio;
	private int numeroFallecido;
	private int numeroNacidos;
	private CEPeriodo oPeriodo;
	
	public void setDayProyectado(int dayProyectado) {
		this.dayProyectado = dayProyectado;
	}
	public void setNumeroContagio(int numeroContagio) {
		this.numeroContagio = numeroContagio;
	}
	public void setNumeroFallecido(int numeroFallecido) {
		this.numeroFallecido = numeroFallecido;
	}
	public void setNumeroNacidos(int numeroNacidos) {
		this.numeroNacidos = numeroNacidos;
	}
	public void setoPeriodo(CEPeriodo oPeriodo) {
		this.oPeriodo = oPeriodo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEVirusCovid19Anidado [dayProyectado=");
		builder.append(dayProyectado);
		builder.append(", numeroContagio=");
		builder.append(numeroContagio);
		builder.append(", numeroFallecido=");
		builder.append(numeroFallecido);
		builder.append(", numeroNacidos=");
		builder.append(numeroNacidos);
		builder.append(", oPeriodo=");
		builder.append(oPeriodo);
		builder.append("]");
		return builder.toString();
	}
	
}
