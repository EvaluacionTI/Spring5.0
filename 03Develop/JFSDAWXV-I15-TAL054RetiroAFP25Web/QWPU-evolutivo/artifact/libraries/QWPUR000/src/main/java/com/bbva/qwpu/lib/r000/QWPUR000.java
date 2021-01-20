package com.bbva.qwpu.lib.r000;

import com.bbva.qwpu.dto.evolutivo.CECanalDTO;

import java.util.List;


public interface QWPUR000 {

	String executeEco();
	int executeSaveCanal(CECanalDTO poCECanal);
	int executeUpdateCanal(CECanalDTO poCECanal);
	int executeDeleteCanal(int piId);
	List<CECanalDTO> executeListAllCanal();
	CECanalDTO executeListByIdCanal(int piIdentificador);

}
