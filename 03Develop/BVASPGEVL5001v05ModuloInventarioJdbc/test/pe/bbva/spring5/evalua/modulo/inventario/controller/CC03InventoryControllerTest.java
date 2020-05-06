package pe.bbva.spring5.evalua.modulo.inventario.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.ModelAndView;

import pe.bbva.spring5.evalua.modulo.inventario.impl.CM02SimpleProductManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CC03InventoryController.class)
public class CC03InventoryControllerTest {
	
	@Autowired
	private CC03InventoryController controller;
	
	@Test
	public void testHandleRequestView() throws Exception{
        
        controller.setProductManager(new CM02SimpleProductManager());
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("JSP03MostrarDatos", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        Map modelMap = (Map) modelAndView.getModel().get("model");
        String nowValue = (String) modelMap.get("now");
        assertNotNull(nowValue);
    }
}
