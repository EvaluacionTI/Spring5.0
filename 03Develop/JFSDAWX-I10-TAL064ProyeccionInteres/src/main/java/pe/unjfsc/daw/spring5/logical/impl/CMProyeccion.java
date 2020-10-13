package pe.unjfsc.daw.spring5.logical.impl;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEFormula;
import pe.unjfsc.daw.spring5.entity.CEMeses;
import pe.unjfsc.daw.spring5.entity.CEProyeccion;
import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;
import pe.unjfsc.daw.spring5.logical.CIProyeccion;
import pe.unjfsc.daw.spring5.model.CDLoadData;
import pe.unjfsc.daw.spring5.utility.CUInteres;

public class CMProyeccion implements CIProyeccion{
	private static final Logger LOG = LoggerFactory.getLogger("CMProyeccion");
	
	private CEProyeccion oCEProyeccion;
	private CEFormula oCEFormulaResponse;
	private CESaldoAfiliado oCESaldo;
	private CDLoadData oData;
	private CUInteres oCUInteres;

	private ArrayList<CEProyeccion> oaListProyeccion;

	@Override
	public CEFormula buscarTasa(CEMeses poCEMes) {
		LOG.info("[EVL] Instancia CEMeses : {}", poCEMes);
		LOG.info("[EVL] Instancia CDLoadData : {}", oData);
		
		for (CEMeses oItem : oData.getoResquestListMeses()) {
			if (oItem.getIdMes()==poCEMes.getIdMes()) {
				oCEFormulaResponse.setPlazo(oItem.getNumeroDiasMes());
				oCEFormulaResponse.setTasa(oItem.getTasaInteres());
				oCEFormulaResponse.setPlazoSinFeriado(oItem.getNumeroDiasMes()-oItem.getCantidadFeriado());
				break;
			}
		}
		LOG.info("[EVL] Instancia oCEFormulaResponse : {}", oCEFormulaResponse);
		return oCEFormulaResponse;
	}
	
	@Override
	public ArrayList<CEProyeccion> integrarTasaInteres(CEMeses poCEMes) {
		double dInteresCompleto, dIntereSinFeriado;
		oCEFormulaResponse = buscarTasa(poCEMes);
		LOG.info("[EVL] Response de tasa en CEFormula : {}", oCEFormulaResponse);
		
		oCEFormulaResponse = oCUInteres.calcularFactor(oCEFormulaResponse);
		LOG.info("[EVL] New Response de tasa en CEFormula : {}", oCEFormulaResponse);
		
		for (CESaldoAfiliado oItem : oData.getoRequestListAfiliado()) {
			LOG.info("[EVL] Read Saldo : {}", oItem); 
			oCEProyeccion.setoCESaldo(oItem);	
			oCEProyeccion.setoCEFormula(oCEFormulaResponse);
			LOG.info("[EVL] Begin CEProyeccion  : {}", oCEProyeccion);
			dInteresCompleto = oCUInteres.calculoInteres(oCEFormulaResponse.getFactor(), oItem.getSaldoCIC());
			dIntereSinFeriado = oCUInteres.calculoInteres(oCEFormulaResponse.getFactorSinFeriado(), oCESaldo.getSaldoCIC());
			LOG.info("[EVL] Intereses  : {} {}", dInteresCompleto, dIntereSinFeriado);
			
			oCEProyeccion.setInteresCompleto(dInteresCompleto);
			oCEProyeccion.setInteresSinFeriado(dIntereSinFeriado);
			oCEProyeccion.setDiferenciaInteres(dInteresCompleto-dIntereSinFeriado);
			oCEProyeccion.setSaldoFinal(oItem.getSaldoCIC() + dInteresCompleto);
			LOG.info("[EVL] End CEProyeccion  : {}", oCEProyeccion);
			oaListProyeccion.add(oCEProyeccion);
			dInteresCompleto=0;
			dIntereSinFeriado=0;
		}
		return oaListProyeccion;
	}

	public void setoCEProyeccion(CEProyeccion oCEProyeccion) {
		this.oCEProyeccion = oCEProyeccion;
	}

	public void setoCEFormulaResponse(CEFormula oCEFormulaResponse) {
		this.oCEFormulaResponse = oCEFormulaResponse;
	}

	public void setoCESaldo(CESaldoAfiliado oCESaldo) {
		this.oCESaldo = oCESaldo;
	}

	public void setoData(CDLoadData oData) {
		this.oData = oData;
	}

	public void setoCUInteres(CUInteres oCUInteres) {
		this.oCUInteres = oCUInteres;
	}

	public void setOaListProyeccion(ArrayList<CEProyeccion> oaListProyeccion) {
		this.oaListProyeccion = oaListProyeccion;
	}
}
