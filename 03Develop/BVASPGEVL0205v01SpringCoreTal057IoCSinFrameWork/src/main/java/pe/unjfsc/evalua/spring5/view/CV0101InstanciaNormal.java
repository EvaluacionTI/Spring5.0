package pe.unjfsc.evalua.spring5.view;

import pe.bbva.evalua.spring5.logical.CLCreditoProcesar;

public class CV0101InstanciaNormal {

	public static void main(String[] args) {
		CLCreditoProcesar oCreditoProcesar = new CLCreditoProcesar();
	
		oCreditoProcesar.insertarCreditoProcesar();
		
		oCreditoProcesar.deleteCreditoProcesar(5);
	}
}
