package pe.unjfsc.daw.spring5.logical.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CECliente;
import pe.unjfsc.daw.spring5.entity.CECompraEfectuada;
import pe.unjfsc.daw.spring5.entity.CEProducto;
import pe.unjfsc.daw.spring5.logical.CIMostrarListado;
import pe.unjfsc.daw.spring5.model.CDLoadData;

public class CMListadoUltimoRincon implements CIMostrarListado{
private static final Logger LOG = LoggerFactory.getLogger("CMListadoUltimoRincon");
	
	private HashSet<CEProducto> moHashSet;
	private ArrayList<CECliente> moArrayList;
	private LinkedHashSet<CECompraEfectuada> moLinkedHashSet;
	
	private CDLoadData oCDLoadData;
	
	@Override
	public HashSet<CEProducto> listaProducto() {
		LOG.info("[EVL] Instacia CDLoadData : {}", oCDLoadData);
		moHashSet = oCDLoadData.loadProducto();
		LOG.info("[EVL] Read data CDLoadData : {}", moHashSet.size());
		return moHashSet;
	}

	@Override
	public ArrayList<CECliente> listaCliente() {
		LOG.info("[EVL] Instacia CDLoadData : {}", oCDLoadData);
		moArrayList = oCDLoadData.loadCliente();
		LOG.info("[EVL] Read data CDLoadData : {}", moArrayList.size());
		return moArrayList;
	}


	@Override
	public LinkedHashSet<CECompraEfectuada> listaCompraEfectuada() {
		LOG.info("[EVL] Instacia CDLoadData : {}", oCDLoadData);
		moLinkedHashSet = oCDLoadData.loadCompraEfectuadas();
		LOG.info("[EVL] Read data CDLoadData : {}", moLinkedHashSet.size());
		return moLinkedHashSet;	}
	
	public void setoCDLoadData(CDLoadData oCDLoadData) {
		this.oCDLoadData = oCDLoadData;
	}

}
