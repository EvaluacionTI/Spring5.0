package com.bbva.qwpu.dto.connector.semaas;

import com.bbva.apx.dto.AbstractDTO;
import com.bbva.qwpu.dto.connector.semaas.body.DTOAnualidad;
import com.bbva.qwpu.dto.connector.semaas.header.Header;

public class DTOEventAnualidad extends AbstractDTO {
    private static final long serialVersionUID = 2931699728946643245L;

    private Header header;
    private DTOAnualidad anualidad;

    public DTOEventAnualidad() {
        super();
    }

    public DTOEventAnualidad(Header header, DTOAnualidad anualidad) {
        super();
        this.setHeader(header);
        this.setAnualidad(anualidad);
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public DTOAnualidad getAnualidad() {
        return anualidad;
    }

    public void setAnualidad(DTOAnualidad anualidad) {
        this.anualidad = anualidad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"header\":").append(this.getHeader());
        sb.append(", \"customer\":").append(this.getAnualidad());
        sb.append('}');
        return sb.toString();
    }
}
