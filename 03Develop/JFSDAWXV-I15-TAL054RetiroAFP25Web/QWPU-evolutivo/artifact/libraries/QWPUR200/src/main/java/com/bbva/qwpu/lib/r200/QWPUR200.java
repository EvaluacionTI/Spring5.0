package com.bbva.qwpu.lib.r200;

import java.util.List;
import java.util.Map;

import com.bbva.qwpu.dto.customers.CustomerDTO;
import com.bbva.qwpu.dto.customers.DTOTransferencia;
import com.bbva.qwpu.dto.customers.apiaso.CustomerASO;

public interface QWPUR200 {

	// Customer:
	String executeSaveCustomer(CustomerDTO oRequest);
	Long executeUpdateCustomer(String idCustomer, CustomerDTO oRequest);
	Long executeDeleteCustomer(String idCustomer);

	List<CustomerDTO> executeGetAllCustomer();
	CustomerDTO executeGetCustomer(String id);

	Map<String, Object> executeGetListCustomerPagination(Integer pageSize, Integer paginationKey);

	//Transfer:
	Long executeSaveTransfer(DTOTransferencia oRequest);
	Long executeUpdateTransfer(Long idCustomer, DTOTransferencia oRequest);
	Long executeDeleteTransfer(Long idCustomer);

	DTOTransferencia executeGetTransfer(Long id);
	List<DTOTransferencia> executeGetAllTransfer();

	Map<String, Object> executeGetListTransferPagination(Long pageSize, Long paginationKey);
}
