package pe.unjfsc.daw.spring5.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;
import pe.unjfsc.daw.spring5.logical.impl.CMRetiroAFPLinkedHashSet;

@Controller
public class CCRetiroAFPLinkedHashSet {
	private static final Logger LOG = LoggerFactory.getLogger("CMRetiroAFPLinkedHashSet");
	
	private CMRetiroAFPLinkedHashSet oCMRetiroAFP;
	private LinkedHashSet<CESaldoAfiliado> oListaFinal;
	
	@RequestMapping(value="/listadoAfialiados.lhs")
	public ModelAndView linkedHashSetConsulta(HttpServletRequest request, HttpServletResponse response) {
		String lFechaSistema = (new Date()).toString();
		String lFileJSP = "jsp01ListaAfialiado";
		
		LOG.info("[EVL] CMRetiroAFPLinkedHashSet : {}", oCMRetiroAFP);
		oListaFinal = new LinkedHashSet<CESaldoAfiliado>();
		
		oListaFinal = oCMRetiroAFP.consultAll();
		
		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("vFechaSistema", lFechaSistema);
		myModel.put("listSaldoAfiliados", oListaFinal);
		LOG.info("[EVL] Salida : {}", oListaFinal.size());
		
		return new ModelAndView(lFileJSP, "model", myModel);
	}
}
