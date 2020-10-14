package pe.unjfsc.daw.spring5.logical;

public interface CIProducto {
	public double calcularDescuento(double pVentaTotal);
	public double calcularVentaTotal(double pVentaTotal, double pDescuento);
}
