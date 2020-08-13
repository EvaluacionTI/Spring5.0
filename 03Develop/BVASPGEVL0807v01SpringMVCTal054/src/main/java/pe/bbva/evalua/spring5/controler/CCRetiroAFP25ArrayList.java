package pe.bbva.evalua.spring5.controler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.bbva.evalua.spring5.entity.CEConstant;
import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;
import pe.bbva.evalua.spring5.model.impl.CDRetiroAFP25ArrayList;

@Controller
public class CCRetiroAFP25ArrayList {
	public static final Logger LOG = LoggerFactory.getLogger("CCRetiroAFP25LinkedHashSet");
	
	@Autowired
	CDRetiroAFP25ArrayList oCDArrayList;
	ArrayList<CESaldoAfiliadoCustom> oListaFinal;
	
	@RequestMapping(value="/listarAfiliados.ea")
	public ModelAndView linkedHashSetRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOG.info("[EVL] Request and response : {} {}", request, response);
		LOG.info("[EVL] Instance CDRetiroAFP25ArrayList	: {}", oCDArrayList);
		
		String lsFechaSistema = (new Date()).toString();
		LOG.info("[EVL] Instance ArrayList	: {}", oListaFinal);
		
		oListaFinal = this.oCDArrayList.consultaAllRetiroArrayList();
		
		LOG.info("[EVL] Archivo			  	: {}", CEConstant.JSP_LIST_ALL_AFILIADO);
		LOG.info("[EVL] Fecha del sistema 	: {}", lsFechaSistema);
		LOG.info("[EVL] List ArrayList    	: {}", oListaFinal);
		
		Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("now", lsFechaSistema);
        myModel.put("listSaldoAfiliados", oListaFinal);

		LOG.info("[EVL] Mapa for DOM : {}", myModel);
		return new ModelAndView(CEConstant.JSP_LIST_ALL_AFILIADO, "model", myModel);
	}


}
