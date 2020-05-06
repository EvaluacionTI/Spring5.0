package pe.etg.bbva.spring5.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//La clase CV0101v01ListaProducto debe tener la anotacion @SpringBootApplication
@SpringBootTest(classes= {CV0101v01ListaProducto.class})
public class CV0101v01IniciarTestWithBoot {

	@Test
	public void contextLoads() {
	}
}
