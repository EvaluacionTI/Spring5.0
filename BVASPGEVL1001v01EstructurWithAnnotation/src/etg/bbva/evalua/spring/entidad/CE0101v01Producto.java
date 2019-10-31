package etg.bbva.evalua.spring.entidad;

public class CE0101v01Producto {
	private Integer id;
	private String description;

	public CE0101v01Producto(Integer pId, String pDescription) {
		this.id = pId;
		this.description = pDescription;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
