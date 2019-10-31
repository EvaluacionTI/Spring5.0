package pe.etg.bbva.spring.model.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.etg.bbva.spring.entity.Person;
import pe.etg.bbva.spring.model.Dao;

public class PersonDao implements Dao<Person>{
	@Autowired
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    
    @PostConstruct
    private void postConstruct() {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

	@Override
	public void save(Person person) {
		String sql = "insert into Person values (sq_person.nextval, ?, ?, ?)";
        jdbcTemplate.update(sql, person.getFirstName(),
                person.getLastName(), person.getAddress());
		
	}

	@Override
	public Person load(long id) {
		List<Person> persons = jdbcTemplate.query("select * from Person where id =?",
                new Object[]{id}, (resultSet, i) -> {
                    return toPerson(resultSet);
                });

        if (persons.size() == 1) {
            return persons.get(0);
        }
        return null;
	}

	@Override
	public void delete(long id) {
		jdbcTemplate.update("delete from PERSON where id = ?", id);
		
	}

	@Override
	public void update(Person t) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public List<Person> loadAll() {
		return jdbcTemplate.query("select * from Person", (resultSet, i) -> {
            return toPerson(resultSet);
        });
	}

	private Person toPerson(ResultSet resultSet) throws SQLException {
        Person person = new Person();
        person.setId(resultSet.getLong("ID"));
        person.setFirstName(resultSet.getString("FIRST_NAME"));
        person.setLastName(resultSet.getString("LAST_NAME"));
        person.setAddress(resultSet.getString("ADDRESS"));
        return person;
    }
}
