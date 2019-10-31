package pe.unjfsc.daw.spring5.entity;

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

import pe.unjfsc.daw.spring5.entity.CECompraSalida;

@RunWith(Parameterized.class)
public class CECompraSalidaTest {
	private static Logger MOLOG = LoggerFactory.getLogger(CECompraEntradaTest.class);
	
	private int id;
	private String producto;
	private double precio;
	private double cantidad;
	private String fechaCompra;
	private CECompraSalida oCECompra;

	public CECompraSalidaTest(int piId, String psProducto, double pdPrecio, double pdCantidad, String psFechaCompra) {
		this.id = piId;
		this.producto = psProducto;
		this.precio = pdPrecio;
		this.cantidad = pdCantidad;
		this.fechaCompra = psFechaCompra;
	}

	@Before
	public void initialize() {
		MOLOG.info("=====> [CECompraSalidaTest] Start method : initialize() <===== ");
		
		oCECompra = new CECompraSalida();
		MOLOG.info("=> Instancia generada : {} ", oCECompra );
		
		MOLOG.info("=====> [CECompraSalidaTest] End method : initialize() <=====");
	}
	
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
	
	@Test
	public void testCECompraSalida() {
		MOLOG.info("=====> [CECompraSalidaTest] Start method : testCECompraSalida() <=====");
		
		oCECompra.setId(this.id);
		oCECompra.setProducto(this.producto);
		oCECompra.setPrecio(this.precio);
		oCECompra.setCantidad(this.cantidad);
		oCECompra.setFechaCompra(this.fechaCompra);
		
		MOLOG.info("=> Dato del oCECompra : {}", oCECompra );
		
		StringBuilder sExpected = new StringBuilder();
		
		sExpected.append("CECompraSalida [id=");
		sExpected.append(id);
		sExpected.append(", producto=");
		sExpected.append(producto);
		sExpected.append(", precio=");
		sExpected.append(precio);
		sExpected.append(", cantidad=");
		sExpected.append(cantidad);
		sExpected.append(", fechaCompra=");
		sExpected.append(fechaCompra);
		sExpected.append("]");
		
		
		MOLOG.info("=> Dato Esperado : {}", sExpected );
		
		assertEquals(sExpected.toString(), oCECompra.toString());
		
		MOLOG.info("=====> [CECompraSalidaTest] Start method : testCECompraSalida() <=====");
	}

}
