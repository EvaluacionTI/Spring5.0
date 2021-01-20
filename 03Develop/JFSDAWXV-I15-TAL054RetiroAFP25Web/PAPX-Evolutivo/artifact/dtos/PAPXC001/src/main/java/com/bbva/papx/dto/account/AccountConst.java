package com.bbva.papx.dto.account;

public class AccountConst {
    public static final int DEFAULT_PAGE_SIZE = 5;
    public static final int DEFAULT_PAGINATION_KEY = 0;


    public static final int MAX_REGISTROS = 5000;
    public static final String ID_EMPLOYED = "id_employed";
    public static final String FIRST_NAME = "first_name";
    public static final String LAST_NAME = "last_name";
    public static final String EMAIL = "email";
    public static final String AGE = "age";
    public static final String LIMIT_CREDIT = "limit_credit";
    public static final String SN_ACTIVO = "sn_activo";
    public static final String DATE_REGISTER = "date_register";

    public static final String ERR_PARAMETERS_OK = "PGLU10000000";
    public static final String ERR_EXISTE_DATA = "PGLU10000004";

    public static final String SQL_SELECT_ALL = "sql.ora.select_all_account";
    public static final String SQL_SELECT_BY = "sql.ora.select_by_account";

    public static final String SQL_COUNT_ALL = "sql.ora.count_all_account";

    public static final String SQL_INSERT = "sql.ora.insert_account";
    public static final String SQL_UPDATE = "sql.ora.update_account";
    public static final String SQL_DELETE = "sql.ora.delete_account";
}
