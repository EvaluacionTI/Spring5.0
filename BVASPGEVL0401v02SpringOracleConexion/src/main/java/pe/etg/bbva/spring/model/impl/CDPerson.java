package pe.etg.bbva.spring.model.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.etg.bbva.spring.entity.CEPerson;
import pe.etg.bbva.spring.model.CICrudGeneral;

public class CDPerson implements CICrudGeneral<CEPerson> {
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@PostConstruct
    private void postConstruct() {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	public void save(CEPerson t) {
		String sql = "INSERT INTO APXt01_Person VALUES (sq_person.nextval, ?, ?, ?)";
        jdbcTemplate.update(sql, t.getFirstName(), t.getLastName(), t.getAddress());
	}

	public CEPerson load(long id) {
		List<CEPerson> persons = jdbcTemplate.query("select * from Person where id =?",
                new Object[]{id}, (resultSet, i) -> {
                    return toPerson(resultSet);
                });

        if (persons.size() == 1) {
            return persons.get(0);
        }
        return null;
	}

	public void delete(long id) {
		jdbcTemplate.update("DELETE FROM APXt01_Person WHERE id = ?", id);
	}

	public void update(CEPerson t) {
		throw new UnsupportedOperationException();
	}

	public List<CEPerson> loadAll() {
		return jdbcTemplate.query("SELECT * FROM APXt01_Person", (resultSet, i) -> {
            return toPerson(resultSet);
        });
	}

    private CEPerson toPerson(ResultSet resultSet) throws SQLException {
    	CEPerson oCEPerson = new CEPerson();
    	oCEPerson.setId(resultSet.getLong("ID"));
    	oCEPerson.setFirstName(resultSet.getString("FIRST_NAME"));
    	oCEPerson.setLastName(resultSet.getString("LAST_NAME"));
    	oCEPerson.setAddress(resultSet.getString("ADDRESS"));
        return oCEPerson;
    }	
}
