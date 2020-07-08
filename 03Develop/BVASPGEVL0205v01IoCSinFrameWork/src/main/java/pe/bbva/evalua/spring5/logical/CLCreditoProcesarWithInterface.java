package pe.bbva.evalua.spring5.logical;

public class CLCreditoProcesarWithInterface {

	CICreditoProcesar oCredito;
	
	public CLCreditoProcesarWithInterface(CICreditoProcesar poCredito) {
		this.oCredito = poCredito;
	}
	
	public void getInsertarSaldo() {
		oCredito.insertarCredito();
	}
	
	public void getEliminarSaldo(int pid) {
		oCredito.eliminarCredito(pid);;
	}
}
