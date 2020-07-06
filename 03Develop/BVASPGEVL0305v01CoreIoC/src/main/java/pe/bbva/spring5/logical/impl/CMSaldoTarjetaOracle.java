package pe.bbva.spring5.logical.impl;

import pe.bbva.spring5.logical.CIMovimiento;

public class CMSaldoTarjetaOracle implements CIMovimiento {

	@Override
	public void insertar() {
		System.out.println("Grabar Oracle");
		
	}

	@Override
	public void eliminar(int id) {
		System.out.println("Eliminarr Oracle");
		
	}

}
