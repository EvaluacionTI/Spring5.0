package pe.etg.bbva.evalua.spring5.entity;

public class CE0301v01Mascota {
	private int id;
	private String name;
	private CEAnimal oCEAnimal;

	public CE0301v01Mascota() {
		super();
	}
	
	public CE0301v01Mascota(int piId, String psName, CEAnimal poCEAnimal) {
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
