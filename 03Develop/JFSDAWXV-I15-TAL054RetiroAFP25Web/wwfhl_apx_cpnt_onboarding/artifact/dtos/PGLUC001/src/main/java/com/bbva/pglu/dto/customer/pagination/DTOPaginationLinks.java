package com.bbva.pglu.dto.customer.pagination;

import com.bbva.apx.dto.AbstractDTO;

public class DTOPaginationLinks extends AbstractDTO{

	private static final long serialVersionUID = 1L;

	private Long first;
    private Long next;
    private Long last;
    private Long previous;

    public DTOPaginationLinks(){}

	public Long getFirst() {
		return first;
	}

	public void setFirst(Long first) {
		this.first = first;
	}

	public Long getNext() {
		return next;
	}

	public void setNext(Long next) {
		this.next = next;
	}

	public Long getLast() {
		return last;
	}

	public void setLast(Long last) {
		this.last = last;
	}

	public void setPrevious(Long previous) {
		this.previous = previous;
	}

	public Long getPrevious() {
		return previous;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DTOPaginationLinks [");
		if (first != null) {
			builder.append("first=");
			builder.append(first);
			builder.append(", ");
		}
		if (next != null) {
			builder.append("next=");
			builder.append(next);
			builder.append(", ");
		}
		if (last != null) {
			builder.append("last=");
			builder.append(last);
			builder.append(", ");
		}
		if (previous != null) {
			builder.append("previous=");
			builder.append(previous);
		}
		builder.append("]");
		return builder.toString();
	}

}
