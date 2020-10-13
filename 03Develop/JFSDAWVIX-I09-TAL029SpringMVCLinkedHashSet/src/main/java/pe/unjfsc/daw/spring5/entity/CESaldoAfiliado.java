package pe.unjfsc.daw.spring5.entity;

public class CESaldoAfiliado {
	private int id;
	private String codigoAfiliado;
	private double saldoCIC;
	
	public CESaldoAfiliado() {}
	
	public CESaldoAfiliado(int pid, String psCodigo, double pSaldoCIC) {
		this.id = pid;
		this.codigoAfiliado = psCodigo;
		this.saldoCIC = pid;
	}
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
