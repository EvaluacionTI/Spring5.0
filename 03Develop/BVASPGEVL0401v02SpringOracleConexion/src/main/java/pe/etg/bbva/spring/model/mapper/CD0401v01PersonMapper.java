package pe.etg.bbva.spring.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.etg.bbva.spring.entity.CEPerson;

public class CD0401v01PersonMapper implements RowMapper<CEPerson> {

	@Override
	public CEPerson mapRow(ResultSet poRS, int rowNum) throws SQLException {

		CEPerson oCEPerson = new CEPerson();
		oCEPerson.setId(poRS.getLong("ID"));
		oCEPerson.setFirstName(poRS.getString("FIRST_NAME"));
		oCEPerson.setLastName(poRS.getString("LAST_NAME"));
		oCEPerson.setAddress(poRS.getString("ADDRESS"));
		return oCEPerson;

	}

}
