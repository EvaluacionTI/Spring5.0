package pe.bbva.evalua.spring5.logical;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliado;

public interface CIRetiroAFP {

	public double saldoDisponible(CESaldoAfiliado poCESaldo);
	
	public double[] listaSaldoBucleWhile(double[] paSaldoCIC);
	
	public double[] listaSaldoBucleDoWhile(double[] paSaldoCIC);
	
	public double[] listaSaldoFor(double[] paSaldoCIC);
}
