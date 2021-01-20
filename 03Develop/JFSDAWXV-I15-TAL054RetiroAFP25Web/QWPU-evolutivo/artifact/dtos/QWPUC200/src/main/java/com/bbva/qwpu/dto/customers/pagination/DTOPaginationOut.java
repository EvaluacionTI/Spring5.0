package com.bbva.qwpu.dto.customers.pagination;

import com.bbva.apx.dto.AbstractDTO;

public class DTOPaginationOut extends AbstractDTO {

	private static final long serialVersionUID = 1L;
	private DTOPaginationLinks link;

    private Long page;
    private Long totalPages;
    private Long pageSize;
    private Long totalElements;
    
	public DTOPaginationLinks getLink() {
		return link;
	}
	public void setLink(DTOPaginationLinks link) {
		this.link = link;
	}
	public Long getPage() {
		return page;
	}
	public void setPage(Long page) {
		this.page = page;
	}
	public Long getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getPageSize() {
		return pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(Long totalElements) {
		this.totalElements = totalElements;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DTOPaginationOut [");
		if (link != null) {
			builder.append("link=");
			builder.append(link);
			builder.append(", ");
		}
		if (page != null) {
			builder.append("page=");
			builder.append(page);
			builder.append(", ");
		}
		if (totalPages != null) {
			builder.append("totalPages=");
			builder.append(totalPages);
			builder.append(", ");
		}
		if (pageSize != null) {
			builder.append("pageSize=");
			builder.append(pageSize);
			builder.append(", ");
		}
		if (totalElements != null) {
			builder.append("totalElements=");
			builder.append(totalElements);
		}
		builder.append("]");
		return builder.toString();
	}

	
}
