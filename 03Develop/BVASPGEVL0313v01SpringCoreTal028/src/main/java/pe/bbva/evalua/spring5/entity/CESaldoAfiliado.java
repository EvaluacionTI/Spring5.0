package pe.bbva.evalua.spring5.entity;

public class CESaldoAfiliado {
	public int id;
	public String codigoAfiliado;
	public double saldoCIC;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigoAfiliado() {
		return codigoAfiliado;
	}
	public void setCodigoAfiliado(String codigoAfiliado) {
		this.codigoAfiliado = codigoAfiliado;
	}
	public double getSaldoCIC() {
		return saldoCIC;
	}
	public void setSaldoCIC(double saldoCIC) {
		this.saldoCIC = saldoCIC;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CESaldoAfiliado [id=");
		builder.append(id);
		builder.append(", codigoAfiliado=");
		builder.append(codigoAfiliado);
		builder.append(", saldoCIC=");
		builder.append(saldoCIC);
		builder.append("]");
		return builder.toString();
	}
}
