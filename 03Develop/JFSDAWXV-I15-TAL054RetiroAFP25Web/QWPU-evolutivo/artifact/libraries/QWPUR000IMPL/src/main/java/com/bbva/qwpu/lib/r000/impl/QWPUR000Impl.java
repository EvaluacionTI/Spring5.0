package com.bbva.qwpu.lib.r000.impl;

import com.bbva.qwpu.dto.evolutivo.CECanalDTO;
import com.bbva.qwpu.dto.evolutivo.common.CEMessagError;
import com.bbva.qwpu.lib.r000.impl.model.QWPUR000CanalDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class QWPUR000Impl extends QWPUR000Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(QWPUR000Impl.class);
	private static final String TIME_ZONE = "GMT-5";
	private QWPUR000CanalDAO oRegistroCanal;

	@Override
	public String executeEco() {
		LOGGER.info("[APX] Instancia de QWPUR000CanalDAO : {}", oRegistroCanal);
		LOGGER.info("[APX] Start - method of library ");
		return "[APX] Estoy en la libreria, respondo OK";
	}

	@Override
	public int executeSaveCanal(CECanalDTO poCECanal) {
		LOGGER.info("[APX] Instancia de QWPUR000CanalDAO : {}", oRegistroCanal);
		LOGGER.info("[APX] CECanalDTO {} ", poCECanal);
		int lRpta = 0;
		if (poCECanal.getId()!=0){
            lRpta = oRegistroCanal.saveCanalLocal(poCECanal);
			if (lRpta==0){
			    this.addAdvice("REGISTRO EXISTE");
            }
		}else{
			this.addAdvice(CEMessagError.NOT_FOUND_INFORMATION.value());
		}
		return lRpta;
	}

	@Override
	public int executeUpdateCanal(CECanalDTO poCECanal) {
		LOGGER.info("[APX] Instancia de QWPUR000CanalDAO : {}", oRegistroCanal);
		LOGGER.info("[APX] CECanalDTO {} ", poCECanal);

		int iRpta = oRegistroCanal.updateCanalLocal(poCECanal);
		if (iRpta==0){
			this.addAdvice(CEMessagError.NOT_FOUND_INFORMATION.value());
		}
		LOGGER.info("[APX] piId Rpta {} ", iRpta);
		return iRpta;
	}

	@Override
	public int executeDeleteCanal(int piId) {
		LOGGER.info("[APX] Instancia de QWPUR000CanalDAO : {}", oRegistroCanal);
		LOGGER.info("[APX] piId {} ", piId);

		int lIdentificador = oRegistroCanal.deleteCanalLocal(piId);
		if (lIdentificador==0){
			this.addAdvice(CEMessagError.NOT_FOUND_INFORMATION.value());
		}
		LOGGER.info("[APX] piId Rpta {} ", lIdentificador);
		return lIdentificador;
	}

	@Override
	public List<CECanalDTO> executeListAllCanal() {
		LOGGER.info("[APX] Instancia de QWPUR000CanalDAO : {}", oRegistroCanal);
		LOGGER.info("[APX] Cantidad de registros : ", oRegistroCanal.listAllCanalLocal().size());
		return oRegistroCanal.listAllCanalLocal();
	}

	@Override
	public CECanalDTO executeListByIdCanal(int piIdentificador) {
		LOGGER.info("[APX] Instancia de QWPUR000CanalDAO : {}", oRegistroCanal);
		LOGGER.info("[APX] Identificador : ", piIdentificador);
		if (piIdentificador==0){
			this.addAdvice(CEMessagError.NOT_FOUND_INFORMATION.value());
		}else{
			return oRegistroCanal.listByIdCanal(piIdentificador);
		}
		return null;
	}

	public void setoRegistroCanal(QWPUR000CanalDAO oRegistroCanal) {
		this.oRegistroCanal = oRegistroCanal;
	}
}
