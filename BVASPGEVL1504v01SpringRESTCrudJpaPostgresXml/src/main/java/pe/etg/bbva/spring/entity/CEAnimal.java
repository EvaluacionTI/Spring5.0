package pe.etg.bbva.spring.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CEAnimal {
	private Long id_animal;
	private String name;
	private String chip;
	
	private CEAnimal() {
		super();
	}
	
	private CEAnimal(Long piId_animal, String psName, String psChip, Date pdBirth, boolean pbStatus) {
		this.id_animal = piId_animal;
		this.name = psName;
		this.chip = psChip;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId_animal() {
		return id_animal;
	}

	public void setId_animal(Long id_animal) {
		this.id_animal = id_animal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChip() {
		return chip;
	}
	public void setChip(String chip) {
		this.chip = chip;
	}
	@Override
	public String toString() {
		return String.format("CEAnimal [id_animal=%s, name=%s, chip=%s]", id_animal, name, chip);
	}
}
