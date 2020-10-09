package pe.bbva.evalua.spring5.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.bbva.evalua.spring5.entity.CEConstant;
import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;
import pe.bbva.evalua.spring5.model.impl.CDRetiroAFP25LinkedHashSet;

@Controller
public class CCRetiroAFP25LinkedHashSet {
	public static final Logger LOG = LoggerFactory.getLogger("CCRetiroAFP25LinkedHashSet");
	
	private CDRetiroAFP25LinkedHashSet oCDLinkedListHashSet;
	private LinkedHashSet<CESaldoAfiliadoCustom> oListaFinal;
	
	@RequestMapping(value="/listarAfiliados.ea")
	public ModelAndView linkedHashSetRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOG.info("[EVL] Request and response : {} {}", request, response);
		LOG.info("[EVL] Instance CDRetiroAFP25LinkedHashSet	: {}", oCDLinkedListHashSet);
		
		String lsFechaSistema = (new Date()).toString();
		oListaFinal = new LinkedHashSet<CESaldoAfiliadoCustom>();
		LOG.info("[EVL] Instance LikendHashSet	: {}", oListaFinal);
		
		oListaFinal = this.oCDLinkedListHashSet.consultaAllRetiroLinkedHashSe();
		
		LOG.info("[EVL] Archivo			  	: {}", CEConstant.JSP_LIST_ALL_AFILIADO);
		LOG.info("[EVL] Fecha del sistema 	: {}", lsFechaSistema);
		LOG.info("[EVL] List LikendHashSet	: {}", oListaFinal);
		
		Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("now", lsFechaSistema);
        myModel.put("listSaldoAfiliados", oListaFinal);

		LOG.info("[EVL] Mapa for DOM : {}", myModel);
		return new ModelAndView(CEConstant.JSP_LIST_ALL_AFILIADO, "model", myModel);
	}
}
