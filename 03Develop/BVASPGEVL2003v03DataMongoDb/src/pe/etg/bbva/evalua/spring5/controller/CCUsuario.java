package pe.etg.bbva.evalua.spring5.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pe.etg.bbva.evalua.spring5.entidad.CEUsuario;
import pe.etg.bbva.evalua.spring5.repositorio.CIUsuarioRepositorio;

@Controller
public class CCUsuario {
	private static Logger moLog = LogManager.getLogger(CCUsuario.class);
	@Autowired
	private CIUsuarioRepositorio oCIRepositorioUsuario;

	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView mostrarUsuario(ModelMap poModeloMap) {
		moLog.info("=====> Método : mostrarUsuario");
		moLog.info("=====> objecto recibe" + poModeloMap);
		List<CEUsuario> oListUsuario = oCIRepositorioUsuario.findAll();
		ModelAndView oModelView = new ModelAndView("index");
		oModelView.addObject("vUsuario", oListUsuario);
		moLog.info("=====> objeto ModelAndView" + oModelView);

		return oModelView;
	}
}
