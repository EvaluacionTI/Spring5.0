package pe.etg.bbva.evalua.spring5.logica.impl;

import org.junit.Assert;
import org.junit.Test;

import pe.etg.bbva.evalua.spring5.logica.CI0201v01ServicioSumar;

public class CM0201v01ServicioSumarTest {
	private int a, b;

	@Test
	public void testSumarEnteros() {

		a = 5;
		b = 22;

		CI0201v01ServicioSumar oSumar = new CM0201v01ServicioSumar();
		Assert.assertEquals(oSumar.sumarEnteros(5, 22), 27);
	}
}
