package pe.etg.bbva.spring.controler;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CC0101v01InicarDispatcher {
	private static final Logger MOLOG = LoggerFactory.getLogger(CC0101v01InicarDispatcher.class);


	/*
	 * Los prefijos y sufijos se encuentran definidos en el archivo de configuraci�n xml
	 * para la clase : org.springframework.web.servlet.view.InternalResourceViewResolver
	 */
	@RequestMapping(value="/CrearTipoPlan.ea")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		MOLOG.info("[EVL] Start ");
		//String lsArchivoJsp = "/WEB-INF/views/jsp0101v01CrearTipoPlan.jsp";
		String lsArchivoJsp = "jsp0101v01CrearTipoPlan";
		String lsFechaSistema = (new Date()).toString();
		MOLOG.info("[EVL] Finish");
		return new ModelAndView(lsArchivoJsp, "vFechaSistema", lsFechaSistema);
	}	
}
