package pe.etg.bbva.spring5.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import pe.etg.bbva.spring5.entity.CEPerson;

public class CD0201v01PersonMapper {
	
	public CEPerson mapsFieldPerson(ResultSet poRS) throws SQLException {
		CEPerson oCEPerson = new CEPerson();
		oCEPerson.setId(poRS.getLong("ID"));
		oCEPerson.setFirstName(poRS.getString("FIRST_NAME"));
		oCEPerson.setLastName(poRS.getString("LAST_NAME"));
		oCEPerson.setAddress(poRS.getString("ADDRESS"));
		return oCEPerson;
	}
}
