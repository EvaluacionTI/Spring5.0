package com.bbva.qwpu.lib.r200.impl.mapper;

import com.bbva.qwpu.dto.customers.CustomerDTO;
import com.bbva.qwpu.dto.customers.DTOTransferencia;
import com.datiobd.daas.model.DocumentWrapper;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClientMapper {

	private static final Logger LOG = LoggerFactory.getLogger(ClientMapper.class);

	public static CustomerDTO mapperCliente(DocumentWrapper paResultado){
		CustomerDTO cliente = new CustomerDTO();
		
		LOG.info("[APX] DocumentWrapper   : {}", paResultado.size());
		LOG.info("[APX] Instancia cliente : {}", cliente.toString());
		
		cliente.setId((String)paResultado.get("id"));
	    cliente.setFirstName((String)paResultado.get("firstName"));
	    cliente.setLastName((String)paResultado.get("lastName"));
	    cliente.setEmail((String)paResultado.get("email"));
	    
	    LOG.info("[APX] Cliente mapeado : {}", cliente.toString());
	    
		return cliente;
	}
	
	public static DTOTransferencia mapperTransfer(DocumentWrapper paResultado){
		DTOTransferencia oTransfer = new DTOTransferencia();
		
		LOG.info("[APX] DocumentWrapper   : {}", paResultado.size());

		Double lImporteDestino = (Double) paResultado.get("importeDestino");
		BigDecimal oImporteDestino = new BigDecimal(lImporteDestino);

		LOG.info("[APX] Double lImporteDestino : {}", lImporteDestino);
		LOG.info("[APX] BigDecimal oImporteDestino : {}", oImporteDestino);
		
		oTransfer.setIdTransfer((Long)paResultado.get("idTransfer"));
		oTransfer.setFechaMovimiento((String)paResultado.get("fechaMovimiento"));
		oTransfer.setOrdenante((String)paResultado.get("ordenante"));
		oTransfer.setMonedaOrigen((String)paResultado.get("monedaOrigen"));
		oTransfer.setNumeroCuentaOrigen((String)paResultado.get("numeroCuentaOrigen"));
		oTransfer.setImporteOrigen((Double)paResultado.get("importeOrigen"));
		oTransfer.setMonedaDestino((String)paResultado.get("monedaDestino"));
		oTransfer.setNumeroCuentaDestino((String)paResultado.get("numeroCuentaDestino"));
		oTransfer.setImporteDestino(oImporteDestino);
		oTransfer.setBeneficiario((String)paResultado.get("beneficiario"));
	    
	    LOG.info("[APX] Transfer mapeado : {}", oTransfer.toString());
	    
		return oTransfer;
	}
}
