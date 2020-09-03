package pe.unjfsc.daw.spring5.entity;

public class CEDatoEmision {
	private String fechaEmision;
	private String horaEmision;
	private String serieNumeroDocumento;
	
	public String getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public String getHoraEmision() {
		return horaEmision;
	}
	public void setHoraEmision(String horaEmision) {
		this.horaEmision = horaEmision;
	}
	public String getSerieNumeroDocumento() {
		return serieNumeroDocumento;
	}
	public void setSerieNumeroDocumento(String serieNumeroDocumento) {
		this.serieNumeroDocumento = serieNumeroDocumento;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEDatoEmision [fechaEmision=");
		builder.append(fechaEmision);
		builder.append(", horaEmision=");
		builder.append(horaEmision);
		builder.append(", serieNumeroDocumento=");
		builder.append(serieNumeroDocumento);
		builder.append("]");
		return builder.toString();
	}

}
