package com.bbva.qwpu.dto.contabilidad;

public class DTOPlanContable {
	private String codigoCuenta;
	private String nameCuenta;

	public String getCodigoCuenta() {
		return codigoCuenta;
	}

	public void setCodigoCuenta(String codigoCuenta) {
		this.codigoCuenta = codigoCuenta;
	}

	public String getNameCuenta() {
		return nameCuenta;
	}

	public void setNameCuenta(String nameCuenta) {
		this.nameCuenta = nameCuenta;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("DTOPlanContable{");
		sb.append("codigoCuenta='").append(codigoCuenta).append('\'');
		sb.append(", nameCuenta='").append(nameCuenta).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
