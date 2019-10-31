package pe.etg.bbva.evalua.spring5.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import junit.framework.TestCase;
import pe.etg.bbva.evalua.spring5.controller.CC01RestControllerIndex;

public class CC01RestControllerIndexTest extends TestCase{
	private static Logger moLog = LogManager.getLogger(CC01RestControllerIndexTest.class);
	private CC01RestControllerIndex oCCIndex = new CC01RestControllerIndex();
	
	public void testIndex() {
		String sEsperado = "index";
		String sResultado = oCCIndex.indexPage();
		
		moLog.info("[EVL] Esperado  : " + sEsperado);
		moLog.info("[EVL] Resultado : " + sResultado);
		assertEquals(sEsperado, sResultado);
	}
}
