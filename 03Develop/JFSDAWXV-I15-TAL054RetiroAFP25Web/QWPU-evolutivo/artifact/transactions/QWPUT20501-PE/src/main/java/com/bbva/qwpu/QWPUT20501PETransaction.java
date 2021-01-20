package com.bbva.qwpu;
import com.bbva.apx.exception.business.BusinessException;
import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.elara.domain.transaction.response.PaginationLinks;
import com.bbva.elara.domain.transaction.response.PaginationNode;
import com.bbva.qwpu.dto.customers.CustomerDTO;
import com.bbva.qwpu.dto.customers.pagination.CustomerConst;
import com.bbva.qwpu.dto.customers.pagination.DTOPaginationIn;
import com.bbva.qwpu.dto.customers.pagination.DTOPaginationLinks;
import com.bbva.qwpu.dto.customers.pagination.DTOPaginationOut;
import com.bbva.qwpu.lib.r200.QWPUR200;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * Pagination
 * Implementacion de logica de negocio.
 * @author P028036
 *
 */
public class QWPUT20501PETransaction extends AbstractQWPUT20501PETransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger(QWPUT20501PETransaction.class);
	@Override
	public void execute() {
		LOGGER.info("[APX] Begin Pagination of customer   : ");
		QWPUR200 qwpuR200 = getServiceLibrary(QWPUR200.class);

		try{
			
			DTOPaginationIn oPaginationIn = this.getEntitypaginationin();
			
			String sPageSize = oPaginationIn.getPageSize().toString();
			Integer iPageSize = Integer.parseInt(String.valueOf(sPageSize));
			Integer pageSize = iPageSize != null ? iPageSize:CustomerConst.DEFAULT_PAGE_SIZE;
			
			Integer paginationKey = oPaginationIn.getPaginationKey() != null ? new Integer(oPaginationIn.getPaginationKey().toString()):CustomerConst.DEFAULT_PAGINATION_KEY;

			LOGGER.info("[APX] pageSize      : {} ", pageSize);
			LOGGER.info("[APX] paginationKey : {}", paginationKey);

			Map<String, Object> oResultQuery = qwpuR200.executeGetListCustomerPagination(pageSize, paginationKey);

			List<CustomerDTO> customerList = (List<CustomerDTO>) oResultQuery.get("listCustomer");
			LOGGER.info("[APX] customerList : {}", customerList);

			LOGGER.info("[APX] oResultQuery.total : {}", oResultQuery.get("total" ));
			Integer total = Integer.valueOf(oResultQuery.get("total").toString());
			LOGGER.info("[APX] total        : {}", total );

			if(customerList != null){
				LOGGER.info("[APX] Customers found {}", customerList);
				if(!customerList.isEmpty()){
					DTOPaginationOut paginationNode = createPagination(paginationKey, pageSize, total);
					LOGGER.info("[APX] Pagination Object: {}", paginationNode.toString());

					this.setListcustomer(customerList);
					this.setEntitypaginationout(paginationNode);
					
					this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
				}else {
					this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_204, Severity.OK);
				}
			}else {
				LOGGER.info("[APX] Customer NOT found");
				this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_400, Severity.ENR);
			}
		}catch(BusinessException ex){
			this.addAdvice(ex.getAdviceCode(), ex.getMessage());
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_400, Severity.ENR);
		}

	}

	private DTOPaginationOut createPagination(Integer paginationKey, Integer pageSize, Integer total){
		LOGGER.info("[APX] createPagination .....! ");
		String queryPagination = "%s?pageSize=%d&paginationKey=%d";

		Integer pFirst = 0;
		Integer pNext = paginationKey + 1;
		Integer pLast = (int) Math.ceil(total / pageSize); // page: 0, 1, 2, 3 ,4 ,5, 6, ...
		Integer pPrevious = paginationKey - 1;

		LOGGER.info("[APX] pFirst    : {}", pFirst);
		LOGGER.info("[APX] pNext     : {}", pNext);
		LOGGER.info("[APX] pLast     : {}", pLast);
		LOGGER.info("[APX] pPrevious : {}", pPrevious);
		LOGGER.info("[APX] queryPagination : {}", queryPagination);

		DTOPaginationLinks paginationLinks = new DTOPaginationLinks();
		
		paginationLinks.setFirst(Long.valueOf(pFirst));
		paginationLinks.setLast(Long.valueOf((pLast - 1)));
		
		if (pNext < pLast) {
			paginationLinks.setNext(Long.valueOf(pNext));
		}
		if (pPrevious > 0) {
			paginationLinks.setPrevious(Long.valueOf(pPrevious));
		}
		LOGGER.info("[APX] DTOPaginationLinks : {}", paginationLinks.toString());
		
		DTOPaginationOut paginationNode = new DTOPaginationOut();
		paginationNode.setPageSize(Long.valueOf(pageSize));
		paginationNode.setPage(Long.valueOf(paginationKey));
		paginationNode.setTotalElements(Long.valueOf(total));
		paginationNode.setTotalPages(Long.valueOf(pLast));
		paginationNode.setLink(paginationLinks);

		LOGGER.info("[APX] DTOPaginationOut : {}", paginationNode.toString());

		return paginationNode;
	}
}
