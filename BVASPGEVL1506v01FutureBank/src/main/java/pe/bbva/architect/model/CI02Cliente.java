package pe.bbva.architect.model;

import java.util.List;

public interface CI02Cliente<T> {
	void saveCliente(T poT);
	T loadCliente(int piIdCliente);
	void deleteCliente(int piIdCliente);
	List<T> loadAllCliente();
	T loadClienteById(int piIdCliente);
}
