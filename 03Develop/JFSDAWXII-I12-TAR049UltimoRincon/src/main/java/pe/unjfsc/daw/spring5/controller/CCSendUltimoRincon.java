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
import pe.unjfsc.daw.spring5.logical.impl.CMListadoUltimoRincon;


@Controller
public class CCSendUltimoRincon {
	public static final Logger LOG = LoggerFactory.getLogger("CCSendUltimoRincon");

	@Autowired
	private CMListadoUltimoRincon oListaFinal;
	
	@RequestMapping(value="/listadoProducto.eur")
	public ModelAndView hashSetRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOG.info("[EVL] Request and response : {} {}", request, response);
		
		String lsFechaSistema = (new Date()).toString();
		LOG.info("[EVL] Instance CMListadoUltimoRincon	: {}", oListaFinal);
		
		LOG.info("[EVL] Archivo			  	: {}", CEConstant.JSP_LIST_PRODUCT);
		LOG.info("[EVL] Fecha del sistema 	: {}", lsFechaSistema);
		LOG.info("[EVL] HashSet				: {}", oListaFinal.listaProducto().size());
		
		Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("vFechaSistema", lsFechaSistema);
        myModel.put("listSaldoAfiliados", oListaFinal.listaProducto());

		LOG.info("[EVL] Mapa for DOM : {}", myModel);
		return new ModelAndView(CEConstant.JSP_LIST_PRODUCT, "model", myModel);
	}

	@RequestMapping(value="/listadoCliente.eur")
	public ModelAndView arrayListRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOG.info("[EVL] Request and response : {} {}", request, response);
		
		String lsFechaSistema = (new Date()).toString();
		LOG.info("[EVL] Instance CMListadoUltimoRincon	: {}", oListaFinal);
		
		LOG.info("[EVL] Archivo			  	: {}", CEConstant.JSP_LIST_CLIENT);
		LOG.info("[EVL] Fecha del sistema 	: {}", lsFechaSistema);
		LOG.info("[EVL] ArrayList			: {}", oListaFinal.listaCliente().size());
		
		Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("vFechaSistema", lsFechaSistema);
        myModel.put("listSaldoAfiliados", oListaFinal.listaCliente());

		LOG.info("[EVL] Mapa for DOM : {}", myModel);
		return new ModelAndView(CEConstant.JSP_LIST_CLIENT, "model", myModel);
	}

	@RequestMapping(value="/listadoCompraEfectuada.eur")
	public ModelAndView linkedHashSetRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOG.info("[EVL] Request and response : {} {}", request, response);
		
		String lsFechaSistema = (new Date()).toString();
		LOG.info("[EVL] Instance CMListadoUltimoRincon	: {}", oListaFinal);
		
		LOG.info("[EVL] Archivo			  	: {}", CEConstant.JSP_LIST_COMPRA_ECECTUADA);
		LOG.info("[EVL] Fecha del sistema 	: {}", lsFechaSistema);
		LOG.info("[EVL] ArrayList			: {}", oListaFinal.listaCompraEfectuada().size());
		
		Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("vFechaSistema", lsFechaSistema);
        myModel.put("listSaldoAfiliados", oListaFinal.listaCompraEfectuada());

		LOG.info("[EVL] Mapa for DOM : {}", myModel);
		return new ModelAndView(CEConstant.JSP_LIST_COMPRA_ECECTUADA, "model", myModel);
	}

	@RequestMapping(value="/listadoNameCompraEfectuada.eur")
	public ModelAndView linkedHashSetNameRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOG.info("[EVL] Request and response : {} {}", request, response);
		
		String lsFechaSistema = (new Date()).toString();
		LOG.info("[EVL] Instance CMListadoUltimoRincon	: {}", oListaFinal);
		
		LOG.info("[EVL] Archivo			  	: {}", CEConstant.JSP_LIST_NAME_COMPRA_ECECTUADA);
		LOG.info("[EVL] Fecha del sistema 	: {}", lsFechaSistema);
		LOG.info("[EVL] ArrayList			: {}", oListaFinal.listaClientProductCompraEfectuada().size());
		
		Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("vFechaSistema", lsFechaSistema);
        myModel.put("listSaldoAfiliados", oListaFinal.listaClientProductCompraEfectuada());

		LOG.info("[EVL] Mapa for DOM : {}", myModel);
		return new ModelAndView(CEConstant.JSP_LIST_NAME_COMPRA_ECECTUADA, "model", myModel);
	}
	
	@RequestMapping(value="/listadoBuyNotOrder.eur")
	public ModelAndView arrayListNotOrderRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOG.info("[EVL] Request and response : {} {}", request, response);
		
		String lsFechaSistema = (new Date()).toString();
		LOG.info("[EVL] Instance CMListadoUltimoRincon	: {}", oListaFinal);
		
		LOG.info("[EVL] Archivo			  	: {}", CEConstant.JSP_LIST_DETAIL_BUY_NOT_ORDER);
		LOG.info("[EVL] Fecha del sistema 	: {}", lsFechaSistema);
		LOG.info("[EVL] ArrayList			: {}", oListaFinal.detailBuyNotOrder("0333151023").size());
		
		Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("vFechaSistema", lsFechaSistema);
        myModel.put("listSaldoAfiliados", oListaFinal.detailBuyNotOrder("0333151023"));

		LOG.info("[EVL] Mapa for DOM : {}", myModel);
		return new ModelAndView(CEConstant.JSP_LIST_DETAIL_BUY_NOT_ORDER, "model", myModel);
	}

	@RequestMapping(value="/listadoBuyOrder.eur")
	public ModelAndView arrayListOrderRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOG.info("[EVL] Request and response : {} {}", request, response);
		
		String lsFechaSistema = (new Date()).toString();
		LOG.info("[EVL] Instance CMListadoUltimoRincon	: {}", oListaFinal);
		
		LOG.info("[EVL] Archivo			  	: {}", CEConstant.JSP_LIST_DETAIL_BUY_ORDER);
		LOG.info("[EVL] Fecha del sistema 	: {}", lsFechaSistema);
		LOG.info("[EVL] ArrayList			: {}", oListaFinal.detailBuyOrder("0333151023").size());
		
		Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("vFechaSistema", lsFechaSistema);
        myModel.put("listSaldoAfiliados", oListaFinal.detailBuyOrder("0333151023"));

		LOG.info("[EVL] Mapa for DOM : {}", myModel);
		return new ModelAndView(CEConstant.JSP_LIST_DETAIL_BUY_ORDER, "model", myModel);
	}

	@RequestMapping(value="/listadoUltimaCompra.eur")
	public ModelAndView arrayListUltimaOrderRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOG.info("[EVL] Request and response : {} {}", request, response);
		
		String lsFechaSistema = (new Date()).toString();
		LOG.info("[EVL] Instance CMListadoUltimoRincon	: {}", oListaFinal);
		
		LOG.info("[EVL] Archivo			  	: {}", CEConstant.JSP_LIST_COMPRA_BY_CLIENT);
		LOG.info("[EVL] Fecha del sistema 	: {}", lsFechaSistema);
		LOG.info("[EVL] ArrayList			: {}", oListaFinal.detailAccumulatedBuyOrder("0333151023").size());
		
		Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("vFechaSistema", lsFechaSistema);
        myModel.put("listSaldoAfiliados", oListaFinal.detailAccumulatedBuyOrder("0333151023"));

		LOG.info("[EVL] Mapa for DOM : {}", myModel);
		return new ModelAndView(CEConstant.JSP_LIST_COMPRA_BY_CLIENT, "model", myModel);
	}
	@RequestMapping(value="/listadoNoCompra.eur")
	public ModelAndView arrayListUltimaNoOrderRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOG.info("[EVL] Request and response : {} {}", request, response);
		
		String lsFechaSistema = (new Date()).toString();
		LOG.info("[EVL] Instance CMListadoUltimoRincon	: {}", oListaFinal);
		
		LOG.info("[EVL] Archivo			  	: {}", CEConstant.JSP_LIST_COMPRA_NO_CLIENT);
		LOG.info("[EVL] Fecha del sistema 	: {}", lsFechaSistema);
		LOG.info("[EVL] ArrayList			: {}", oListaFinal.detailNotBuy("0333141002").size());
		
		Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("vFechaSistema", lsFechaSistema);
        myModel.put("listSaldoAfiliados", oListaFinal.detailNotBuy("0333141002"));

		LOG.info("[EVL] Mapa for DOM : {}", myModel);
		return new ModelAndView(CEConstant.JSP_LIST_COMPRA_NO_CLIENT, "model", myModel);
	}
}
