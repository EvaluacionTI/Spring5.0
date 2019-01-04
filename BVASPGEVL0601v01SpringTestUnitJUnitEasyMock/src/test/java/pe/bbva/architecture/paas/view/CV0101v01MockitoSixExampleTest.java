package pe.bbva.architecture.paas.view;

import static org.hamcrest.CoreMatchers.any;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CV0101v01MockitoSixExampleTest {
	
	public static final Logger MOLOG = LoggerFactory.getLogger(CV0101v01MockitoSixExampleTest.class);
	
	@Test
	/*
	 * Crear un iterador falso y hace que devuelva "Very" la primera vez que se llama al método next (). Llamadas después de ese regreso "Good".
	 * Entonces podemos ejecutar aserciones normales.
	 */
	public void testExample01IteratorWillReturnVeryGood() {
		MOLOG.info("[PU] ====> [begin iniating testExample01IteratorWillReturnVeryGood");
		
		String lsMensajeEsperado = "Very Good";
		Iterator item=mock(Iterator.class);
		MOLOG.info("[PU] ====> [Iterator : {} ", item);
		
		when(item.next()).thenReturn("Very").thenReturn("Good");
		
		String sResult = item.next() + " " + item.next();
		
		MOLOG.info("[PU] ====> [lsMensajeEsperado : {} ", lsMensajeEsperado);
		MOLOG.info("[PU] ====> [sResult : {} ", sResult);
		
		assertEquals(lsMensajeEsperado, sResult);
	}
	
	@Test
	/*
	 * Esto crea un objeto comparable y devuelve 1 si se compara con un valor de cadena en particular ("Prueba" en este caso). 
	 * Si el método tiene argumentos pero realmente no le importa lo que pasa o no puede predecirlo, use anyInt () (y valores alternativos para otros tipos)
	 */
	public void testExample02WithArguments() {
		MOLOG.info("[PU] ====> [begin iniating testExample02WithArguments");
		
		Comparable c=mock(Comparable.class);
		MOLOG.info("[PU] ====> [Comparable {} : ", c);
		
		when(c.compareTo(any(null))).thenReturn(-1);
		 assertEquals(0,c.compareTo(5));
	}
	
	@Test(expected=IOException.class)
	/*
	 * Este ejemplo arroja una IOException cuando se invoca el método de cierre simulado OutputStream. 
	 * Verificamos fácilmente que OutputStreamWriter vuelve a generar la excepción de la secuencia de salida envuelta. 
	 * Para verificar las llamadas reales a objetos subyacentes (uso de objetos simulados típicos), podemos usar verify (mock_object) .method_call
	 */
	public void testExample03OutputStreamWriterThrowsExceptionFromOutputStream() throws IOException{
		MOLOG.info("[PU] ====> [begin iniating testExample03OutputStreamWriterThrowsExceptionFromOutputStream");
		
		OutputStream oOSMock=mock(OutputStream.class);
		MOLOG.info("[PU] ====> [OutputStream {} : ", oOSMock);
		
		OutputStreamWriter oOSW=new OutputStreamWriter(oOSMock);
		MOLOG.info("[PU] ====> [OutputStreamWriter {} : ", oOSW);
		
		doThrow(new IOException()).when(oOSMock).close();
		oOSW.close();
	}
	
	@Test
	/*
	 * Se verificará que OutputStreamWriter propaga la llamada de método close a la secuencia de salida envuelta.
	 * Puede usar argumentos sobre métodos y emparejamientos como anyInt () similar al ejemplo anterior. 
	 * Tenga en cuenta que no puede mezclar literales y comparadores, por lo que si tiene múltiples argumentos, todos deben ser literales o comparadores. 
	 * use eq (value) matcher para convertir un literal en un matcher que se compare con el valor. 
	 * Mockito viene con muchas combinaciones ya integradas, pero a veces necesitas un poco más de flexibilidad. 
	 * Por ejemplo, OutputStreamWriter almacenará en búfer la salida y luego la enviará al objeto envuelto cuando se vacíe, pero no sabemos cuán grande es 
	 * el buffer por adelantado. Por lo tanto, no podemos usar la coincidencia de igualdad. Sin embargo, podemos suministrar nuestro propio marcador 
	 */
	public void testExample04OutputStreamWriterClosesOutputStreamOnClose() throws IOException{
		MOLOG.info("[PU] ====> [begin iniating testExample04OutputStreamWriterClosesOutputStreamOnClose");
		
		OutputStream oOSMock=mock(OutputStream.class);
		MOLOG.info("[PU] ====> [OutputStream {} : ", oOSMock);
		
		OutputStreamWriter oOSW=new OutputStreamWriter(oOSMock);
		MOLOG.info("[PU] ====> [OutputStreamWriter {} : ", oOSW);
		oOSW.close();
		verify(oOSMock).close();
	}
	

}
