package pe.bbva.evalua.spring5.model;

import java.util.HashSet;
import java.util.TreeSet;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;

public interface CIRetiroAFP25HashSet {
	
	public void saveRetiroHashSet(CESaldoAfiliadoCustom poCESaldoAfiliado);
	public void updateRetiroHashSet(CESaldoAfiliadoCustom poCESaldoAfiliado);
	public void deleteRetiroHashSet(int pId);

	public HashSet<CESaldoAfiliadoCustom> consultaAllRetiroHashSet();
	public CESaldoAfiliadoCustom consultaByIdRetiroHashSet(int pId);
	
	public TreeSet<CESaldoAfiliadoCustom> consultaAllRetiroTreeSet();
}
