
package pe.unjfsc.daw.spring5.entity;

public class CEConstant {
	
	// Variables de base de datos y tabla
	public static final String SQL_SCHEMA = "aemsa.";
	public static final String SQL_TABLE = "EVLt10_compra";
	public static final String SQL_INSERT = "INSERT INTO aemsa.EVLt10_compra (id, precio, cantidad, txt_nom, fecha) VALUES (?, ?, ?, ?, ?)";
	public static final String SQL_UPDATE = "UPDATE " + SQL_SCHEMA + SQL_TABLE + " SET precio = ?, cantidad = ?, txt_nom = ?, fecha = ?WHERE id = ?";
	public static final String SQL_DELETE = "DELETE FROM " + SQL_SCHEMA + SQL_TABLE + " WHERE id = ?";
	public static final String SQL_SELECT_ALL = "SELECT id, precio, cantidad, txt_nom, fecha FROM " + SQL_SCHEMA + SQL_TABLE;
	public static final String SQL_SELECT_BY_ID = SQL_SELECT_ALL + " WHERE id = ?";
	
	// Variables de las columnas
	public static final String COLUMN_ID = "id";
	public static final String COLUMN_PRECIO = "precio";
	public static final String COLUMN_CANTIDAD = "cantidad";
	public static final String COLUMN_NOMBRE = "txt_nom";
	public static final String COLUMN_FECHA = "fecha";
}
