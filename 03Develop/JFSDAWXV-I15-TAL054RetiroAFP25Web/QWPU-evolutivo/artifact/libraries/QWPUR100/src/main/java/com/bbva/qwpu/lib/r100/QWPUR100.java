package com.bbva.qwpu.lib.r100;

import java.util.List;
import java.util.Map;

import com.bbva.qwpu.dto.employed.CEEmployedDTO;

public interface QWPUR100 {

	void execute();

	String executeValidarDB(String psPrefix);
	String executeSaveEmployed(CEEmployedDTO oRequest);
	Long executeUpdateEmployed(String idCustomer, CEEmployedDTO oRequest);
	Long executeDeleteEmployed(String idCustomer);

	List<CEEmployedDTO> executeGetAllEmployed();
	CEEmployedDTO executeGetEmployed(String id);

	Map<String, Object> executeGetListEmployedPagination(Integer pageSize, Integer paginationKey);	
}
