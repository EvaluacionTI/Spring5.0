package pe.etg.bbva.spring5.model;

import java.util.List;

import pe.etg.bbva.spring5.entity.CE01TipoPlan;

public interface CI03JdbcDaoSupportTipoPlan {

	// 1. Mantenimiento que no retorna ningun valor
	public void grabarTipoPlan(CE01TipoPlan poCETipoPlan);
	public void actualizarTipoPlan(CE01TipoPlan poCETipoPlan);
	public void eliminarTipoPlan(String psCodigo);

	// 2. Buscar información 
	public CE01TipoPlan buscarTipoPlan(String psCodigo);

	// 3. Listar toda la información
	public List<CE01TipoPlan> listaAllTipoPlan();

}
