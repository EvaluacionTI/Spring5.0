package pe.bbva.evalua.spring5.modelo;

public class CDSaldoAfiliado {
	double[] saldoCIC;
	public CDSaldoAfiliado() {
		saldoCIC = new double[100];
		
		saldoCIC[0]=3500.00;
		saldoCIC[1]=4500.00;
		saldoCIC[2]=5500.00;
		saldoCIC[3]=0.00;
		saldoCIC[4]=7800.00;
		saldoCIC[5]=8500.00;
		saldoCIC[6]=9500.00;
		saldoCIC[7]=10500.00;
		saldoCIC[8]=11500.00;
		saldoCIC[9]=0.00;
		saldoCIC[10]=13500.00;
		saldoCIC[11]=14500.00;
		saldoCIC[12]=16500.00;
		saldoCIC[13]=17500.00;
		saldoCIC[14]=0.00;
		saldoCIC[15]=19500.00;
		saldoCIC[16]=23500.00;
		saldoCIC[17]=33500.00;
		saldoCIC[18]=0.00;
		saldoCIC[19]=53500.00;
		saldoCIC[20]=55500.00;
	}
	
	public double[] saldoAfiliado(){
		return saldoCIC;
	}
}
