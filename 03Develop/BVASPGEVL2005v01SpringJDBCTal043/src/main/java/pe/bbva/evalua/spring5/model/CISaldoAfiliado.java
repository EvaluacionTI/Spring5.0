package pe.bbva.evalua.spring5.model;

import java.util.List;

public interface CISaldoAfiliado<T> {
	// 1. Mantenimiento que no retorna ningun valor
	public void grabar(T poT);
	public void actualizar(T poT);
	public void eliminar(int piId);

	// 2. Buscar informaci�n 
	public T buscarById(int piId);

	// 3. Listar toda la informaci�n
	public List<T> listarAll();

}
