package pe.etg.bbva.spring.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.etg.bbva.spring.entity.CEPerson;
import pe.etg.bbva.spring.model.CICrudGeneral;

@Component
public class CCPerson {
	
	@Autowired
	private CICrudGeneral<CEPerson> personDao;

	public void process() {
        List<CEPerson> list = personDao.loadAll();
        System.out.println("Loaded all: " + list);

        CEPerson person = CEPerson.create("Illari", "Lakshmi", "Av. Cañete 2208");
        System.out.println("saving: "+person);
        personDao.save(person);

        person = CEPerson.create("Sayrik", "Cristobal", "Av. 15 Enero 0930");
        System.out.println("saving: "+person);
        personDao.save(person);

        List<CEPerson> list2 = personDao.loadAll();
        System.out.println("Loaded all: " + list2);
	}
}
