package pe.etg.bbva.spring.model;

import java.sql.SQLException;
import java.util.List;

import pe.etg.bbva.spring.entity.CE01TipoPlan;

public interface CI01TipoPlan {

	// 1. Mantenimiento que no retorna ningun valor
	public void grabarTipoPlan(CE01TipoPlan poCETipoPlan) throws SQLException;
	public void actualizarTipoPlan(CE01TipoPlan poCETipoPlan) throws SQLException;
	public void eliminarTipoPlan(String psCodigo) throws SQLException;

	// 2. Buscar información 
	public CE01TipoPlan buscarTipoPlan(String psCodigo) throws SQLException;

	// 3. Listar toda la información
	public List<CE01TipoPlan> listaAllTipoPlan() throws SQLException;

}
