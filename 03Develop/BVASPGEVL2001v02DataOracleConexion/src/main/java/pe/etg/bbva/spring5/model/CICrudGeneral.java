package pe.etg.bbva.spring.model;

import java.util.List;

public interface CICrudGeneral<T> {

	void save(T t);

    T load(long id);

    void delete(long id);

    void update(T t);

    List<T> loadAll();
}
