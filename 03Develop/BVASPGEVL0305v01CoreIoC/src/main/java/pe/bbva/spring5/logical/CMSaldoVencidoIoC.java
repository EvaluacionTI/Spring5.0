package pe.bbva.spring5.logical;

public class CMSaldoVencidoIoC {

	CIMovimiento oMovimiento;
	
	public CMSaldoVencidoIoC(CIMovimiento poMovimiento) {
		this.oMovimiento = poMovimiento;
	}
	
	public void getInsertarSaldo() {
		oMovimiento.insertar();
	}
	
	public void getEliminarSaldo(int pid) {
		oMovimiento.eliminar(pid);
	}
}
