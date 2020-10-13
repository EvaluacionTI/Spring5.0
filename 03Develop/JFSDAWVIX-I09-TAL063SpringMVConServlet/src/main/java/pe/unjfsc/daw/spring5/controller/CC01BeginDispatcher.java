package pe.unjfsc.daw.spring5.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CC01BeginDispatcher {

	@RequestMapping(value="/RegistroSuperficie.daw")
	public ModelAndView recibirEnviar(HttpServletRequest request, HttpServletResponse response) {
		String lArchivoRealJsp = "jsp01RegistroSuperficie";
		String lFechaSistema = (new Date()).toString();
		
		return new ModelAndView(lArchivoRealJsp, "vFechaSistema", lFechaSistema );
	}
}
