package pe.unjfsc.daw.spring5.logical;

import java.util.HashMap;

import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;

public interface CIRetiroAFP25 {
	public void saveRetiro(String psCodigoMap, CESaldoAfiliado poLSA);
	public void updateRetiro(String psCodigoMap, CESaldoAfiliado poLSA);
	public void deleteRetiro(String psCodigoMap);

	public HashMap<String, CESaldoAfiliado> consultAll();
	public CESaldoAfiliado consultaById(int pId);
}
