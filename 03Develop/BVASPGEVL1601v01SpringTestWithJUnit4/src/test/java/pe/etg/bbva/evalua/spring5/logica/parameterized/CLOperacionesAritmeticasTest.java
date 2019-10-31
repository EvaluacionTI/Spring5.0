package pe.etg.bbva.evalua.spring5.logica.parameterized;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.etg.bbva.evalua.spring5.logica.CLOperacionesAritmeticas;

@RunWith(Parameterized.class)
public class CLOperacionesAritmeticasTest {
	private static Logger MOLOG = LoggerFactory.getLogger(CLOperacionesAritmeticasTest.class);
	
	private int iFirstNumber;
	private int iSecondNumber;
	private int iExpectedResult;
	private CLOperacionesAritmeticas oCLOperaciones;
	
	public CLOperacionesAritmeticasTest(int piFirstNumber, int piSecondNumber, int piExpectedResult) {
		this.iFirstNumber = piFirstNumber;
		this.iSecondNumber = piSecondNumber;
		this.iExpectedResult = piExpectedResult;
	}
	
	@Before
	public void initialize() {
		MOLOG.info("=====> Start method : initialize() <===== ");
		
		oCLOperaciones = new CLOperacionesAritmeticas();

		MOLOG.info("=> Instancia generada : {} ", oCLOperaciones );
		MOLOG.info("=====> End method : initialize() <=====");
	}
	
	/*
	 * Usar la anotación @Parameters para crear un conjunto de datos de entrada para ejecutar la prueba 
	 * El método estático identificado por la anotación @Parameters devuelve una colección en la que cada entrada de la colección será la información de entrada para una iteración de la prueba
	 * 
	 * La estructura del array sería {first number, second number, expected result}
	 */
	@Parameterized.Parameters
	public static Collection<Object[]> inputNumbers() {
		return Arrays.asList(new Object[][] {
			{1,2,3},{6,29,35},{5,1,6},{22,8,30},{30,7,37},{14,11,25}
		});
	}
	
	@Test
	public void testSumaDosNumeros() {
		MOLOG.info("=====> Start method : testSumaDosNumeros() <=====");
		
		MOLOG.info("=> Suma de números : {} + {} = {}", iFirstNumber, iSecondNumber, iExpectedResult );
		
		assertEquals(iExpectedResult, oCLOperaciones.sumaDosNumeros(iFirstNumber, iSecondNumber));
		MOLOG.info("=====> End method : testSumaDosNumeros() <=====");
	}
}
