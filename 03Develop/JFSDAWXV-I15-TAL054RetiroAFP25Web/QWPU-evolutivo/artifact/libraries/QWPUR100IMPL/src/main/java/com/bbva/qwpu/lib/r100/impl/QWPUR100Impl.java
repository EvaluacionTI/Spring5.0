package com.bbva.qwpu.lib.r100.impl;

import java.util.*;

import com.bbva.qwpu.lib.r100.impl.mapper.EmployedMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.qwpu.dto.employed.CEEmployedDTO;
import com.bbva.qwpu.lib.r100.QWPUR100;

import static com.bbva.qwpu.dto.employed.pagination.EmployedConst.*;

public class QWPUR100Impl extends QWPUR100Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(QWPUR100.class);

	@Override
	public void execute() {
		
	}

	@Override
	public String executeSaveEmployed(CEEmployedDTO oRequest) {
		LOGGER.info("[APX] executeSaveEmployed...");
		int iResultSQL = 0;

		Map<String, Object> oRequestSQL = null;
		oRequestSQL.put("ID", oRequest.getId());
		oRequestSQL.put("FIRST_NAME", oRequest.getFirstName());
		oRequestSQL.put("LAST_NAME", oRequest.getLastName());
		oRequestSQL.put("EMAIL", oRequest.getEmail());
		oRequestSQL.put("AGE", oRequest.getAge());
		oRequestSQL.put("LIMIT_CREDIT", oRequest.getLimitCredit());
		oRequestSQL.put("SN_ACTIVO", oRequest.getSiNoActivo());
		oRequestSQL.put("DATE_REGISTER", oRequest.getFechaRegistro());

		iResultSQL = this.jdbcUtils.update(SQL_INSERT, oRequestSQL);

		LOGGER.info("[APX] Save Record : {}", iResultSQL);

		return String.valueOf(iResultSQL);
	}

	@Override
	public Long executeUpdateEmployed(String idCustomer, CEEmployedDTO oRequest) {
		LOGGER.info("[APX] executeUpdateEmployed...");
		int iResultSQL = 0;

		Map<String, Object> oRequestSQL = null;
		oRequestSQL.put("id", oRequest.getId());
		oRequestSQL.put("first_name", oRequest.getFirstName());
		oRequestSQL.put("last_name", oRequest.getLastName());
		oRequestSQL.put("email", oRequest.getEmail());
		oRequestSQL.put("age", oRequest.getAge());
		oRequestSQL.put("limit_credit", oRequest.getLimitCredit());
		oRequestSQL.put("sn_activo", oRequest.getSiNoActivo());
		oRequestSQL.put("date_register", oRequest.getFechaRegistro());

		iResultSQL = this.jdbcUtils.update(SQL_UPDATE, oRequestSQL);

		LOGGER.info("[APX] Update record : {}", iResultSQL);

		return Long.valueOf(iResultSQL);
	}

	@Override
	public Long executeDeleteEmployed(String idCustomer) {
		LOGGER.info("[APX] executeDeleteEmployed...");
		int iResultSQL = 0;

		iResultSQL = this.jdbcUtils.update(SQL_DELETE, idCustomer);

		LOGGER.info("[APX] Delete record : {}", iResultSQL);

		return  Long.valueOf(iResultSQL);
	}

	@Override
	public CEEmployedDTO executeGetEmployed(String id) {
		LOGGER.info("[APX] executeGetEmployed...");
		List<Map<String, Object>> oResultSQL = null;
		CEEmployedDTO oCEEmployed = null;

		oResultSQL = this.jdbcUtils.queryForList(SQL_SELECT_BY, id);

		if (!oResultSQL.equals(null)) {
			if (oResultSQL.iterator().hasNext()) {
				oCEEmployed = EmployedMapper.mapper(oResultSQL.iterator().next());
			}
		}
		LOGGER.info("[APX] Record Employed : {}", oResultSQL.size());
		LOGGER.info("[APX] EmployedDTO     : {}", oCEEmployed.toString());

		return oCEEmployed;
	}

	@Override
	public List<CEEmployedDTO> executeGetAllEmployed() {
		LOGGER.info("[APX] executeGetAllEmployed...");
		List<Map<String, Object>> oResultSQL = null;
		List<CEEmployedDTO> oListEmployed = null;

		oResultSQL = this.jdbcUtils.queryForList(SQL_SELECT_ALL);

		for (Map<String, Object> oDTOEmployed : oResultSQL) {
			oListEmployed.add(EmployedMapper.mapper(oDTOEmployed));
		}

		LOGGER.info("[APX] Object oResultSQL : {}", oResultSQL.size());
		LOGGER.info("[APX] Object oListEmployed : {}",oListEmployed.size());

		return oListEmployed;
	}

	@Override
	public Map<String, Object> executeGetListEmployedPagination(Integer pageSize, Integer paginationKey) {
		LOGGER.info("[APX] Pagination Settings...");

		Integer skipRows = pageSize * paginationKey;
		Integer limitRows = pageSize;

		LOGGER.info("[APX] pageSize 	 : {}", pageSize);
		LOGGER.info("[APX] paginationKey : {}", paginationKey);
		LOGGER.info("[APX] skipRows 	 : {}", skipRows);
		LOGGER.info("[APX] limitRows 	 : {}", limitRows);

		// Busqueda y el agrupamiento
		List<Map<String, Object>> oEmployedList = listPaginationEmployed(skipRows, limitRows);
		// Conexion que traiga el total registros
		int total = countTotalEmployed();
		LOGGER.info("[APX] Total Registros... : {}", total);

		Map<String, Object> oResulMap = new HashMap<>();
		oResulMap.put("listEmployed", oEmployedList);
		oResulMap.put("total", total);

		return oResulMap;
	}

	private List<Map<String, Object>> listPaginationEmployed(Integer skipRows, Integer limitRows) {
		LOGGER.info("[APX] listPaginationEmployed...");
		List<Map<String, Object>> resultSQL = null;

		resultSQL = this.jdbcUtils.pagingQueryForList(SQL_SELECT_ALL, skipRows, limitRows);

		LOGGER.info("[APX] skipRows 			  : {}", skipRows);
		LOGGER.info("[APX] limitRows  			  : {}", limitRows);

		LOGGER.info("[APX] Count Employed : {}", resultSQL.size());

		return resultSQL;
	}
	private int countTotalEmployed() {
		int total = 0;

		total = this.jdbcUtils.queryForInt(SQL_COUNT_ALL);
		LOGGER.info("[APX] executeWithReturn : {}", total);

		return total;
	}

	@Override
	public String executeValidarDB(String psPrefix) {
		LOGGER.info("[APX] executeValidarDB...");
		String sResultSQL = null;

		Map<String, Object> oRequestSQL = null;

		sResultSQL = this.jdbcUtils.getQuery(SQL_COUNT_ALL_EVOL);

		LOGGER.info("[APX] Verificar : {}", sResultSQL);

		return sResultSQL;
	}
}
