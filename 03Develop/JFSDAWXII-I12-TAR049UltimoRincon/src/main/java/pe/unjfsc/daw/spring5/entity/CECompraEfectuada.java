package pe.unjfsc.daw.spring5.entity;

public class CECompraEfectuada {
	private String codigoCliente;
	private String fechaCompra;
	private int idProducto;
	private int cantidad;
	private double precioVenta;
	private double totalVenta;
	
	public CECompraEfectuada() {}

	public CECompraEfectuada(String codigoCliente, String fechaCompra, int idProducto, int cantidad, double precioVenta) {
		super();
		this.codigoCliente = codigoCliente;
		this.idProducto = idProducto;
		this.fechaCompra = fechaCompra;
		this.cantidad = cantidad;
		this.precioVenta = precioVenta;
	}
	
	public CECompraEfectuada(String codigoCliente, String fechaCompra, int idProducto, int cantidad, double precioVenta,
			double totalVenta) {
		super();
		this.codigoCliente = codigoCliente;
		this.idProducto = idProducto;
		this.fechaCompra = fechaCompra;
		this.cantidad = cantidad;
		this.precioVenta = precioVenta;
		this.totalVenta = totalVenta;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public double getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(double totalVenta) {
		this.totalVenta = totalVenta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CECompraEfectuada [codigoCliente=");
		builder.append(codigoCliente);
		builder.append(", idProducto=");
		builder.append(idProducto);
		builder.append(", fechaCompra=");
		builder.append(fechaCompra);
		builder.append(", cantidad=");
		builder.append(cantidad);
		builder.append(", precioVenta=");
		builder.append(precioVenta);
		builder.append(", totalVenta=");
		builder.append(totalVenta);
		builder.append("]");
		return builder.toString();
	}
}
