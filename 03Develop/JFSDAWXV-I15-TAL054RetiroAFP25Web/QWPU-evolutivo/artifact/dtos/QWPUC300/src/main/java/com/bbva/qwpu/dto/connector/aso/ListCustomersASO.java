package com.bbva.qwpu.dto.connector.aso;

import java.util.ArrayList;
import java.util.List;

public class ListCustomersASO {

    private List<CustomerASO> data;

    public ListCustomersASO() {
        super();
        this.setData(new ArrayList<>());
    }

    public ListCustomersASO(List<CustomerASO> data) {
        super();
        this.setData(data);
    }

    public List<CustomerASO> getData() {
        return data;
    }

    public void setData(List<CustomerASO> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
