package pe.unjfsc.daw.spring5.entity;

public class CEVirusCovid19 {
	private int dayProyectado;
	private int numeroContagio;
	private int numeroFallecido;
	private int numeroNacidos;
	
	public int getDayProyectado() {
		return dayProyectado;
	}
	public void setDayProyectado(int dayProyectado) {
		this.dayProyectado = dayProyectado;
	}
	public int getNumeroContagio() {
		return numeroContagio;
	}
	public void setNumeroContagio(int numeroContagio) {
		this.numeroContagio = numeroContagio;
	}
	public int getNumeroFallecido() {
		return numeroFallecido;
	}
	public void setNumeroFallecido(int numeroFallecido) {
		this.numeroFallecido = numeroFallecido;
	}
	public int getNumeroNacidos() {
		return numeroNacidos;
	}
	public void setNumeroNacidos(int numeroNacidos) {
		this.numeroNacidos = numeroNacidos;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEVirusCovid19 [dayProyectado=");
		builder.append(dayProyectado);
		builder.append(", numeroContagio=");
		builder.append(numeroContagio);
		builder.append(", numeroFallecido=");
		builder.append(numeroFallecido);
		builder.append(", numeroNacidos=");
		builder.append(numeroNacidos);
		builder.append("]");
		return builder.toString();
	}
	
}
