package pe.etg.bbva.spring5.model;

import java.util.List;

import pe.etg.bbva.spring5.entity.CEPerson;

public interface CI0201v01Person {
	void save(CEPerson poCEPerson);

	CEPerson load(long id);

    void delete(long id);

    void update(CEPerson poCEPerson);

    List<CEPerson> loadAll();
}
