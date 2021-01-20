package com.bbva.qwpu.dto.connector;

import com.bbva.apx.dto.AbstractDTO;

public class Entity extends AbstractDTO {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;

    public Entity() {
        super();
    }

    public Entity(String id) {
        super();
        this.setId(id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":\"").append(this.getId()).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
