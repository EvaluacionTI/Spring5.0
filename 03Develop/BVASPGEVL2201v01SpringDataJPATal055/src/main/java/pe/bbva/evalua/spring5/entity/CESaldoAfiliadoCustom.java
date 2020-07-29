package pe.bbva.evalua.spring5.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AFPt10_saldo_afiliado")
public class CESaldoAfiliadoCustom implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	@Column(name="cod_afiliado")
	public String codigoAfiliado;
	
	@Column(name="saldo_afiliado" )
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
