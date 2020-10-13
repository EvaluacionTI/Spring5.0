package pe.unjfsc.daw.spring5.model;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEMeses;
import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;

public class CDLoadData {
	private static final Logger LOG = LoggerFactory.getLogger("CDLoadData");
	
	private ArrayList<CEMeses> oResquestListMeses;
	private List<CESaldoAfiliado> oRequestListAfiliado;
	
	public CDLoadData() {
		oResquestListMeses = beginMeses();
		oRequestListAfiliado = beginSaldoAfiliado();
		LOG.info("[EVL] Numero de meses {} {}", oResquestListMeses.size());
		LOG.info("[EVL] Numero de Afiliados {} {}", oRequestListAfiliado.size());
	}
	
	protected ArrayList<CEMeses> beginMeses() {
		ArrayList<CEMeses> oListMeses = new ArrayList<CEMeses>();
		
		oListMeses.add(new CEMeses(1, "ENERO", 31, 1, 0.5));
		oListMeses.add(new CEMeses(2, "FEBRERO", 31, 1, 0.5));
		oListMeses.add(new CEMeses(3, "MARZO", 31, 1, 0.5));
		oListMeses.add(new CEMeses(4, "ABRIL", 31, 1, 0.5));
		oListMeses.add(new CEMeses(5, "MAYO", 31, 1, 0.5));
		oListMeses.add(new CEMeses(6, "JUNIO", 31, 1, 0.5));
		oListMeses.add(new CEMeses(7, "JULIO", 31, 1, 0.5));
		oListMeses.add(new CEMeses(8, "AGOSTO", 31, 1, 0.5));
		oListMeses.add(new CEMeses(9, "SETIEMBRE", 31, 1, 0.5));
		oListMeses.add(new CEMeses(10, "OCTUBRE", 31, 1, 0.057));
		oListMeses.add(new CEMeses(11, "NOVIEMBRE", 30, 1, 0.0586));
		oListMeses.add(new CEMeses(12, "DICIEMBRE", 31, 1, 0.0699));
		
		return oListMeses;
	}
	
	protected List<CESaldoAfiliado> beginSaldoAfiliado(){
		List<CESaldoAfiliado> oListSaldo = new ArrayList<>();
		
		oListSaldo.add(new CESaldoAfiliado("A8398","Aportante 1",	189383.98));
		oListSaldo.add(new CESaldoAfiliado("A8399","Aportante 2",	3485.43));
		oListSaldo.add(new CESaldoAfiliado("A8497","Aportante 3",	8728023.98));
		oListSaldo.add(new CESaldoAfiliado("A8697","Aportante 4",	8475.87));
		oListSaldo.add(new CESaldoAfiliado("A8897","Aportante 5",	4509.9));
		oListSaldo.add(new CESaldoAfiliado("B9893","Aportante 6",	00.99));
		oListSaldo.add(new CESaldoAfiliado("C9483","Aportante 7",	847.74));
		oListSaldo.add(new CESaldoAfiliado("D9842","Aportante 8",173647.94));
		oListSaldo.add(new CESaldoAfiliado("E8484","Aportante 9",	2000048.4));
		oListSaldo.add(new CESaldoAfiliado("F8483","Aportante 10", 94849.86));
				
		return oListSaldo;
	}

	public ArrayList<CEMeses> getoResquestListMeses() {
		return oResquestListMeses;
	}

	public void setoResquestListMeses(ArrayList<CEMeses> oResquestListMeses) {
		this.oResquestListMeses = oResquestListMeses;
	}

	public List<CESaldoAfiliado> getoRequestListAfiliado() {
		return oRequestListAfiliado;
	}

	public void setoRequestListAfiliado(List<CESaldoAfiliado> oRequestListAfiliado) {
		this.oRequestListAfiliado = oRequestListAfiliado;
	}
}
