package com.bbva.pglu.dto.customer.pagination;

import com.bbva.apx.dto.AbstractDTO;

public class DTOPaginationIn extends AbstractDTO{

	private static final long serialVersionUID = 1L;

	private Long pageSize;
	private Long paginationKey;
	
	public Long getPageSize() {
		return pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPaginationKey() {
		return paginationKey;
	}
	public void setPaginationKey(Long paginationKey) {
		this.paginationKey = paginationKey;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DTOPaginationIn [");
		if (pageSize != null) {
			builder.append("pageSize=");
			builder.append(pageSize);
			builder.append(", ");
		}
		if (paginationKey != null) {
			builder.append("paginationKey=");
			builder.append(paginationKey);
		}
		builder.append("]");
		return builder.toString();
	}
	
	
}
