package pe.bbva.evalua.spring5.model;

import java.util.HashMap;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;

public interface CIRetiroAFP25HashMap {
	
	public void saveRetiroHashMap(String psCodigoMap, CESaldoAfiliadoCustom poCESaldoAfiliado);
	public void updateRetiroHashMap(String psCodigoMap, CESaldoAfiliadoCustom poCESaldoAfiliado);
	public void deleteRetiroHahMap(String psCodigoMap);

	public HashMap<String, CESaldoAfiliadoCustom> consultaAllRetiroHashMap();
	public CESaldoAfiliadoCustom consultaByIdRetiroHashMap(int pId);
}
