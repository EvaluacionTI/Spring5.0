package com.bbva.pglu.lib.r003;

import com.bbva.pglu.dto.customer.CustomerDTO;

public interface PGLUR003 {

	void execute();

	CustomerDTO executeListCustomerASO(String id);
}
