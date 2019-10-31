package pe.etg.bbva.evalua.spring5.entity;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
/*
 * JUnit te permite usar parámetros en una clase de pruebas.
 * Hay cinco pasos que debe seguir para crear una prueba parametrizada.
 * 1. Anota la clase de prueba con @RunWith(Parameterized.class)
 * 2. Defina datos de prueba: cree un método público estático, anotado con @Parameters, 
 * 	  que devuelva una Colección de Objetos (como Array) como el conjunto de datos de prueba.
 * 3. Defina la variable de instancia para cada "columna" de datos de prueba.
 * 4. Usar datos de prueba en prueba: puede usar la @Parameter anotación en campos públicos 
 * 	  para obtener los valores de prueba inyectados en la prueba o crear un constructor 
 * 	  público que tome lo que es equivalente a una "fila" de datos de prueba.
 * 5. Cree su (s) caso (s) de prueba usando las variables de instancia como la fuente de los 
 * 	  datos de prueba.
 * 6. Cada prueba JUnit (anotada con @Test) se ejecuta con cada fila del conjunto de datos de prueba. 
 * 	  Si tiene cuatro pruebas y doce filas de datos, esto resultará en cuarenta y ocho pruebas.
 */
@RunWith(Parameterized.class)
public class CT0101v01ParameterizedTestUsingFields {
	// fields used together with @Parameter must be public
	@Parameterized.Parameter(0)
	public int m1;
	@Parameterized.Parameter(1)
	public int m2;
	@Parameterized.Parameter(2)
	public int result;

	// creates the test data
	@Parameterized.Parameters(name = "{index}: Test with m1={0}, m2 ={1}, result is:{2} ")
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { 
			{ 1, 2, 2 }, 
			{ 5, 3, 15 }, 
			{ 121, 4, 484 } 
		};
		return Arrays.asList(data);
	}

	@Test
	public void MultiplyTest() {
		CUOperationMulitiply oCUTester = new CUOperationMulitiply();
		assertEquals("Result", result, oCUTester.multiply(m1, m2));
	}

	// class to be tested
	private class CUOperationMulitiply {
		public int multiply(int i, int j) {
			return i * j;
		}
	}

}
