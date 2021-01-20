package com.bbva.pglu.lib.r004.impl.mapper;

import com.bbva.pglu.dto.customer.CustomerDTO;
import com.datiobd.daas.model.DocumentWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Date;

public class CustomerMapper {

	private static final Logger LOG = LoggerFactory.getLogger(CustomerMapper.class);

	public static CustomerDTO mapperCustomer(DocumentWrapper paResultado){
		CustomerDTO cliente = new CustomerDTO();
		
		LOG.info("[APX-M1] DocumentWrapper   : {}", paResultado.size());
		LOG.info("[APX-M2] Instancia cliente : {}", cliente.toString());
		
		cliente.setCustomerId((String)paResultado.get("customerId"));
	    cliente.setFirstName((String)paResultado.get("firstName"));
	    cliente.setLastName((String)paResultado.get("lastName"));
	    LOG.info("[APX-M3] Cliente mapeado : {}", cliente.toString());
	    
		return cliente;
	}
}
