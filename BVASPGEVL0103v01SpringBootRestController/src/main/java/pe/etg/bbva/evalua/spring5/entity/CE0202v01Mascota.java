package pe.etg.bbva.evalua.spring5.entity;

public class CE0202v01Mascota {
	private int id;
	private String name;
	private CE0201v01Animal oCEAnimal;

	public CE0202v01Mascota() {
		super();
	}
	
	public CE0202v01Mascota(int piId, String psName, CE0201v01Animal poCEAnimal) {
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
	public CE0201v01Animal getoCEAnimal() {
		return oCEAnimal;
	}
	public void setoCEAnimal(CE0201v01Animal oCEAnimal) {
		this.oCEAnimal = oCEAnimal;
	}
	
}
