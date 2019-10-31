package pe.bbva.architect.entity;

import java.io.Serializable;

public class CE01Producto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idProducto;
	private String descripcion;

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public int getIdProducto() {
		return idProducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CE01Producto [idProducto=");
		builder.append(idProducto);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append("]");
		return builder.toString();
	}

}
