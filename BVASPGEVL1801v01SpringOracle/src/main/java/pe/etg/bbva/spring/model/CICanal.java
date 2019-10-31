package pe.etg.bbva.spring.model;

import java.util.List;

public interface CICanal<T> {
	void saveCanal(T poT);
	T loadCanal(String psCodigoCanal);
	void deleteCanal(String psCodigoCanal);
	List<T> loadAllCanal();
}
