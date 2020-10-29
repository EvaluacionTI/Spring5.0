package pe.unjfsc.daw.spring5.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pe.unjfsc.daw.spring5.entity.CEConstant;
import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;
import pe.unjfsc.daw.spring5.logical.impl.CMRetiroAFPLinkedHashSet;

@Controller
public class CCRetiroAFPLinkedHashSet {
	private static final Logger LOG = LoggerFactory.getLogger("CMRetiroAFPLinkedHashSet");

	@Autowired
	private CMRetiroAFPLinkedHashSet oCMRetiroAFP;
	private LinkedHashSet<CESaldoAfiliado> oListaFinal;

	@RequestMapping(value = "/listadoAfiliados.lhs")
	public ModelAndView linkedHashSetConsulta(HttpServletRequest request, HttpServletResponse response) {
		String lFechaSistema = (new Date()).toString();

		LOG.info("[EVL] CMRetiroAFPLinkedHashSet : {}", oCMRetiroAFP);
		oListaFinal = new LinkedHashSet<CESaldoAfiliado>();

		oListaFinal = oCMRetiroAFP.consultAll();

		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("vFechaSistema", lFechaSistema);
		myModel.put("listSaldoAfiliados", oListaFinal);
		LOG.info("[EVL] Salida : {}", oListaFinal.size());

		return new ModelAndView(CEConstant.JSP_LIST_ALL_AFILIADO, "model", myModel);
	}
	
	@RequestMapping(value="/adicionarAfiliado.lhs", method = RequestMethod.GET)
	public ModelAndView lookRegistro(Model oM) {
		LOG.info("[EVL] Load page Add Afiliados :");
		String lFechaSistema = (new Date()).toString();
		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("vFechaSistema", lFechaSistema);
		myModel.put("vAfiliado", new CESaldoAfiliado());
		LOG.info("[EVL] Model And View add : {} ", myModel);
		LOG.info("[EVL] Iniciando JSP : {} ", CEConstant.JSP_ADD_AFILIADO);
		return new ModelAndView(CEConstant.JSP_ADD_AFILIADO, "model", myModel);
	}
	
	@RequestMapping(value="/saveSaldo", method = RequestMethod.POST)
	public ModelAndView newAfiliado(@ModelAttribute("model.vAfiliado") CESaldoAfiliado poCESaldo) {
		LOG.info("[EVL] Grabando Afiliados : {}", poCESaldo);
		oCMRetiroAFP.saveRetiro(poCESaldo);
		return new ModelAndView("redirect:/" + CEConstant.JSP_SEE_ALL_AFILIADO);
	}

	@RequestMapping(value = "/visualizarAfiliados.lhs")
	public ModelAndView lookAfiliado() {
		String lFechaSistema = (new Date()).toString();

		LOG.info("[EVL] Visualizando Afiliados :");
		oListaFinal = new LinkedHashSet<CESaldoAfiliado>();

		oListaFinal = oCMRetiroAFP.consultAll();

		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("vFechaSistema", lFechaSistema);
		myModel.put("listSaldoAfiliados", oListaFinal);
		LOG.info("[EVL] Salida : {}", oListaFinal.size());

		return new ModelAndView(CEConstant.JSP_SEE_ALL_AFILIADO, "model", myModel);
	}
	
	@RequestMapping(value="/editarSaldo/{id}")
	public ModelAndView editAfiliado(@PathVariable int id) {
		LOG.info("[EVL] Editando Afiliados :");
		CESaldoAfiliado oCESaldo = oCMRetiroAFP.consultaById(id);
		
		return new ModelAndView("redirect:/" + CEConstant.JSP_EDIT_AFILIADO, "model", oCESaldo);
	}
	
	@RequestMapping(value="/editarAfiliado.lhs}", method = RequestMethod.POST)
	public ModelAndView updateAfiliado(@ModelAttribute("CESaldoAfiliado") CESaldoAfiliado poCESaldo) {
		LOG.info("[EVL] Actualizando Afiliados :");
		oCMRetiroAFP.updateRetiro(poCESaldo);
		return new ModelAndView("redirect:/" + CEConstant.JSP_SEE_ALL_AFILIADO);
	}
	
	@RequestMapping(value="/eliminarSaldo/{id}", method = RequestMethod.GET)
	public ModelAndView deleteAfiliado(@PathVariable int id) {
		LOG.info("[EVL] Eliminando Afiliados :");
		oCMRetiroAFP.deleteRetiro(id);
		return new ModelAndView("redirect:/" + CEConstant.JSP_SEE_ALL_AFILIADO);
	}
}