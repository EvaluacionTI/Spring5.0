package pe.etg.bbva.spring.entity;

public class CEConstanteSQL {
	public static final String SQL_INSERT_PERSON = "INSERT INTO APXt01_Person VALUES (SQ_APXt01_PERSON.NEXTVAL, ?, ?, ?)";
	public static final String SQL_UPDATE_PERSON = "UPDATE APXt01_Person SET FIRST_NAME = ?, LAST_NAME = ?, ADDRESS = ? WHERE ID = ?";
	public static final String SQL_DELETE_PERSON = "DELETE FROM APXt01_Person WHERE ID = ?";
	public static final String SQL_SELECT_PERSON_ALL = "SELECT * FROM APXt01_Person";
	public static final String SQL_SELECT_PERSON_BY_ID = "SELECT * FROM APXt01_Person WHERE ID = ?";
}
