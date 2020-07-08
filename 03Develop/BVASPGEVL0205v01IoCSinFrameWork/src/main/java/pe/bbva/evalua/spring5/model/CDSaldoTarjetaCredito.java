package pe.bbva.evalua.spring5.model;

import java.time.LocalDate;
import java.time.LocalTime;

import pe.bbva.evalua.spring5.entity.CECreditoProcesar;
import pe.bbva.evalua.spring5.entity.CEDeudaVencida;
import pe.bbva.evalua.spring5.entity.CESaldoTarjetaCredito;

public class CDSaldoTarjetaCredito {

	public CDSaldoTarjetaCredito() {
		CEDeudaVencida oDeudaVencida = new CEDeudaVencida();
		
		oDeudaVencida.setMoneda("S/");
		oDeudaVencida.setDeudaVencida(1500.00);
		oDeudaVencida.setPagoMinimo(250.00);
		oDeudaVencida.setPagoTotal(650);
		oDeudaVencida.setCreditoUtilizado(100);

		oDeudaVencida.setMoneda("US$");
		oDeudaVencida.setDeudaVencida(1500.00);
		oDeudaVencida.setPagoMinimo(250.00);
		oDeudaVencida.setPagoTotal(650);
		oDeudaVencida.setCreditoUtilizado(100);
		
		CECreditoProcesar oCredito = new CECreditoProcesar();
		oCredito.setMoneda("S/");
		oCredito.setCreditoProcesar(404.08);
		oCredito.setCreditoDisponible(1404.08);
		oCredito.setDisponibleRestiro(1404.08);
		oCredito.setCargoOperacion(5.00);
		
		CESaldoTarjetaCredito oSaldoTarjeta = new CESaldoTarjetaCredito();
		
		// Fecha y hora del sistema
		oSaldoTarjeta.setFechaOperacion(LocalDate.now());
		oSaldoTarjeta.setHoraOperacion(LocalTime.now());
		oSaldoTarjeta.setCajero("1831");
		oSaldoTarjeta.setNumeroOperacion("000000000914");
		oSaldoTarjeta.setNumeroTarjeta("477113******7421");

		oSaldoTarjeta.setoCreditoProcesar(oCredito);
		oSaldoTarjeta.setoDeudaVencida(oDeudaVencida);
	}
}
