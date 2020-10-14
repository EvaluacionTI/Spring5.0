package pe.unjfsc.daw.spring5.entity;

public class CEPeriodo {
	
	private int mes;
	private String nombre;

	public CEPeriodo(int pMes) {
		this.mes = pMes;
	}

	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEPeriodo [mes=");
		builder.append(mes);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}
}
