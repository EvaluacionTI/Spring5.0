package pe.unjfsc.daw.spring5.entity;

public class CEOrdenar {
	private int mayor;
	private int medio;
	private int menor;
	public int getMayor() {
		return mayor;
	}
	public void setMayor(int mayor) {
		this.mayor = mayor;
	}
	public int getMedio() {
		return medio;
	}
	public void setMedio(int medio) {
		this.medio = medio;
	}
	public int getMenor() {
		return menor;
	}
	public void setMenor(int menor) {
		this.menor = menor;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEOrdenar [mayor=");
		builder.append(mayor);
		builder.append(", medio=");
		builder.append(medio);
		builder.append(", menor=");
		builder.append(menor);
		builder.append("]");
		return builder.toString();
	}
}
