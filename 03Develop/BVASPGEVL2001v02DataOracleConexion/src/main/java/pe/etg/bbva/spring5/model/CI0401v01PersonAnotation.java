package pe.etg.bbva.spring5.model;

import java.util.List;

import pe.etg.bbva.spring5.entity.CEPerson;

public interface CI0401v01PersonAnotation {
	void save(CEPerson poCEPerson);

	CEPerson load(long id);

    void delete(long id);

    void update(CEPerson poCEPerson);

    List<CEPerson> loadAll();
}
