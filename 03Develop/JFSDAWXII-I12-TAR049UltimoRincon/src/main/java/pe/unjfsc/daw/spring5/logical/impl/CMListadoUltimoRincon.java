package pe.unjfsc.daw.spring5.logical.impl;

import java.util.HashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEProducto;
import pe.unjfsc.daw.spring5.logical.CIMostrarListado;
import pe.unjfsc.daw.spring5.model.CDLoadData;

public class CMListadoUltimoRincon implements CIMostrarListado{
private static final Logger LOG = LoggerFactory.getLogger("CMListadoUltimoRincon");
	
	private HashSet<CEProducto> moHashSet;
	private CDLoadData oCDLoadData;
	private CEProducto oCEProducto;
	
	@Override
	public HashSet<CEProducto> listaProducto() {
		LOG.info("[EVL] Instacia CDLoadData : {}", oCDLoadData);
		moHashSet = oCDLoadData.loadProducto();
		LOG.info("[EVL] Read data CDLoadData : {}", moHashSet.size());
		return moHashSet;
	}

	public void setoCEProducto(CEProducto oCEProducto) {
		this.oCEProducto = oCEProducto;
	}

	public void setoCDLoadData(CDLoadData oCDLoadData) {
		this.oCDLoadData = oCDLoadData;
	}

}
