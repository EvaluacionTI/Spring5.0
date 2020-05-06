package pe.bbva.spring5.evalua.modulo.inventario.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CC01HelloController {
	private static final Logger MOLOG = LoggerFactory.getLogger("CC01HelloController");
	
	@RequestMapping("/irControlador.eias")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

		ModelAndView oModelView= new ModelAndView();
		
		MOLOG.info("HttpServletRequest : {}", request);
		MOLOG.info("HttpServletResponse : {}", response);
		
		String sNameFileJSP = "JSP01ControllerHello";
		oModelView.setViewName(sNameFileJSP);
		MOLOG.info("Returning : handleRequest");

        return oModelView;
    }
}
