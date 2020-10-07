package pe.bbva.evalua.spring5.controler;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CC01MostrarPollo {
	private static final Logger LOG = LoggerFactory.getLogger("CC01MostrarPollo");
	
	@RequestMapping(value="/mostrarPollo.pollo")
	public ModelAndView redireccionPollo() {
		ModelAndView oModel = new ModelAndView();
		LOG.info("[EVL] Instancia ModelAndView : {}", oModel);

		String lsOnlyNameJsp = "jsp0101v01MostrarPollo";
		String lsFechaSistema = (new Date()).toString();
		
		oModel.addObject("vFechaSistema", lsFechaSistema);
		oModel.setViewName(lsOnlyNameJsp);
		LOG.info("[EVL] Datos ModelAndView : {}", oModel.toString());
		return oModel; 
	}
}
