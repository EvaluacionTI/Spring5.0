package com.bbva.pglu.lib.r003.impl;

import com.bbva.pglu.dto.customer.CustomerDTO;
import com.bbva.pglu.dto.customer.aso.CustomerASO;
import com.bbva.pglu.dto.customer.aso.ListCustomersASO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestClientException;

import java.util.HashMap;
import java.util.Map;

public class PGLUR003Impl extends PGLUR003Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(PGLUR003Impl.class);
	private static final String API_GET_CUSTOMER = "getCustomerASO";
	private static final String ERROR_TO_CONNECT_SERVICE_CUSTOMERS = "PGLU10004006";

	@Override
	public void execute() {
		// TODO - Implementation of business logic
	}

	@Override
	public CustomerDTO executeListCustomerASO(String id) {
		LOGGER.info("[APX] - executeGetCustomer(id) : {}", id);
		CustomerDTO aCustomer = null;

		try {
			Map<String, Object> queryParams = new HashMap<>();
			queryParams.put("customer.id", id);

			LOGGER.info("[APX] Request ASO Service");
			ListCustomersASO customers = this.internalApiConnector.getForObject(API_GET_CUSTOMER, ListCustomersASO.class, queryParams);
			LOGGER.debug("[APX] Result ASO Service: {}", customers);

			if (customers != null && !customers.getData().isEmpty()) {
				CustomerASO aCustomerASO = customers.getData().get(0);
				LOGGER.debug("[APX] ASO Customer: {}", aCustomerASO);

				if(aCustomerASO != null){
					aCustomer = new CustomerDTO(aCustomerASO.getCustomerId(), aCustomer.getFirstName(), aCustomer.getLastName());
				}
			}
		} catch (RestClientException e) {
			LOGGER.info("[APX] Error to connect ASO: {}", e.getMessage());
			this.addAdvice(ERROR_TO_CONNECT_SERVICE_CUSTOMERS);
		}

		return aCustomer;
	}
}
