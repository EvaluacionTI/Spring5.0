package pe.bbva.evalua.spring5.entity;

import org.springframework.stereotype.Component;

@Component
public class CESaldoAfiliadoCustom {
	public int id;
	public String codigoAfiliado;
	public double saldoCIC;

	public CESaldoAfiliadoCustom() {}
	
	public CESaldoAfiliadoCustom(int piId, String psCodigoAfiliado, double pdSaldoCIC) {
		super();
		this.id = piId;
		this.codigoAfiliado = psCodigoAfiliado;
		this.saldoCIC = pdSaldoCIC;
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
		builder.append("CESaldoAfiliadoCustom [id=");
		builder.append(id);
		builder.append(", codigoAfiliado=");
		builder.append(codigoAfiliado);
		builder.append(", saldoCIC=");
		builder.append(saldoCIC);
		builder.append("]");
		return builder.toString();
	}
}
