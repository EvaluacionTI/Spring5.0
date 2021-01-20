package com.bbva.qwpu.dto.connector.semaas.header;

import com.bbva.qwpu.dto.connector.semaas.ValueObject;

public class Bank  extends ValueObject {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String bankId;
    private Branch branch;

    public Bank() {
        super();
    }

    public Bank(String bankId, Branch branch) {
        super();
        this.setBankId(bankId);
        this.setBranch(branch);
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("bankId='").append(bankId).append('\'');
        sb.append(", branch=").append(branch);
        sb.append('}');
        return sb.toString();
    }
}
