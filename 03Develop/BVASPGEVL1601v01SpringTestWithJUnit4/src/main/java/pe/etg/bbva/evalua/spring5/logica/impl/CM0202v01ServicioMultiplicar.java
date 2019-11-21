package pe.etg.bbva.evalua.spring5.logica.impl;

import pe.etg.bbva.evalua.spring5.logica.CI0201v01ServicioSumar;
import pe.etg.bbva.evalua.spring5.logica.CI0202v01ServicioMultiplica;

public class CM0202v01ServicioMultiplicar implements CI0202v01ServicioMultiplica {
	private  CI0201v01ServicioSumar serviceA;
	
	public CI0201v01ServicioSumar getServiceA() {

		return serviceA;
	}

	public void setServiceA(CI0201v01ServicioSumar servicioSumar) {
		
		this.serviceA = servicioSumar;
	}

	public int multiplicarSumar(int a, int b, int multiplicador) {
		
		return serviceA.sumarEnteros(a, b)*multiplicador;
	}

	public int multiplicar(int a, int b) {

		return (a*b);
	}

}
