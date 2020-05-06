package pe.bbva.spring5.evalua.modulo.inventario.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import pe.bbva.spring5.evalua.modulo.inventario.entity.CE02Product;
import pe.bbva.spring5.evalua.modulo.inventario.impl.CM02SimpleProductManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CM02SimpleProductManager.class)
public class CM02SimpleProductManagerTest {
	private static final Logger MOLOG = LoggerFactory.getLogger("CM02SimpleProductManagerTest");
	
	@Autowired
	private CM02SimpleProductManager productManager;
	
	private List<CE02Product> products;

	private static int PRODUCT_COUNT = 2;
	
	private static Double CHAIR_PRICE = new Double(20.50);
    private static String CHAIR_DESCRIPTION = "Chair";
    
    private static String TABLE_DESCRIPTION = "Table";
    private static Double TABLE_PRICE = new Double(150.10);         

    private static int POSITIVE_PRICE_INCREASE = 10;
    
    protected void setUp() throws Exception {
        productManager = new CM02SimpleProductManager();
        products = new ArrayList<CE02Product>();
        
        // stub up a list of products
        CE02Product product = new CE02Product();
        product.setDescription("Chair");
        product.setPrice(CHAIR_PRICE);
        products.add(product);
        
        MOLOG.info("Product : {}", product.toString());
        product = new CE02Product();
        product.setDescription("Table");
        product.setPrice(TABLE_PRICE);
        
        MOLOG.info("Product : {}", product.toString());
        
        products.add(product);
        MOLOG.info("List Product : {}", products.size());
        
        productManager.setProducts(products);
    }

    /*
    @Test
    public void testGetProductsWithNoProducts() {
        productManager = new CM02SimpleProductManager();
        MOLOG.info("List Product : {}", productManager.getProducts().size());
        assertNull(productManager.getProducts());
    }
    

    @Test
    public void testGetProducts() {
        List<CE02Product> products = productManager.getProducts();
        assertNotNull(products);        
        assertEquals(PRODUCT_COUNT, productManager.getProducts().size());
    
        CE02Product product = products.get(0);
        assertEquals(CHAIR_DESCRIPTION, product.getDescription());
        assertEquals(CHAIR_PRICE, product.getPrice());
        
        product = products.get(1);
        assertEquals(TABLE_DESCRIPTION, product.getDescription());
        assertEquals(TABLE_PRICE, product.getPrice());      
    }
*/
    @Test
    public void testIncreasePriceWithNullListOfProducts() {
        try {
            productManager = new CM02SimpleProductManager();
            productManager.increasePrice(POSITIVE_PRICE_INCREASE);
        }
        catch(NullPointerException ex) {
            fail("Products list is null.");
        }
    }
    
    @Test
    public void testIncreasePriceWithEmptyListOfProducts() {
        try {
            productManager = new CM02SimpleProductManager();
            productManager.setProducts(new ArrayList<CE02Product>());
            productManager.increasePrice(POSITIVE_PRICE_INCREASE);
        }
        catch(Exception ex) {
            fail("Products list is empty.");
        }           
    }

    /*
    public void testIncreasePriceWithPositivePercentage() {
        productManager.increasePrice(POSITIVE_PRICE_INCREASE);
        double expectedChairPriceWithIncrease = 22.55;
        double expectedTablePriceWithIncrease = 165.11;
        
        List<CE02Product> products = productManager.getProducts();      
        CE02Product product = products.get(0);
        assertEquals(expectedChairPriceWithIncrease, product.getPrice());
        
        product = products.get(1);      
        assertEquals(expectedTablePriceWithIncrease, product.getPrice());       
    } */
}
