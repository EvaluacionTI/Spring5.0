package pe.bbva.spring5.evalua.modulo.inventario.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.bbva.spring5.evalua.modulo.inventario.entity.CE02Product;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CE02Product.class)
public class CE02ProductTest {
	private static final Logger MOLOG = LoggerFactory.getLogger("CEProductTest");
	
	@Autowired
	private CE02Product product;
	
	protected void setUp() throws Exception {
        product = new CE02Product();
        MOLOG.info("Instancia : {}", product);
    }

	@Test
    public void testSetAndGetDescription() {
        String testDescription = "wallpa";
        assertNull(product.getDescription());
        product.setDescription(testDescription);
        
        MOLOG.info("Producto : {}", product.toString());
        assertEquals(testDescription, product.getDescription());
    }

	@Test
    public void testSetAndGetPrice() {
        double testPrice = 100.00;
        assertEquals(0, 0, 0);    
        product.setPrice(testPrice);
        MOLOG.info("Producto : {}", product.toString());
        assertEquals(testPrice, product.getPrice(), 0);
    }
}
