package pe.bbva.spring.entity;

public class CECompraDTOSalida {
	private int id;
	private String producto;
	private double total;
	private int numeroDiasTranscurrido;
	
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
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getNumeroDiasTranscurrido() {
		return numeroDiasTranscurrido;
	}
	public void setNumeroDiasTranscurrido(int numeroDiasTranscurrido) {
		this.numeroDiasTranscurrido = numeroDiasTranscurrido;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CECompraDTOSalida [id=");
		builder.append(id);
		builder.append(", producto=");
		builder.append(producto);
		builder.append(", total=");
		builder.append(total);
		builder.append(", numeroDiasTranscurrido=");
		builder.append(numeroDiasTranscurrido);
		builder.append("]");
		return builder.toString();
	}

}
