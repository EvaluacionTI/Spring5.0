package pe.unjfsc.daw.spring5.entity;

public class CESaldoAfiliadoEntrada {
	private String codigo;
	private String codigoAfiliado;
	private double saldoCIC;
	public CESaldoAfiliadoEntrada() {}
	
	public CESaldoAfiliadoEntrada(String pCodigo, String pAfiliado, double pSaldo) {
		this.codigo = pCodigo;
		this.codigoAfiliado = pAfiliado;
		this.saldoCIC = pSaldo;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
		builder.append("CESaldoAfiliadoEntrada [codigo=");
		builder.append(codigo);
		builder.append(", codigoAfiliado=");
		builder.append(codigoAfiliado);
		builder.append(", saldoCIC=");
		builder.append(saldoCIC);
		builder.append("]");
		return builder.toString();
	}

}
