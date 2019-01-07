package pe.bbva.architecture.view;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.etg.bbva.spring.entity.CE0101v01Producto;
import pe.etg.bbva.spring.service.impl.CM0101v01ProductoServicioImplementar;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@SpringBootTest(classes=CT0101v01ListaProducto.class)
public class CT0101v01ListaProducto {

	@Autowired
	private CM0101v01ProductoServicioImplementar oCCServicioUnico;
	
	@Test
	public void listaProducto() {
		List<CE0101v01Producto> oListaProducto = oCCServicioUnico.listaProductos();
		
		assertNotNull(oListaProducto);
		assertFalse(oListaProducto.isEmpty());
		assertEquals(3, oListaProducto.size());
		//fail("Not yet implemented");
	}

}
