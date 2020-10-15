package pe.unjfsc.daw.spring5.model;

import java.util.List;

import pe.unjfsc.daw.spring5.entity.CE01TipoPlan;

public interface CI01TipoPlan {
	// 1. Mantenimiento que no retorna ningun valor
	public void grabarTipoPlan(CE01TipoPlan poCETipoPlan);
	public void actualizarTipoPlan(CE01TipoPlan poCETipoPlan);
	public void eliminarTipoPlan(String psCodigo);

	// 2. Buscar informaci�n 
	public CE01TipoPlan buscarTipoPlan(String psCodigo);

	// 3. Listar toda la informaci�n
	public List<CE01TipoPlan> listaAllTipoPlan();

}
