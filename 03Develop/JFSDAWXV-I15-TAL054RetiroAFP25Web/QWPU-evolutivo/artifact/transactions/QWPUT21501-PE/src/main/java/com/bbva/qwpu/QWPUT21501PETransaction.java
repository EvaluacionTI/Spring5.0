package com.bbva.qwpu;
import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.elara.domain.transaction.response.PaginationNode;
import com.bbva.qwpu.dto.customers.DTOTransferencia;
import com.bbva.qwpu.lib.r200.QWPUR200;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * Paginacion para transferencia
 * Implementacion de logica de negocio.
 * @author P028036
 *
 */
public class QWPUT21501PETransaction extends AbstractQWPUT21501PETransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger(QWPUT21501PETransaction.class);
	@Override
	public void execute() {
		LOGGER.info("[APX] Begin Pagination of Transfer   : ");
		QWPUR200 qwpuR200 = getServiceLibrary(QWPUR200.class);
		String sPageSize = this.getParameter("pageSize").toString();
		LOGGER.info("[APX] sPageSize      : {} ", sPageSize);
		Long iPageSize = Long.parseLong(String.valueOf(sPageSize));
		LOGGER.info("[APX] iPageSize      : {} ", iPageSize);
		Long pageSize = iPageSize != null ? iPageSize : TransferenciaConst.DEFAULT_PAGE_SIZE;
		Long paginationKey = this.getParameter("paginationKey") != null ? new Long(this.getParameter("paginationKey").toString()) : TransferenciaConst.DEFAULT_PAGINATION_KEY;

		LOGGER.info("[APX] pageSize      : {} ", pageSize);
		LOGGER.info("[APX] paginationKey : {}", paginationKey);

		Map<String, Object> oResultQuery = qwpuR200.executeGetListTransferPagination(pageSize, paginationKey);

		List<DTOTransferencia> transfereniaList = (List<DTOTransferencia>) oResultQuery.get("listTransfer");
		Long total = (Long) oResultQuery.get("total");

		LOGGER.info("[APX] customerList : {}", transfereniaList);
		LOGGER.info("[APX] total        : {}", total);

		if (transfereniaList != null) {
			LOGGER.info("[APX] Customers found {}", transfereniaList);
			if (!transfereniaList.isEmpty()) {
				LOGGER.info("[APX] Customers found {}", transfereniaList);
				if (!transfereniaList.isEmpty()) {
					Integer iPaginationKey = Math.toIntExact(paginationKey);
					Integer iPagesSize = pageSize.intValue();
					Integer iPageTotal = total.intValue();

					PaginationNode paginationNode = createPagination(iPaginationKey, iPagesSize, iPageTotal);
					LOGGER.info("[APX] Pagination Object: {}", paginationNode);

					this.setPagination(paginationNode);
					this.setListtransfer(transfereniaList);
					this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
				} else {
					this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_204, Severity.OK);
				}
			} else {
				LOGGER.info("[APX] Customer NOT found");
				this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_400, Severity.ENR);
			}
		}
	}

	private PaginationNode createPagination(Integer paginationKey, Integer pageSize, Integer total) {

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
		LOGGER.info("[APX] getURIPath : {}", this.getURIPath());

/*		PaginationLinks paginationLinks = new PaginationLinks();
		paginationLinks.setFirst(String.format(queryPagination, this.getURIPath(), pageSize, pFirst));
		paginationLinks.setLast(String.format(queryPagination, this.getURIPath(), pageSize, (pLast - 1)));

		if (pNext < pLast) {
			paginationLinks.setNext(String.format(queryPagination, this.getURIPath(), pageSize, pNext));
		}
		if (pPrevious > 0) {
			paginationLinks.setPrevious(String.format(queryPagination, this.getURIPath(), pageSize, pPrevious));
		}

		LOGGER.info("[APX] PaginationLinks : {}", paginationLinks.toString());
*/
		PaginationNode paginationNode = new PaginationNode();
		paginationNode.setPageSize(pageSize);
		paginationNode.setPage(paginationKey);
		paginationNode.setTotalElements(total);
		paginationNode.setTotalPages(pLast);
//		paginationNode.setLinks(paginationLinks);

		LOGGER.info("[APX] PaginationNode : {}", paginationNode.toString());
		return paginationNode;
	}
}
