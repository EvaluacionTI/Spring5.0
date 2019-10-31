package pe.etg.bbva.evalua.spring5.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import junit.framework.TestCase;
import pe.etg.bbva.evalua.spring5.controller.CC03RestControllerListadoPersonas;
import pe.etg.bbva.evalua.spring5.entity.CEPersona;

public class CC03RestControllerListadoPersonasTest extends TestCase {
	private static Logger moLog = LogManager.getLogger(CC03RestControllerListadoPersonasTest.class);
	private CC03RestControllerListadoPersonas oCCIndex = new CC03RestControllerListadoPersonas();
	
	public void testListaPersonas() {
		List<CEPersona> oaListaPersonas = new ArrayList<>();
		
		oaListaPersonas.add(new CEPersona(1L, "Alex", "San Luis", 48, true));
		oaListaPersonas.add(new CEPersona(2L, "Esteban", "Zárate", 16, true));
		oaListaPersonas.add(new CEPersona(3L, "Illari", "Chilca", 3, false));
		oaListaPersonas.add(new CEPersona(4L, "Luis", "Chilca", 1, true));
		
		List<CEPersona> oaResultadoListaPersonas = new ArrayList<>();
		oaResultadoListaPersonas = oCCIndex.listadoPersonas();
		moLog.info("=====> Esperado  : " + oaListaPersonas);
		moLog.info("=====> Resultado : " + oaResultadoListaPersonas);
		
		assertNotNull(oaResultadoListaPersonas);
		assertEquals(oaListaPersonas.size(), oaResultadoListaPersonas.size());
		//fail("Not yet implemented");
	}

}
