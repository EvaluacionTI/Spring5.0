package etg.bbva.controladora;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import junit.framework.TestCase;

public class CC01RestControllerIndexTest extends TestCase{
	private static Logger moLog = LogManager.getLogger(CC01RestControllerIndexTest.class);
	private CC01RestControllerIndex oCCIndex = new CC01RestControllerIndex();
	
	public void testIndex() {
		String sEsperado = "index";
		String sResultado = oCCIndex.indexPage();
		
		moLog.info("=====> Esperado  : " + sEsperado);
		moLog.info("=====> Resultado : " + sResultado);
		assertEquals(sEsperado, sResultado);
	}
}
