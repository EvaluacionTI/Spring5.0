package pe.unjfsc.daw.spring5.model;

public class CDSaldoAfiliado {
	private double[] saldoCIC;
	
	public CDSaldoAfiliado() {
		saldoCIC = new double[100];
		
		saldoCIC[0]=3500.00;
		saldoCIC[1]=4500.00;
		saldoCIC[2]=7500.00;
		saldoCIC[3]=8500.00;
		saldoCIC[4]=17500.00;
		saldoCIC[5]=67000.00;
		saldoCIC[6]=53500.00;
		saldoCIC[7]=13500.00;
		saldoCIC[8]=11500.00;
		saldoCIC[9]=0.00;
		saldoCIC[10]=0.00;
		saldoCIC[11]=21040.00;
	}
	
	public double[] saldoAfiliado() {
		return saldoCIC;
	}
}
