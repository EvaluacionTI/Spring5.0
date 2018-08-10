package etg.bbva.controladora;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import junit.framework.TestCase;

public class CC02RestControllerIniciarModeloTest extends TestCase{
	private static Logger moLog = LogManager.getLogger(CC02RestControllerIniciarModeloTest.class);
	private CC02RestControlerIniciarModelo oCCIndex = new CC02RestControlerIniciarModelo();
	
	public void testIndex() {
		String sEsperado = "Se inicio el Controlador de la Arquitectura Host";
		String sResultado = oCCIndex.mostrarInicio();
		
		moLog.info("=====> Esperado  : " + sEsperado);
		moLog.info("=====> Resultado : " + sResultado);
		assertEquals(sEsperado, sResultado);
	}
}
