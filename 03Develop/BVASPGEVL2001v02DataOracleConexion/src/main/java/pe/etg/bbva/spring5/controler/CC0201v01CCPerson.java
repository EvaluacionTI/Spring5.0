package pe.etg.bbva.spring5.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pe.etg.bbva.spring5.entity.CEPerson;
import pe.etg.bbva.spring5.model.CI0201v01Person;

public class CC0201v01CCPerson {
	
	@Autowired
	private CI0201v01Person oCIPerson;
	
	public void savePerson(CEPerson t) {
		oCIPerson.save(t);
	};
	
	public void update(CEPerson t) {
		oCIPerson.update(t);
	}
	
	public void delete(long id) {
		oCIPerson.delete(id);
	}
	
	public CEPerson load(long id) {
		return oCIPerson.load(id);
	}
	
	public List<CEPerson> loadAll(){
		return oCIPerson.loadAll();
	}
}
