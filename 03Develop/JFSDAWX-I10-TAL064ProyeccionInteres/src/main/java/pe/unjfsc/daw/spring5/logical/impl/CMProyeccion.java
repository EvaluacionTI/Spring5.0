package pe.unjfsc.daw.spring5.logical.impl;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import pe.unjfsc.daw.spring5.entity.CEFormula;
import pe.unjfsc.daw.spring5.entity.CEMeses;
import pe.unjfsc.daw.spring5.entity.CEProyeccion;
import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;
import pe.unjfsc.daw.spring5.entity.CEUnionListas;
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
			LOG.info("[EVL] Begin CEProyeccion  : {}", oItem);
			dInteresCompleto = oCUInteres.calculoInteres(oCEFormulaResponse.getFactor(), oCESaldo.getSaldoCIC());
			dIntereSinFeriado = oCUInteres.calculoInteres(oCEFormulaResponse.getFactorSinFeriado(), oCESaldo.getSaldoCIC());
			
			oCEProyeccion.setInteresCompleto(dInteresCompleto);
			oCEProyeccion.setInteresSinFeriado(dIntereSinFeriado);
			oCEProyeccion.setDiferenciaInteres(dInteresCompleto-dIntereSinFeriado);
			oCEProyeccion.setSaldoFinal(oCESaldo.getSaldoCIC() + dInteresCompleto);
			oaListProyeccion.add(oCEProyeccion);
			dInteresCompleto=0;
			dIntereSinFeriado=0;
		}
		return oaListProyeccion;
	}
	
	@Override
	public CEUnionListas llenarListas(CEProyeccion oCEProyeccion) {
		// TODO Auto-generated method stub
		return null;
	}

	public CEProyeccion getoCEProyeccion() {
		return oCEProyeccion;
	}

	public void setoCEProyeccion(CEProyeccion oCEProyeccion) {
		this.oCEProyeccion = oCEProyeccion;
	}

	public CEFormula getoCEFormulaResponse() {
		return oCEFormulaResponse;
	}

	public void setoCEFormulaResponse(CEFormula oCEFormulaResponse) {
		this.oCEFormulaResponse = oCEFormulaResponse;
	}

	public CESaldoAfiliado getoCESaldo() {
		return oCESaldo;
	}

	public void setoCESaldo(CESaldoAfiliado oCESaldo) {
		this.oCESaldo = oCESaldo;
	}

	public CDLoadData getoData() {
		return oData;
	}

	public void setoData(CDLoadData oData) {
		this.oData = oData;
	}

	public CUInteres getoCUInteres() {
		return oCUInteres;
	}

	public void setoCUInteres(CUInteres oCUInteres) {
		this.oCUInteres = oCUInteres;
	}

	public void setOaListProyeccion(ArrayList<CEProyeccion> oaListProyeccion) {
		this.oaListProyeccion = oaListProyeccion;
	}

}
