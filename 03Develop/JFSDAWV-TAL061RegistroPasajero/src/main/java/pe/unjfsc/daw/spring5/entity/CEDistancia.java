package pe.unjfsc.daw.spring5.entity;

public class CEDistancia {
	private double distanciaOrigen;
	private double distanciaDestino;
	public double getDistanciaOrigen() {
		return distanciaOrigen;
	}
	public void setDistanciaOrigen(double distanciaOrigen) {
		this.distanciaOrigen = distanciaOrigen;
	}
	public double getDistanciaDestino() {
		return distanciaDestino;
	}
	public void setDistanciaDestino(double distanciaDestino) {
		this.distanciaDestino = distanciaDestino;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEDistancia [distanciaOrigen=");
		builder.append(distanciaOrigen);
		builder.append(", distanciaDestino=");
		builder.append(distanciaDestino);
		builder.append("]");
		return builder.toString();
	}
	
}
