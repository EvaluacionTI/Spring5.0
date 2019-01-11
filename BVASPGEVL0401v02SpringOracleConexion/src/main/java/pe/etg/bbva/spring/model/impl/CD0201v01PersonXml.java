package pe.etg.bbva.spring.model.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.etg.bbva.spring.entity.CEConstanteSQL;
import pe.etg.bbva.spring.entity.CEPerson;
import pe.etg.bbva.spring.model.CI0201v01Person;

/*
 * Se está inyectando el dataSource al jdbcTemplate por instancia con new 
 */
public class CD0201v01PersonXml implements CI0201v01Person {
	public static final Logger MOLOG = LoggerFactory.getLogger(CD0201v01PersonXml.class);
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}
	
	@Override
	public void save(CEPerson t) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(CEConstanteSQL.SQL_INSERT_PERSON, t.getFirstName(), t.getLastName(), t.getAddress());
	}

	@Override
	public CEPerson load(long id) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		List<CEPerson> persons = jdbcTemplate.query(CEConstanteSQL.SQL_SELECT_PERSON_BY_ID, new Object[] { id },
				(resultSet, i) -> {
					return mapsFieldObject(resultSet);
				});

		if (persons.size() == 1) {
			return persons.get(0);
		}
		return null;
	}

	@Override
	public void delete(long id) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(CEConstanteSQL.SQL_DELETE_PERSON, id);
	}

	@Override
	public void update(CEPerson t) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(CEConstanteSQL.SQL_UPDATE_PERSON, t.getFirstName(), t.getLastName(), t.getAddress(), t.getId());

	}

	@Override
	public List<CEPerson> loadAll() {
		MOLOG.info("[EVL] Start method ");
		jdbcTemplate = new JdbcTemplate(dataSource);
		
		return jdbcTemplate.query(CEConstanteSQL.SQL_SELECT_PERSON_ALL, (resultSet, i) -> {
			return mapsFieldObject(resultSet);
		});
	}

	private CEPerson mapsFieldObject(ResultSet resultSet) throws SQLException {
		CEPerson oCEPerson = new CEPerson();
		oCEPerson.setId(resultSet.getLong("ID"));
		oCEPerson.setFirstName(resultSet.getString("FIRST_NAME"));
		oCEPerson.setLastName(resultSet.getString("LAST_NAME"));
		oCEPerson.setAddress(resultSet.getString("ADDRESS"));
		return oCEPerson;
	}
}
