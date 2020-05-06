package pe.bbva.spring5.evalua.modulo.inventario;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.ModelAndView;

import pe.bbva.spring5.evalua.modulo.inventario.controller.CC01HelloController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CC01HelloController.class)
public class CC01HelloControlerTest {

	private static final Logger MOLOG = LoggerFactory.getLogger("CC01HelloControlerTest");
	
	@Autowired
	private CC01HelloController controller;
	
	@Test
	public void testHandleRequestView() throws Exception{		
        
        MOLOG.info("[ALM] CC01HelloController : {}", controller);
        ModelAndView modelAndView = controller.handleRequest(null, null);	
        
        MOLOG.info("[ALM] ModelAndView : {}", modelAndView);
        MOLOG.info("[ALM] ModelAndView getModel: {}", modelAndView.getModel());
        MOLOG.info("[ALM] ModelAndView getModelMap: {}", modelAndView.getModelMap());
        MOLOG.info("[ALM] ModelAndView getStatus: {}", modelAndView.getStatus());
        MOLOG.info("[ALM] ModelAndView getView: {}", modelAndView.getView());
        MOLOG.info("[ALM] ModelAndView getViewName: {}", modelAndView.getViewName());
        
        String sFileXpectedJSP="JSP01ControllerHello";
        assertEquals(sFileXpectedJSP, modelAndView.getViewName());
    }
}
