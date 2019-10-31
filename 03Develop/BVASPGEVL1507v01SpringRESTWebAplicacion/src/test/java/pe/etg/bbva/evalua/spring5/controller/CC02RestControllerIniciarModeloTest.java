package pe.etg.bbva.evalua.spring5.controller;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;


public class CC02RestControllerIniciarModeloTest{
	private static Logger moLog = LogManager.getLogger(CC02RestControllerIniciarModeloTest.class);
	private CC02RestControlerIniciarModelo oCCIndex = new CC02RestControlerIniciarModelo();
	
	@Test
	public void testIndex() {
		String sEsperado = "Se inicio el Controlador de la Arquitectura Host";
		String sResultado = oCCIndex.mostrarInicio();
		
		moLog.info("[EVL] Esperado  : " + sEsperado);
		moLog.info("[EVL] Resultado : " + sResultado);
		assertEquals(sEsperado, sResultado);
	}
}
