package com.bbva.qwpu.dto.connector.bpm;

import com.bbva.apx.dto.AbstractDTO;

public class BusinessDataBPMDTO extends AbstractDTO {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
    private Float amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BusinessDataBPMDTO{");
        sb.append("amount=").append(amount);
        sb.append('}');
        return sb.toString();
    }
}
