package pe.etg.bbva.spring5.view;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import pe.etg.bbva.spring5.entity.CE0101v01Producto;
import pe.etg.bbva.spring5.service.impl.CM0101v01ProductoServicioImplementar;


@RunWith(SpringRunner.class)
@SpringBootTest(classes= {CV0101v01ListaProducto.class})
public class CV0101v01ListaProductoTest {

	//@Autowired
	//private CM0101v01ProductoServicioImplementar oCCServicioUnico;

	@Test
	public void contextLoads() {
	//	assertThat(oCCServicioUnico).isNotNull();
	}
	
	//@Test
	//public void listaProducto() {
	//	CI0101v01ProductoServicio oCCServicioUnico = new CM0101v01ProductoServicioImplementar();
	//	List<CE0101v01Producto> oListaProducto = oCCServicioUnico.listaProductos();
		
	//	assertNotNull(oListaProducto);
	//	assertFalse(oListaProducto.isEmpty());
	//	assertEquals(4, oListaProducto.size());
		//fail("Not yet implemented");
	//}

}
