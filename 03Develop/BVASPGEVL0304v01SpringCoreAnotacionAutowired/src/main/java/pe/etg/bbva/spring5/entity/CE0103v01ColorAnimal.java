package pe.etg.bbva.spring5.entity;

public class CE0103v01ColorAnimal {
	public String basePiel;
	public String texturaPiel;
	
	public String getBasePiel() {
		return basePiel;
	}
	public void setBasePiel(String basePiel) {
		this.basePiel = basePiel;
	}
	public String getTexturaPiel() {
		return texturaPiel;
	}
	public void setTexturaPiel(String texturaPiel) {
		this.texturaPiel = texturaPiel;
	}
	@Override
	public String toString() {
		return String.format("CE0103v01ColorAnimal [basePiel=%s, texturaPiel=%s]", basePiel, texturaPiel);
	}
	

}
