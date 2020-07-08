package pe.bbva.spring5.entity;

import java.sql.Time;
import java.sql.Date;

public class CESaldoTarjetaCredito {
	private Date fechaOperacion;
	private Time horaOperacion;
	private String cajero;
	private String numeroOperacion;
	private String numeroTarjeta;

	private CEDeudaVencida oDeudaVencida; 
	private CECreditoProcesar oCreditoProcesar;
	public Date getFechaOperacion() {
		return fechaOperacion;
	}
	public void setFechaOperacion(Date fechaOperacion) {
		this.fechaOperacion = fechaOperacion;
	}
	public Time getHoraOperacion() {
		return horaOperacion;
	}
	public void setHoraOperacion(Time horaOperacion) {
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
		StringBuilder builder = new StringBuilder();
		builder.append("CESaldoTarjetaCredito [fechaOperacion=");
		builder.append(fechaOperacion);
		builder.append(", horaOperacion=");
		builder.append(horaOperacion);
		builder.append(", cajero=");
		builder.append(cajero);
		builder.append(", numeroOperacion=");
		builder.append(numeroOperacion);
		builder.append(", numeroTarjeta=");
		builder.append(numeroTarjeta);
		builder.append(", oDeudaVencida=");
		builder.append(oDeudaVencida);
		builder.append(", oCreditoProcesar=");
		builder.append(oCreditoProcesar);
		builder.append("]");
		return builder.toString();
	}
}
