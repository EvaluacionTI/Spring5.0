package com.bbva.qwpu.dto.connector.semaas.header;

import com.bbva.qwpu.dto.connector.semaas.ValueObject;

public class Branch extends ValueObject {

	private static final long serialVersionUID = 1L;
	private String branchId;

    public Branch() {
        super();
    }

    public Branch(String branchId) {
        super();
        this.setBranchId(branchId);
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("branchId='").append(branchId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
