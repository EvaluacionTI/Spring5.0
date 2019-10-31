package pe.unjfsc.daw.spring5.entity;

public class CECompraEntrada {
	private int id;
	private String producto;
	private double precio;
	private double cantidad;
	private String fechaCompra;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public String getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	@Override
	public String toString() {
		return "CECompraEntrada [id=" + id + ", producto=" + producto + ", precio=" + precio + ", cantidad=" + cantidad
				+ ", fechaCompra=" + fechaCompra + "]";
	}
}
