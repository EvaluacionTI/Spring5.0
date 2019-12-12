package pe.etg.bbva.spring5.view;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.etg.bbva.spring5.entity.CE0101v01Producto;
import pe.etg.bbva.spring5.service.impl.CM0101v01ProductoServicioImplementar;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@SpringBootTest(classes=CV0101v01ListaProductoTest.class)
public class CV0101v01ListaProductoTest {

	//@Autowired
	private CM0101v01ProductoServicioImplementar oCCServicioUnico;
	
	@Test
	public void listaProducto() {
		oCCServicioUnico = new CM0101v01ProductoServicioImplementar();
		List<CE0101v01Producto> oListaProducto = oCCServicioUnico.listaProductos();
		
		assertNotNull(oListaProducto);
		assertFalse(oListaProducto.isEmpty());
		assertEquals(4, oListaProducto.size());
		//fail("Not yet implemented");
	}

}
