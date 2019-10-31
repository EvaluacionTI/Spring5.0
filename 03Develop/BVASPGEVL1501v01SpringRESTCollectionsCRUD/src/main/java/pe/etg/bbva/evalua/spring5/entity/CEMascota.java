package pe.etg.bbva.evalua.spring5.entity;

public class CEMascota {
	private int id;
	private String name;
	private CEAnimal oCEAnimal;

	public CEMascota() {
		super();
	}
	
	public CEMascota(int piId, String psName, CEAnimal poCEAnimal) {
		super();
		this.id = piId;
		this.name = psName;
		this.oCEAnimal = poCEAnimal;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CEAnimal getoCEAnimal() {
		return oCEAnimal;
	}
	public void setoCEAnimal(CEAnimal oCEAnimal) {
		this.oCEAnimal = oCEAnimal;
	}
	
}
