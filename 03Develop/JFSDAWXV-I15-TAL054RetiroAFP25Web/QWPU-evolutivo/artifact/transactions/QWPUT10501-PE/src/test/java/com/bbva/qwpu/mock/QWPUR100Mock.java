package com.bbva.qwpu.mock;

import java.util.List;
import java.util.Map;

import com.bbva.qwpu.dto.employed.CEEmployedDTO;
import com.bbva.qwpu.lib.r100.QWPUR100;

public class QWPUR100Mock implements QWPUR100 {
	
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
	public String executeSaveEmployed(CEEmployedDTO oRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long executeUpdateEmployed(String idCustomer, CEEmployedDTO oRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long executeDeleteEmployed(String idCustomer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CEEmployedDTO> executeGetAllEmployed() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CEEmployedDTO executeGetEmployed(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> executeGetListEmployedPagination(Integer pageSize, Integer paginationKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String executeValidarDB(String psPrefix) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
