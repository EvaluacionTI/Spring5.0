package pe.etg.bbva.spring.controler;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CC0101v01IniciarDispatcher {
	
	/*
	 * Los prefijos y sufijos se encuentran definidos en el archivo de configuración xml
	 * para la clase : org.springframework.web.servlet.view.InternalResourceViewResolver
	 */
	@RequestMapping(value="/CrearTipoPlan.ea")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{

		//String lsArchivoJsp = "/WEB-INF/views/jsp0101v01CrearTipoPlan.jsp";
		String lsArchivoJsp = "jsp0101v01CrearTipoPlan";
		String lsFechaSistema = (new Date()).toString();

		return new ModelAndView(lsArchivoJsp, "vFechaSistema", lsFechaSistema);

	}	
}
