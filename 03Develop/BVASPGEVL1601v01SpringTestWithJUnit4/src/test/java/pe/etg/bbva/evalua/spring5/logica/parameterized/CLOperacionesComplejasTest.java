package pe.etg.bbva.evalua.spring5.logica.parameterized;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.etg.bbva.evalua.spring5.logica.CLOperacionesComplejas;

@RunWith(Parameterized.class)
public class CLOperacionesComplejasTest {
	private static Logger MOLOG = LoggerFactory.getLogger(CLOperacionesComplejasTest.class);
    private int fInput;
    private int fExpected;
    private CLOperacionesComplejas oCLOperaciones;
    
    public CLOperacionesComplejasTest(int input, int expected) {
        this.fInput = input;
        this.fExpected = expected;
    }

	@Before
	public void initialize() {
		MOLOG.info("=====> Start method : initialize() <===== ");
		
		oCLOperaciones = new CLOperacionesComplejas();

		MOLOG.info("=> Instancia generada : {} ", oCLOperaciones );
		MOLOG.info("=====> End method : initialize() <=====");
	}    

	@Parameters
	public static Collection<Object[]> inputData() {
		return Arrays.asList(new Object[][] {
			{ 0, 1 }, { 1, 1 }, { 2, 2 }, { 3, 6 }, { 4, 24 }, { 5, 120 }, { 6, 720 }
		});
	}
	

    @Test
    public void testFactorialEntero() {
    	MOLOG.info("=====> Start method : testSumaDosNumeros() <=====");
		
		MOLOG.info("=> Factorial de : {} = {}", fInput, fExpected );
		MOLOG.info("Resultado = {} ", oCLOperaciones.factorialEntero(fInput));
		assertEquals(fExpected, oCLOperaciones.factorialEntero(fInput));
		MOLOG.info("=====> End method : testSumaDosNumeros() <=====");
		
    }

}
