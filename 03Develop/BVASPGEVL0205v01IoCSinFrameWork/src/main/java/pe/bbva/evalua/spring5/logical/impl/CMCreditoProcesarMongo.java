package pe.bbva.evalua.spring5.logical.impl;

import pe.bbva.evalua.spring5.logical.CICreditoProcesar;

public class CMCreditoProcesarMongo implements CICreditoProcesar {

	public void insertarCredito() {
		System.out.println("Insertar Crédito a Procesar Mongo");
		
	}

	public void eliminarCredito(int id) {
		System.out.println("Eliminar Crédito a Procesar Mongo :" + id);
	}
}
