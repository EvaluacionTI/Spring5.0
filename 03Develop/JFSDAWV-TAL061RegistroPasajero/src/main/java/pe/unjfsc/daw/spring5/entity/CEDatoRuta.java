package pe.unjfsc.daw.spring5.entity;

public class CEDatoRuta {
	private String origen;
	private String destino;
	private String fechaViaje;
	private String horaViaje;
	private int numeroAsiento;
	private String embarque;
	private String desembarque;
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getFechaViaje() {
		return fechaViaje;
	}
	public void setFechaViaje(String fechaViaje) {
		this.fechaViaje = fechaViaje;
	}
	public String getHoraViaje() {
		return horaViaje;
	}
	public void setHoraViaje(String horaViaje) {
		this.horaViaje = horaViaje;
	}
	public int getNumeroAsiento() {
		return numeroAsiento;
	}
	public void setNumeroAsiento(int numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}
	public String getEmbarque() {
		return embarque;
	}
	public void setEmbarque(String embarque) {
		this.embarque = embarque;
	}
	public String getDesembarque() {
		return desembarque;
	}
	public void setDesembarque(String desembarque) {
		this.desembarque = desembarque;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEDatoRuta [origen=");
		builder.append(origen);
		builder.append(", destino=");
		builder.append(destino);
		builder.append(", fechaViaje=");
		builder.append(fechaViaje);
		builder.append(", horaViaje=");
		builder.append(horaViaje);
		builder.append(", numeroAsiento=");
		builder.append(numeroAsiento);
		builder.append(", embarque=");
		builder.append(embarque);
		builder.append(", desembarque=");
		builder.append(desembarque);
		builder.append("]");
		return builder.toString();
	}

}
