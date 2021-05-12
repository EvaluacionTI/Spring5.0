package pe.bbva.evalua.spring5.model;

public interface CIRetiroAFP25 {
	
	public void saveRetiroDimensional(Object[][] poData);
	public void updateRetiroDimensional(Object[][] poData);
	public void deleteRetiroDimensional(int pId);
	public Object[][] consultaAllRetiroDimensional();
	public Object[][] consultaByIdRetiroDimensional(int pId);
}
