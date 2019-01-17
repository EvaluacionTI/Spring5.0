package pe.etg.bbva.spring.controler;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CC0101v01InicarDispatcher {
	private static final Logger MOLOG = LoggerFactory.getLogger(CC0101v01InicarDispatcher.class);

	@RequestMapping(value = "/mostrarFecha.ea")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		MOLOG.info("[EVL] Start ");
		MOLOG.info("[EVL] Parameter : {} {}", request, response);

		String lsArchivoJsp = "jsp0201v01MostrarFecha";
		String lsFechaSistema = (new Date()).toString();

		MOLOG.info("[EVL] jsp {}", lsArchivoJsp);
		MOLOG.info("[EVL] Finish");
		
		return new ModelAndView(lsArchivoJsp, "vFechaSistema", lsFechaSistema);

	}

	@RequestMapping(value = "/jsp0101v01Mostrar.ea", method = RequestMethod.GET)
	public String mostrarInicioDispatcher(
			@RequestParam(value = "vMensaje", required = false, defaultValue = "servlet Dispatcher") String psNombre,
			Model poModel) {
		MOLOG.info("[EVL] Start");

		String sMensaje = "Iniciando el Dispatcher con la configuraci�n web.xml ";

		MOLOG.info("Variable : {} ", psNombre);
		MOLOG.info("Model    : {} ", poModel);
		MOLOG.info("String   : {} ", sMensaje);

		poModel.addAttribute("vMensaje", sMensaje);

		MOLOG.info("[EVL] Finish");
		return "jsp0101v01Mostrar.jsp";
	}
}
