package pe.unjfsc.daw.spring5.controller;

import java.io.IOException;
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

import pe.unjfsc.daw.spring5.entity.CEConstant;
import pe.unjfsc.daw.spring5.logical.impl.CMTarifa;

//@Controller
public class CCTarifa {
	public static final Logger LOG = LoggerFactory.getLogger("CCTarifa");

	@Autowired
	private CMTarifa oCMServiceSpel;
	
	@RequestMapping(value="/iniciarSpel.ea")
	public ModelAndView arrayListRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOG.info("[EVL] Request and response : {} {}", request, response);
		
		String lsFechaSistema = (new Date()).toString();
		LOG.info("[EVL] Fecha : {}", lsFechaSistema);
		
		LOG.info("[EVL] Archivo			  	: {}", CEConstant.JSP_LIST_ALL_AFILIADO);
		LOG.info("[EVL] Fecha del sistema 	: {}", lsFechaSistema);
		
		Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("vFechaSistema", lsFechaSistema);
        myModel.put("vImpuesto", oCMServiceSpel.importeImpuestoVentas());
        myModel.put("vRetencion", oCMServiceSpel.importeRetencion());

		LOG.info("[EVL] Mapa for DOM : {}", myModel);
		return new ModelAndView(CEConstant.JSP_LIST_ALL_AFILIADO, "model", myModel);
	}
}
