package pe.etg.bbva.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CEEspecies {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_species;
	private String name;
	
	public long getId_species() {
		return id_species;
	}
	public void setId_species(long id_species) {
		this.id_species = id_species;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return String.format("CEEspecies [id_species=%s, name=%s]", id_species, name);
	}
}
