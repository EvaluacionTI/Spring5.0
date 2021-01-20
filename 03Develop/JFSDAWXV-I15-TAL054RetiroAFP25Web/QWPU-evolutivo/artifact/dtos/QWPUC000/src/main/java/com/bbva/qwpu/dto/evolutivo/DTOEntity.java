package com.bbva.qwpu.dto.evolutivo;

import com.bbva.apx.dto.AbstractDTO;

public class DTOEntity extends AbstractDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

	public DTOEntity(){
		super();
	}
	
	public DTOEntity(String id){
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
		StringBuilder builder = new StringBuilder();
		builder.append("DTOEntity [id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}


}
