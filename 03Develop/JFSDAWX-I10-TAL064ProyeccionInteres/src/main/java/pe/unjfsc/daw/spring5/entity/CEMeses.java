package pe.unjfsc.daw.spring5.entity;

public class CEMeses {
	private int idMes;
	private String nombreMes;
	private int numeroDiasMes;
	private int cantidadFeriado;
	private double tasaInteres;
	
	public CEMeses() {
		
	}
	
	public CEMeses(int pidMes, String pnombreMes, int pnumeroDiasMes, int pcantidadFeriado, double ptasaInteres) {
		this.idMes = pidMes;
		this.nombreMes = pnombreMes;
		this.numeroDiasMes = pnumeroDiasMes;
		this.cantidadFeriado = pcantidadFeriado;
		this.tasaInteres = ptasaInteres;
	}
	
	public int getIdMes() {
		return idMes;
	}
	public void setIdMes(int idMes) {
		this.idMes = idMes;
	}
	public String getNombreMes() {
		return nombreMes;
	}
	public void setNombreMes(String nombreMes) {
		this.nombreMes = nombreMes;
	}
	public int getNumeroDiasMes() {
		return numeroDiasMes;
	}
	public void setNumeroDiasMes(int numeroDiasMes) {
		this.numeroDiasMes = numeroDiasMes;
	}
	public int getCantidadFeriado() {
		return cantidadFeriado;
	}
	public void setCantidadFeriado(int cantidadFeriado) {
		this.cantidadFeriado = cantidadFeriado;
	}
	public double getTasaInteres() {
		return tasaInteres;
	}
	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEMeses [idMes=");
		builder.append(idMes);
		builder.append(", nombreMes=");
		builder.append(nombreMes);
		builder.append(", numeroDiasMes=");
		builder.append(numeroDiasMes);
		builder.append(", cantidadFeriado=");
		builder.append(cantidadFeriado);
		builder.append(", tasaInteres=");
		builder.append(tasaInteres);
		builder.append("]");
		return builder.toString();
	}
	
}
