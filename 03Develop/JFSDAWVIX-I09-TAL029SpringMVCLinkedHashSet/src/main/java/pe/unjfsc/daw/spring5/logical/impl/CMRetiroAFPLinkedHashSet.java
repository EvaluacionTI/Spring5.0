package pe.unjfsc.daw.spring5.logical.impl;

import java.util.LinkedHashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;
import pe.unjfsc.daw.spring5.logical.CICrudLSA;

public class CMRetiroAFPLinkedHashSet implements CICrudLSA{
	private static final Logger LOG = LoggerFactory.getLogger("CMRetiroAFPLinkedHashSet");
	
	public LinkedHashSet<CESaldoAfiliado> moHashAreaLateral;
	
	public CMRetiroAFPLinkedHashSet() {
		moHashAreaLateral = new LinkedHashSet<CESaldoAfiliado>();
		
		moHashAreaLateral.add(new CESaldoAfiliado(1, "2000", 27500.05));
		moHashAreaLateral.add(new CESaldoAfiliado(2, "2000", 27500.05));
		moHashAreaLateral.add(new CESaldoAfiliado(3, "2000", 92500.05));
		moHashAreaLateral.add(new CESaldoAfiliado(4, "2000", 82500.05));
		moHashAreaLateral.add(new CESaldoAfiliado(5, "2000", 72500.05));
		moHashAreaLateral.add(new CESaldoAfiliado(6, "2000", 62500.05));
		moHashAreaLateral.add(new CESaldoAfiliado(7, "2000", 52500.05));
		moHashAreaLateral.add(new CESaldoAfiliado(8, "2000", 42500.05));
		moHashAreaLateral.add(new CESaldoAfiliado(9, "2000", 32500.05));
		moHashAreaLateral.add(new CESaldoAfiliado(10, "2000", 22500.05));
		moHashAreaLateral.add(new CESaldoAfiliado(11, "2000", 12500.05));
		LOG.info("[EVL] LinkedHashSet : {}", moHashAreaLateral.size());
	}
	
	public void saveRetiro(CESaldoAfiliado poLSA) {
		// TODO Auto-generated method stub
		
	}

	public void updateRetiro(CESaldoAfiliado poLSA) {
		// TODO Auto-generated method stub
		
	}

	public void deleteRetiro(int pId) {
		// TODO Auto-generated method stub
		
	}

	public LinkedHashSet<CESaldoAfiliado> consultAll() {
		return moHashAreaLateral;
	}

	public CESaldoAfiliado consultaById(int pId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setMoHashAreaLateral(LinkedHashSet<CESaldoAfiliado> moHashAreaLateral) {
		this.moHashAreaLateral = moHashAreaLateral;
	}

}
