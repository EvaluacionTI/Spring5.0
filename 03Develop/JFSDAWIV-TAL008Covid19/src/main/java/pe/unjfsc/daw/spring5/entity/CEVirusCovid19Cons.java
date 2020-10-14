package pe.unjfsc.daw.spring5.entity;

public class CEVirusCovid19Cons {
	private int dayProyectado;
	private int numeroContagio;
	private int numeroFallecido;
	private int numeroNacidos;
	
	private CEVirusCovid19Cons(int pDayProyectado, int pNumeroContagio, int pNumeroFallecido, int pNumeroNacidos) {
		this.dayProyectado = pDayProyectado;
		this.numeroContagio = pNumeroContagio;
		this.numeroFallecido = pNumeroFallecido;
		this.numeroNacidos = pNumeroNacidos;
	}
	
	private CEVirusCovid19Cons(int pDayProyectado, int pNumeroContagio, int pNumeroFallecido) {
		this.dayProyectado = pDayProyectado;
		this.numeroContagio = pNumeroContagio;
		this.numeroFallecido = pNumeroFallecido;
	}
	
	private CEVirusCovid19Cons(int pDayProyectado, int pNumeroContagio) {
		this.dayProyectado = pDayProyectado;
		this.numeroContagio = pNumeroContagio;
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
