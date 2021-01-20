package com.bbva.qwpu;
import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.elara.domain.transaction.response.PaginationLinks;
import com.bbva.elara.domain.transaction.response.PaginationNode;
import com.bbva.qwpu.dto.employed.CEEmployedDTO;
import com.bbva.qwpu.dto.employed.pagination.EmployedConst;
import com.bbva.qwpu.lib.r100.QWPUR100;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * Paginaci�n 
 * Implementacion de logica de negocio.
 * @author P028036
 *
 */
public class QWPUT10501PETransaction extends AbstractQWPUT10501PETransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger("QWPUT10501PETransaction");

	@Override
	public void execute() {
		LOGGER.info("[APX] Begin Pagination of Employed   : ");

		QWPUR100 qwpuR100 = (QWPUR100)getServiceLibrary(QWPUR100.class);

//		Integer pageSize =  this.getQueryParameter("pageSize") != null ? new Integer(this.getQueryParameter("pageSize").get(0)): EmployedConst.DEFAULT_PAGE_SIZE;
//		Integer paginationKey = this.getQueryParameter("paginationKey") != null ? new Integer(this.getQueryParameter("paginationKey").get(0)):EmployedConst.DEFAULT_PAGINATION_KEY;
		String sPageSize = this.getParameter("pageSize").toString();
		LOGGER.info("[APX] sPageSize      : {} ", sPageSize);
		Integer iPageSize = Integer.parseInt(String.valueOf(sPageSize));
		LOGGER.info("[APX] iPageSize      : {} ", iPageSize);
		Integer pageSize = iPageSize != null ? iPageSize:EmployedConst.DEFAULT_PAGE_SIZE;
		Integer paginationKey = this.getParameter("paginationKey") != null ? new Integer(this.getParameter("paginationKey").toString()):EmployedConst.DEFAULT_PAGINATION_KEY;

		LOGGER.info("[APX] pageSize      : {} ", pageSize);
		LOGGER.info("[APX] paginationKey : {}", paginationKey );
		LOGGER.info("[APX] Instancia     : {}", qwpuR100 );

		Map<String, Object> oResultQuery = qwpuR100.executeGetListEmployedPagination(pageSize, paginationKey);

		List<CEEmployedDTO> employedList = (List<CEEmployedDTO>) oResultQuery.get("listEmployed");
		Integer total = (Integer) oResultQuery.get("total");

		LOGGER.info("[APX] employedList : {}", employedList);
		LOGGER.info("[APX] total        : {}", total );

		if(employedList != null){
			LOGGER.info("[APX] Employed found {}", employedList);
			if(!employedList.isEmpty()){
				PaginationNode paginationNode = createPagination(paginationKey, pageSize, total);
				LOGGER.info("[APX] Pagination Object: {}", paginationNode);

				this.setPagination(paginationNode);
				this.setListemployed(employedList);
				this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
			}else {
				this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_204, Severity.OK);
			}
		}else {
			LOGGER.info("[APX] Employed NOT found");
			this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_400, Severity.ENR);
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

		PaginationLinks paginationLinks = new PaginationLinks();
		paginationLinks.setFirst(String.format(queryPagination, this.getURIPath(), pageSize, pFirst));
		paginationLinks.setLast(String.format(queryPagination, this.getURIPath(), pageSize, (pLast - 1)));

		if (pNext < pLast) {
			paginationLinks.setNext(String.format(queryPagination, this.getURIPath(), pageSize, pNext));
		}
		if (pPrevious > 0) {
			paginationLinks.setPrevious(String.format(queryPagination, this.getURIPath(), pageSize, pPrevious));
		}

		LOGGER.info("[APX] PaginationLinks : {}", paginationLinks.toString());

		PaginationNode paginationNode = new PaginationNode();
		paginationNode.setPageSize(pageSize);
		paginationNode.setPage(paginationKey);
		paginationNode.setTotalElements(total);
		paginationNode.setTotalPages(pLast);
		paginationNode.setLinks(paginationLinks);

		LOGGER.info("[APX] PaginationNode : {}", paginationNode.toString());
		return paginationNode;
	}
}
