package com.bbva.qwpu.dto.connector.semaas.header;

import com.bbva.qwpu.dto.connector.semaas.ValueObject;

public class Flag extends ValueObject {

    private String debug;
    private String test;

    public Flag() {
        super();
    }

    public Flag(String debug, String test) {
        super();
        this.setDebug(debug);
        this.setTest(test);
    }

    public String getDebug() {
        return debug;
    }

    public void setDebug(String debug) {
        this.debug = debug;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("debug='").append(debug).append('\'');
        sb.append(", test='").append(test).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
