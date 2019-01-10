package pe.etg.bbva.spring.model.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.etg.bbva.spring.entity.CEConstanteSQL;
import pe.etg.bbva.spring.entity.CEPerson;
import pe.etg.bbva.spring.model.CI0401v01PersonAnotation;
import pe.etg.bbva.spring.model.mapper.CD0401v01PersonMapper;

@Repository
public class CD0401v01PersonAnotacion implements CI0401v01PersonAnotation {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	private void setDataSource(DataSource poDataSource) {
		jdbcTemplate = new JdbcTemplate(poDataSource);
	}

	public void save(CEPerson t) {
		this.jdbcTemplate.update(CEConstanteSQL.SQL_INSERT_PERSON, t.getFirstName(), t.getLastName(), t.getAddress());
	}

	public void update(CEPerson t) {
		this.jdbcTemplate.update(CEConstanteSQL.SQL_UPDATE_PERSON, t.getFirstName(), t.getLastName(), t.getAddress(),
				t.getId());

	}

	public void delete(long id) {
		this.jdbcTemplate.update(CEConstanteSQL.SQL_DELETE_PERSON, id);
	}

	public CEPerson load(long id) {

		return this.jdbcTemplate.queryForObject(CEConstanteSQL.SQL_SELECT_PERSON_BY_ID, new CD0401v01PersonMapper(),
				id);
	}

	public List<CEPerson> loadAll() {
		return this.jdbcTemplate.query(CEConstanteSQL.SQL_SELECT_PERSON_ALL, new CD0401v01PersonMapper());
	}

}