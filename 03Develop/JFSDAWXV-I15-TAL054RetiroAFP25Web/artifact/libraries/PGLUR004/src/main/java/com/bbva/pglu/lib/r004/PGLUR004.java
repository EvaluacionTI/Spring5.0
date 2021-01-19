package com.bbva.pglu.lib.r004;

import com.bbva.pglu.dto.customer.CustomerDTO;

import java.util.List;
import java.util.Map;

public interface PGLUR004 {

	void execute();
	String executeSaveCustomer(CustomerDTO oRequest);
	Long executeUpdateCustomer(String idCustomer, CustomerDTO oRequest);
	Long executeDeleteCustomer(String idCustomer);
	List<CustomerDTO> executeGetAllCustomer();
	List<CustomerDTO> executeFindCustomerByName(String psName);
	Map<String, Object> executeGetListCustomerPagination(Integer pageSize, Integer paginationKey);
}
