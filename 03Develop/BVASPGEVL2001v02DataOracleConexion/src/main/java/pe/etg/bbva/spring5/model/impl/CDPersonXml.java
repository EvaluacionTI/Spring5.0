package pe.etg.bbva.spring5.model.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import pe.etg.bbva.spring5.entity.CEConstanteSQL;
import pe.etg.bbva.spring5.entity.CEPerson;
import pe.etg.bbva.spring5.model.CICrudGeneral;

public class CDPersonXml implements CICrudGeneral<CEPerson> {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@PostConstruct
    private void postConstruct() {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	public void save(CEPerson t) {
        jdbcTemplate.update(CEConstanteSQL.SQL_INSERT_PERSON, t.getFirstName(), t.getLastName(), t.getAddress());
	}

	public CEPerson load(long id) {
		List<CEPerson> persons = jdbcTemplate.query(CEConstanteSQL.SQL_SELECT_PERSON_BY_ID,
                new Object[]{id}, (resultSet, i) -> {
                    return toPerson(resultSet);
                });

        if (persons.size() == 1) {
            return persons.get(0);
        }
        return null;
	}

	public void delete(long id) {
		jdbcTemplate.update(CEConstanteSQL.SQL_DELETE_PERSON, id);
	}

	public void update(CEPerson t) {
		throw new UnsupportedOperationException();
	}

	public List<CEPerson> loadAll() {
		return jdbcTemplate.query(CEConstanteSQL.SQL_SELECT_PERSON_ALL, (resultSet, i) -> {
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
