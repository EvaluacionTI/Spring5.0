package pe.unjfsc.daw.spring5.entity;

import static org.junit.Assert.assertEquals;

//Revisen que sean estos import
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CECompraEntrada;

@RunWith(Parameterized.class)
public class CECompraEntradaTest {
	// Definir la variable Log
	private static Logger MOLOG = LoggerFactory.getLogger(CECompraEntradaTest.class);
	
	//Definir los atributos a evaluar
	private int id;
	private String producto;
	private double precio;
	private double cantidad;
	private String fechaCompra;
	private CECompraEntrada oCECompra;
	

	// Generar un constructor
	public CECompraEntradaTest(int piId, String psProducto, double pdPrecio, double pdCantidad, String psFechaCompra) {
		this.id = piId;
		this.producto = psProducto;
		this.precio = pdPrecio;
		this.cantidad = pdCantidad;
		this.fechaCompra = psFechaCompra;
	}
	
	// Inicializar una instancia de la clase compra Entrada
	@Before
	public void initialize() {
		MOLOG.info("=====> [CECompraEntradaTest] Start method : initialize() <===== ");
		
		oCECompra = new CECompraEntrada();
		MOLOG.info("=> Instancia generada : {} ", oCECompra );
		
		MOLOG.info("=====> [CECompraEntradaTest] End method : initialize() <=====");
	}
	
	// Lista de parámetros de data que se inyectará en el test.
	@Parameters
	public static Collection<Object[]> inputData() {
		return Arrays.asList(new Object[][] {
			{1, "Celular",1890.94, 5, "03/10/2018" },
			{2, "TV 26", 4590.89, 22, "02/10/2018" },
			{3, "Mochila",300.00, 30, "01/10/2018" },
			{4, "Software",1903.90, 14, "28/09/2018" },
			{5, "Fruta",7.66, 1, "27/09/2018" }
		});
	}	
	
	// El métod test que servirá para la evaluación
	@Test
	public void testCECompraEntrada() {
		MOLOG.info("=====> [CECompraEntradaTest] Start method : testCECompraEntrada() <=====");
		
		// Asignamos al objeto los datos que se iran leyendo uno a uno de inputData
		oCECompra.setId(this.id);
		oCECompra.setProducto(this.producto);
		oCECompra.setPrecio(this.precio);
		oCECompra.setCantidad(this.cantidad);
		oCECompra.setFechaCompra(this.fechaCompra);
		
		MOLOG.info("=> Dato del oCECompra : {}", oCECompra );
		
		// Definimos la variable esperada
		StringBuilder sExpected = new StringBuilder();
		
		sExpected.append("CECompraEntrada [id=").append(id).append(", producto=").append(producto).append(", precio=")
				.append(precio).append(", cantidad=").append(cantidad).append(", fechaCompra=").append(fechaCompra).append("]");
		
		MOLOG.info("=> Dato Esperado : {}", sExpected );
		
		// Verificamos que lo esperado es igual al dato evaluado.
		assertEquals(sExpected.toString(), oCECompra.toString());
		
		MOLOG.info("=====> [CECompraEntradaTest] Start method : testCECompraEntrada() <=====");
	}
}
