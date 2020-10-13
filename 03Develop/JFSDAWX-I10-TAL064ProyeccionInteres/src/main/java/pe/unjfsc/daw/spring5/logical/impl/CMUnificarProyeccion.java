package pe.unjfsc.daw.spring5.logical.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEFormula;
import pe.unjfsc.daw.spring5.entity.CEMeses;
import pe.unjfsc.daw.spring5.entity.CEProyeccion;
import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;
import pe.unjfsc.daw.spring5.entity.CEUnionListas;
import pe.unjfsc.daw.spring5.logical.CIUnificarListas;
import pe.unjfsc.daw.spring5.model.CDLoadData;
import pe.unjfsc.daw.spring5.utility.CUInteres;

public class CMUnificarProyeccion implements CIUnificarListas {
	private static final Logger LOG = LoggerFactory.getLogger("CMUnificarProyeccion");
	
	private CEProyeccion oCEProyeccion;
	private CEFormula oCEFormulaResponse;
	private CESaldoAfiliado oCESaldo;
	private CEUnionListas oCEMerge;
	
	private CDLoadData oData;
	
	private CUInteres oCUInteres;
	
	private HashSet<CEProyeccion> oaListHashSet;
	private LinkedHashSet<CEProyeccion> oaListLnkSet;
	
	private ArrayList<CEProyeccion> oaListProyeccion;
	private List<CEProyeccion> oList;
	private LinkedList<CEProyeccion> oListLnk;
	
	@Override
	public CEUnionListas llenarListas(CEMeses poCEMes) {

		oListLnk = new LinkedList<CEProyeccion>();
		
		for (CESaldoAfiliado oItem : oData.getoRequestListAfiliado()) {
			oCEProyeccion = unificarListas(oItem, poCEMes);
		
			oaListHashSet.add(oCEProyeccion);
			oaListLnkSet.add(oCEProyeccion);
			
			oaListProyeccion.add(oCEProyeccion);
			oList.add(oCEProyeccion);
			oListLnk.add(oCEProyeccion);
		}
		
		oCEMerge.setoListHashSet(oaListHashSet);
		oCEMerge.setoListLnkSet(oaListLnkSet);
		
		oCEMerge.setoListArray(oaListProyeccion);
		oCEMerge.setoList(oList);
		oCEMerge.setoListLnk(oListLnk);
	
		return oCEMerge;
	}
	
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
	
	protected CEProyeccion unificarListas(CESaldoAfiliado poSaldoCIC, CEMeses poCEMes) {
		double dInteresCompleto, dIntereSinFeriado;
		oCEFormulaResponse = buscarTasa(poCEMes);
		LOG.info("[EVL] Response de tasa en CEFormula : {}", oCEFormulaResponse);
		
		oCEFormulaResponse = oCUInteres.calcularFactor(oCEFormulaResponse);
		LOG.info("[EVL] New Response de tasa en CEFormula : {}", oCEFormulaResponse);
		
			LOG.info("[EVL] Read Saldo : {}", poSaldoCIC.getSaldoCIC()); 
			oCEProyeccion.setoCESaldo(poSaldoCIC);	
			oCEProyeccion.setoCEFormula(oCEFormulaResponse);
			LOG.info("[EVL] Begin CEProyeccion  : {}", oCEProyeccion);
			dInteresCompleto = oCUInteres.calculoInteres(oCEFormulaResponse.getFactor(), poSaldoCIC.getSaldoCIC());
			dIntereSinFeriado = oCUInteres.calculoInteres(oCEFormulaResponse.getFactorSinFeriado(), poSaldoCIC.getSaldoCIC());
			
			oCEProyeccion.setInteresCompleto(dInteresCompleto);
			oCEProyeccion.setInteresSinFeriado(dIntereSinFeriado);
			oCEProyeccion.setDiferenciaInteres(dInteresCompleto-dIntereSinFeriado);
			oCEProyeccion.setSaldoFinal(poSaldoCIC.getSaldoCIC() + dInteresCompleto);
		
		return oCEProyeccion;
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

	public void setoCEMerge(CEUnionListas oCEMerge) {
		this.oCEMerge = oCEMerge;
	}

	public void setoData(CDLoadData oData) {
		this.oData = oData;
	}

	public void setoCUInteres(CUInteres oCUInteres) {
		this.oCUInteres = oCUInteres;
	}

	public void setOaListHashSet(HashSet<CEProyeccion> oaListHashSet) {
		this.oaListHashSet = oaListHashSet;
	}

	public void setOaListLnkSet(LinkedHashSet<CEProyeccion> oaListLnkSet) {
		this.oaListLnkSet = oaListLnkSet;
	}

	public void setOaListProyeccion(ArrayList<CEProyeccion> oaListProyeccion) {
		this.oaListProyeccion = oaListProyeccion;
	}

	public void setoList(List<CEProyeccion> oList) {
		this.oList = oList;
	}

	public LinkedList<CEProyeccion> getoListLnk() {
		return oListLnk;
	}
}
