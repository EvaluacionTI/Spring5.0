package pe.bbva.evalua.spring5.controler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CCMostrarAnnotation {
	private static final Logger LOG = LoggerFactory.getLogger("CCMostrarAnnotation");
	
	@RequestMapping(value="/mostrarSaludo.ea")
	public ModelAndView mostrar() {
		LOG.info("[EVL] =====[ ModelAndView ]=====");
		
		ModelAndView oModel = new ModelAndView();
		LOG.info("[EVL] Instance ModelAndView : {}", oModel);
		
		oModel.addObject("vTitulo", "[EVL] Evaluación Spring5");
		oModel.addObject("vMensaje", "[EVL] Utilizando Annotations");
		oModel.setViewName("jsp0101v01VerAnnotation");
		
		LOG.info("[EVL] New value ModelAndView : {}", oModel);
		return oModel;
	}
}
