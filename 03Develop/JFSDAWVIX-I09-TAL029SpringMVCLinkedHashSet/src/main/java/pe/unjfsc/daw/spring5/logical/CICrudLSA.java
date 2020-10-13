package pe.unjfsc.daw.spring5.logical;

import java.util.LinkedHashSet;

import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;


public interface CICrudLSA {
	public void saveRetiro(CESaldoAfiliado poLSA);
	public void updateRetiro(CESaldoAfiliado poLSA);
	public void deleteRetiro(int pId);

	public LinkedHashSet<CESaldoAfiliado> consultAll();
	public CESaldoAfiliado consultaById(int pId);
}
