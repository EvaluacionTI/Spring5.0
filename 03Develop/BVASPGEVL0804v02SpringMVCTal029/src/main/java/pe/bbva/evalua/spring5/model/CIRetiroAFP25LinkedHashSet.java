package pe.bbva.evalua.spring5.model;

import java.util.LinkedHashSet;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;

public interface CIRetiroAFP25LinkedHashSet {
	
	public void saveRetiroLinkedHashSet(CESaldoAfiliadoCustom poCESaldoAfiliado);
	public void updateRetiroLinkedHashSet(CESaldoAfiliadoCustom poCESaldoAfiliado);
	public void deleteRetiroLinkedHashSet(int pId);

	public LinkedHashSet<CESaldoAfiliadoCustom> consultaAllRetiroLinkedHashSe();
	public CESaldoAfiliadoCustom consultaByIdRetiroLinkedHashSe(int pId);
}
