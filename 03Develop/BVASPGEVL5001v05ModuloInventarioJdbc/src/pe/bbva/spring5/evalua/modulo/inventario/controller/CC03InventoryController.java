package pe.bbva.spring5.evalua.modulo.inventario.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.bbva.spring5.evalua.modulo.inventario.CI02ProductManager;

@Component
public class CC03InventoryController{
	private static final Logger MOLOG = LoggerFactory.getLogger("CC03InventoryController");
	
	private CI02ProductManager productManager;
	
	@RequestMapping("/mostrarProduct.eias")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String now = (new java.util.Date()).toString();
		MOLOG.info("returning hello view with " + now);

        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("now", now);
        myModel.put("products", this.productManager.getProducts());

        return new ModelAndView("JSP03MostrarDatos", "model", myModel);
	}

	public void setProductManager(CI02ProductManager productManager) {
		this.productManager = productManager;
	}

}
