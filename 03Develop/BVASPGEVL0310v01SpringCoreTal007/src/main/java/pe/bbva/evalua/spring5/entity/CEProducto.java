package pe.bbva.evalua.spring5.entity;

public class CEProducto extends CEEntity {

	private String nombre;
	private double precioVenta;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEProducto [nombre=");
		builder.append(nombre);
		builder.append(", precioVenta=");
		builder.append(precioVenta);
		builder.append("]");
		return builder.toString();
	}
	
}
