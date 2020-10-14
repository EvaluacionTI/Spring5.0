package pe.unjfsc.daw.spring5.logical.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;
import pe.unjfsc.daw.spring5.logical.CICrudLSA;

public class CMRetiroAFPLinkedHashSet implements CICrudLSA{
	private static final Logger LOG = LoggerFactory.getLogger("CMRetiroAFPLinkedHashSet");
	
	private LinkedHashSet<CESaldoAfiliado> moHashAreaLateral;
	private CESaldoAfiliado moCESaldoAfilidado;
	
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
		moHashAreaLateral.add(new CESaldoAfiliado(poLSA.getId(), poLSA.getCodigoAfiliado(), poLSA.getSaldoCIC()));
	}

	public void updateRetiro(CESaldoAfiliado poLSA) {
		Iterator<CESaldoAfiliado> it = moHashAreaLateral.iterator();
		while(it.hasNext()) {
			moCESaldoAfilidado = new CESaldoAfiliado();
			moCESaldoAfilidado = it.next();
			if (moCESaldoAfilidado.getId()==poLSA.getId()) {
				moCESaldoAfilidado.setCodigoAfiliado(poLSA.getCodigoAfiliado());
				moCESaldoAfilidado.setSaldoCIC(poLSA.getSaldoCIC());
				break;
			}
		}
				
	}

	public void deleteRetiro(int pId) {
		Iterator<CESaldoAfiliado> it = moHashAreaLateral.iterator();
		while(it.hasNext()) {
			moCESaldoAfilidado = new CESaldoAfiliado();
			moCESaldoAfilidado = it.next();
			if (moCESaldoAfilidado.getId()==pId) {
				moHashAreaLateral.remove(moCESaldoAfilidado);
				break;
			}
		}
	}

	public LinkedHashSet<CESaldoAfiliado> consultAll() {
		LOG.info("[EVL] consultAll : {}", moHashAreaLateral.size());
		return moHashAreaLateral;
	}

	public CESaldoAfiliado consultaById(int pId) {
		CESaldoAfiliado oCESaldoAfilidado = null;
		CESaldoAfiliado oCESaldoResult = null;
		
		Iterator<CESaldoAfiliado> it = moHashAreaLateral.iterator();
		while(it.hasNext()) {
			oCESaldoAfilidado = new CESaldoAfiliado();
			oCESaldoAfilidado = it.next();
			if (oCESaldoAfilidado.getId()==pId) {
				oCESaldoResult = new CESaldoAfiliado();
				oCESaldoResult = oCESaldoAfilidado;
				break;
			}
		}
		return oCESaldoResult;
	}

	public void setMoHashAreaLateral(LinkedHashSet<CESaldoAfiliado> moHashAreaLateral) {
		this.moHashAreaLateral = moHashAreaLateral;
	}

}
