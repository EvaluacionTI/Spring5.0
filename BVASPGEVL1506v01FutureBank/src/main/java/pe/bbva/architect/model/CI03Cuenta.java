package pe.bbva.architect.model;

import java.util.List;

public interface CI03Cuenta<T> {
	void saveCuente(T poT);
	T loadCuenta(int piIdCuenta);
	void deleteCuenta(int piIdCuenta);
	T loadCuentaById(int piIdCuenta);
	List<T> loadAllCuenta();
}
