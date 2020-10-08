package pe.unjfsc.daw.spring5.logical.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEFormula;
import pe.unjfsc.daw.spring5.entity.CEMeses;
import pe.unjfsc.daw.spring5.entity.CEProyeccion;
import pe.unjfsc.daw.spring5.entity.CEUnionListas;
import pe.unjfsc.daw.spring5.logical.CIProyeccion;
import pe.unjfsc.daw.spring5.model.CDLoadData;

public class CMProyeccion implements CIProyeccion{
	private static final Logger LOG = LoggerFactory.getLogger("CMProyeccion");
	
	private CEFormula oCEFormulaResponse;
	private CDLoadData oData;
	
	@Override
	public CEFormula buscarTasa(CEMeses poCEMes) {
		LOG.info("[EVL] Instancia CEFormula : {}", oCEFormulaResponse);
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
	
	public void setoCEFormulaResponse(CEFormula oCEFormulaResponse) {
		this.oCEFormulaResponse = oCEFormulaResponse;
	}

	public void setoData(CDLoadData oData) {
		this.oData = oData;
	}

	@Override
	public CEProyeccion calcularFactor(CEFormula poCEFormula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CEUnionListas llenarListas(CEProyeccion oCEProyeccion) {
		// TODO Auto-generated method stub
		return null;
	}



}
