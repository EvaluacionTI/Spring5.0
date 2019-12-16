package pe.etg.bbva.spring.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.etg.bbva.spring.entity.Person;
import pe.etg.bbva.spring.model.Dao;

@Component("pe.bbva.architecture")
public class PersonClient {
	
	@Autowired
    Dao<Person> personDao;
	
	public void process() {
        List<Person> list = personDao.loadAll();
        System.out.println("Loaded all: " + list);

        Person person = Person.create("Dana", "Whitley", "464 Gorsuch Drive");
        System.out.println("saving: "+person);
        personDao.save(person);

        person = Person.create("Robin", "Cash", "64 Zella Park");
        System.out.println("saving: "+person);
        personDao.save(person);

        List<Person> list2 = personDao.loadAll();
        System.out.println("Loaded all: " + list2);

    }
}
