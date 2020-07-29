package pe.bbva.evalua.spring5.entity;

public class CEConstant {
	// Variables 
	public static final int UNO_UIT = 4300;
	public static final int TRES_UIT = 12900;
	public static final int RANGO_17200 = 17200;
	public static final int RANGO_51600 = 51600;
	public static final double PORCENTAJE_25 = 0.25;
	
	// Nombre de página lógico
	public static final String JSP_LIST_ALL_AFILIADO = "jsp0101v01ListarAfiliado";
	
	// Variables de base de datos y tabla
	public static final String SQL_SCHEMA = "aemsa.";
	public static final String SQL_TABLE = "AFPt10_saldo_afiliado";
	public static final String SQL_INSERT = "INSERT INTO aemsa.AFPt10_saldo_afiliado (id, cod_afiliado, saldo_afiliado) VALUES (?, ?, ?)";
	public static final String SQL_UPDATE = "UPDATE " + SQL_SCHEMA + SQL_TABLE + " SET cod_afiliado = ?, saldo_afiliado = ? WHERE id = ?";
	public static final String SQL_DELETE = "DELETE FROM " + SQL_SCHEMA + SQL_TABLE + " WHERE id = ?";
	public static final String SQL_SELECT_ALL = "SELECT id, cod_afiliado, saldo_afiliado FROM " + SQL_SCHEMA + SQL_TABLE;
	public static final String SQL_SELECT_BY_ID = SQL_SELECT_ALL + " WHERE id = ?";
	
	// Variables de las columnas
	public static final String COLUMN_ID = "id";
	public static final String COLUMN_CODE = "cod_afiliado";
	public static final String COLUMN_SALDO = "saldo_afiliado";
}
