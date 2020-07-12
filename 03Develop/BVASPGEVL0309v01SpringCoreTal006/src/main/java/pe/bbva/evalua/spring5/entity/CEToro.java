package pe.bbva.evalua.spring5.entity;

import java.time.LocalDate;

public class CEToro {
	private String codigo;
	private String nombre;
	private String alias;
	private LocalDate fechaNacimiento;

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEToro [codigo=");
		builder.append(codigo);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", alias=");
		builder.append(alias);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append("]");
		return builder.toString();
	}
}
