package pe.bbva.evalua.spring5.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class CESaldoTarjetaCredito implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LocalDate fechaOperacion;
	private LocalTime horaOperacion;
	private String cajero;
	private String numeroOperacion;
	private String numeroTarjeta;

	private CEDeudaVencida oDeudaVencida; 
	private CECreditoProcesar oCreditoProcesar;
	public LocalDate getFechaOperacion() {
		return fechaOperacion;
	}
	public void setFechaOperacion(LocalDate fechaOperacion) {
		this.fechaOperacion = fechaOperacion;
	}
	public LocalTime getHoraOperacion() {
		return horaOperacion;
	}
	public void setHoraOperacion(LocalTime horaOperacion) {
		this.horaOperacion = horaOperacion;
	}
	public String getCajero() {
		return cajero;
	}
	public void setCajero(String cajero) {
		this.cajero = cajero;
	}
	public String getNumeroOperacion() {
		return numeroOperacion;
	}
	public void setNumeroOperacion(String numeroOperacion) {
		this.numeroOperacion = numeroOperacion;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public CEDeudaVencida getoDeudaVencida() {
		return oDeudaVencida;
	}
	public void setoDeudaVencida(CEDeudaVencida oDeudaVencida) {
		this.oDeudaVencida = oDeudaVencida;
	}
	public CECreditoProcesar getoCreditoProcesar() {
		return oCreditoProcesar;
	}
	public void setoCreditoProcesar(CECreditoProcesar oCreditoProcesar) {
		this.oCreditoProcesar = oCreditoProcesar;
	}
	@Override
	public String toString() {
		return "CESaldoTarjetaCredito [fechaOperacion=" + fechaOperacion + ", horaOperacion=" + horaOperacion
				+ ", cajero=" + cajero + ", numeroOperacion=" + numeroOperacion + ", numeroTarjeta=" + numeroTarjeta
				+ ", oDeudaVencida=" + oDeudaVencida + ", oCreditoProcesar=" + oCreditoProcesar + "]";
	}
	
}
