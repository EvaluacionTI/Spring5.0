package pe.unjfsc.daw.spring5.controller;

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
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pe.unjfsc.daw.spring5.entity.CEConstant;
import pe.unjfsc.daw.spring5.entity.CEMeses;
import pe.unjfsc.daw.spring5.entity.CEProyeccion;
import pe.unjfsc.daw.spring5.logical.impl.CMProyeccion;


@Component
public class CCReceiverSendProyeccion {
	public static final Logger LOG = LoggerFactory.getLogger("CCRetiroAFP25LinkedHashSet");
	
	private CEMeses oCEMes;
	private CMProyeccion oCMProyeccion;
	private ArrayList<CEProyeccion> oListaFinal;
	
	@RequestMapping(value="/listarAfiliados.ea")
	public ModelAndView arrayListRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOG.info("[EVL] Request and response : {} {}", request, response);
		LOG.info("[EVL] Instance CMProyeccion	: {}", oCMProyeccion);
		
		String lsFechaSistema = (new Date()).toString();
		LOG.info("[EVL] Instance ArrayList	: {}", oListaFinal);
		
		oCEMes.setIdMes(10);
		oListaFinal = this.oCMProyeccion.integrarTasaInteres(oCEMes);
		
		LOG.info("[EVL] Archivo			  	: {}", CEConstant.JSP_LIST_ALL_AFILIADO);
		LOG.info("[EVL] Fecha del sistema 	: {}", lsFechaSistema);
		LOG.info("[EVL] List ArrayList	: {}", oListaFinal);
		
		Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("vFechaSistema", lsFechaSistema);
        myModel.put("listSaldoAfiliados", oListaFinal);

		LOG.info("[EVL] Mapa for DOM : {}", myModel);
		return new ModelAndView(CEConstant.JSP_LIST_ALL_AFILIADO, "model", myModel);
	}
}
