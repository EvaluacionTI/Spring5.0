package pe.bbva.evalua.spring5.model;

import java.util.ArrayList;

import pe.bbva.evalua.spring5.entity.CESaldoAfiliadoCustom;

public interface CIRetiroAFP25ArrayList {
	
	public void saveRetiroArrayList(CESaldoAfiliadoCustom poCESaldoAfiliado);
	public void updateRetiroArrayList(CESaldoAfiliadoCustom poCESaldoAfiliado);
	public void deleteRetiroArrayList(int pId);

	public ArrayList<CESaldoAfiliadoCustom> consultaAllRetiroArrayList();
	public CESaldoAfiliadoCustom consultaByIdRetiroArrayList(int pId);
}
