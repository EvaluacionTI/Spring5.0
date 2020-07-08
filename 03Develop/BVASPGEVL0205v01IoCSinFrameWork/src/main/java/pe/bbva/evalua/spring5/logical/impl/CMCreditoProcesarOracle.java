package pe.bbva.evalua.spring5.logical.impl;

import pe.bbva.evalua.spring5.logical.CICreditoProcesar;

public class CMCreditoProcesarOracle implements CICreditoProcesar {

	public void insertarCredito() {
		System.out.println("Insertar Crédito a Procesar Oracle");
		
	}

	public void eliminarCredito(int id) {
		System.out.println("Eliminar Crédito a Procesar Oracle : " + id);
	}
}
