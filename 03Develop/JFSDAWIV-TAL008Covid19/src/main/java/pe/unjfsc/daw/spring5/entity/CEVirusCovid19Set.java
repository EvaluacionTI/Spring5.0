package pe.unjfsc.daw.spring5.entity;

public class CEVirusCovid19Set {
	private int dayProyectado;
	private int numeroContagio;
	private int numeroFallecido;
	private int numeroNacidos;
	
	
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


	public void setNumeroContagio(int numeroContagio) {
		this.numeroContagio = numeroContagio;
	}


	public void setNumeroNacidos(int numeroNacidos) {
		this.numeroNacidos = numeroNacidos;
	}
	
}
