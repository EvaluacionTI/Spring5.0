package com.bbva.pglu;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.pglu.dto.customer.CustomerDTO;
import com.bbva.pglu.dto.customer.pagination.DTOPaginationIn;
import com.bbva.pglu.dto.customer.pagination.DTOPaginationOut;
import java.util.List;

public abstract class AbstractPGLUT00701PETransaction extends AbstractTransaction {

	public AbstractPGLUT00701PETransaction(){
	}


	/**
	 * Return value for input parameter EntityPagination
	 */
	protected DTOPaginationIn getEntitypagination(){
		return (DTOPaginationIn)this.getParameter("EntityPagination");
	}

	/**
	 * Set value for List<CustomerDTO> output parameter EntityListCustomer
	 */
	protected void setEntitylistcustomer(final List<CustomerDTO> field){
		this.addParameter("EntityListCustomer", field);
	}

	/**
	 * Set value for DTOPaginationOut output parameter EntityPaginationOut
	 */
	protected void setEntitypaginationout(final DTOPaginationOut field){
		this.addParameter("EntityPaginationOut", field);
	}
}
