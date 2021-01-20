package com.bbva.qwpu.mock;

import com.bbva.qwpu.dto.customers.CustomerDTO;
import com.bbva.qwpu.dto.customers.DTOTransferencia;
import com.bbva.qwpu.dto.customers.apiaso.CustomerASO;
import com.bbva.qwpu.lib.r200.QWPUR200;

import java.util.List;
import java.util.Map;

public class QWPUR200Mock implements QWPUR200 {
	
	//Anadir todos los execute que tenga la interfaz de la libreria
	//
	// @Override
	// public valor_de_retorno execute...(Parametro1 param1,...) {
	//
	// 	...
	//	
	// }

	
	//Metodo execute generado por defecto
	
	@Override
	public void execute() {
	
	 	//Anadir codigo de retorno
		
	}

	@Override
	public String executeSaveCustomer(CustomerDTO oRequest) {
		return null;
	}

	@Override
	public Long executeUpdateCustomer(String idCustomer, CustomerDTO oRequest) {
		return null;
	}

	@Override
	public Long executeDeleteCustomer(String idCustomer) {
		return null;
	}

	@Override
	public List<CustomerDTO> executeGetAllCustomer() {
		return null;
	}

	@Override
	public CustomerDTO executeGetCustomer(String id) {
		return null;
	}

	@Override
	public Map<String, Object> executeGetListCustomerPagination(Integer pageSize, Integer paginationKey) {
		return null;
	}

	@Override
	public CustomerASO executeListCustomerASO(String idCustomer) {
		return null;
	}

	@Override
	public Long executeSaveTransfer(DTOTransferencia oRequest) {
		return null;
	}

	@Override
	public Long executeUpdateTransfer(Long idCustomer, DTOTransferencia oRequest) {
		return null;
	}

	@Override
	public Long executeDeleteTransfer(Long idCustomer) {
		return null;
	}

	@Override
	public DTOTransferencia executeGetTransfer(Long id) {
		return null;
	}

	@Override
	public List<DTOTransferencia> executeGetAllTransfer() {
		return null;
	}

	@Override
	public Map<String, Object> executeGetListTransferPagination(Long pageSize, Long paginationKey) {
		return null;
	}

	@Override
	public String executeValidarDB(String psPrefixDB) {
		// TODO Auto-generated method stub
		return null;
	}

}
