package pe.bbva.evalua.spring5.entity;

public class CEUsuario {

	private String id;
    private String name;
    private String surname;
    
    public CEUsuario() {
    	super();
    }
    
    public CEUsuario(String pId, String pName, String pSurname) {
    	this.id = pId;
    	this.name=pName;
    	this.surname=pSurname;
    }
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "CEUsuario [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}
}
