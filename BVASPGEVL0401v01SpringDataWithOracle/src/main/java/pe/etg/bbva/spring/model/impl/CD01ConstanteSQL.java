package pe.etg.bbva.spring.model.impl;

public final class CD01ConstanteSQL {

	//1. Tabla : CTBt14_tipo_plan
	public static final String SQL_SCHEMA = "";
	public static final String SQL_TABLE = "CTBt14_tipo_plan";
	public static final String SQL_INSERT = "INSERT INTO " + SQL_TABLE + " (cod_tipo_plan, cod_emp, cod_iso_idio_orgn, txt_abrv, txt_desc, sn_ver, sn_upd, sn_anu, sn_del, sn_dflt, sn_act, txt_user, fec_user, txt_last_user, fec_last_user) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	public static final String SQL_UPDATE = "UPDATE " + SQL_TABLE + " SET cod_emp = ?, cod_iso_idio_orgn = ?, txt_abrv = ?, txt_desc = ?, sn_ver = ?, sn_upd = ?, sn_anu = ?, sn_del = ?, sn_dflt = ?, sn_act = ?, txt_user = ?, fec_user = ?, txt_last_user = ?, fec_last_user = ? WHERE cod_tipo_plan = ?";
	public static final String SQL_DELETE = "DELETE FROM " + SQL_TABLE + " WHERE cod_tipo_plan = ?";
	public static final String SQL_SELECT_ALL = "SELECT cod_tipo_plan, cod_emp, cod_iso_idio_orgn, txt_abrv, txt_desc, sn_ver, sn_upd, sn_anu, sn_del, sn_dflt, sn_act, txt_user, fec_user, txt_last_user, fec_last_user FROM " + SQL_TABLE;
	public static final String SQL_SELECT_BY_ID = SQL_SELECT_ALL + " WHERE cod_tipo_plan = ?";
	
}
