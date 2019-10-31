package pe.etg.bbva.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CERaces {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_races;
	private String race;
	
	@ManyToOne
	private CEEspecies species;
	
	public CERaces() {
		super();
	}
	
	public long getId_races() {
		return id_races;
	}
	public void setId_races(long id_races) {
		this.id_races = id_races;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	@Override
	public String toString() {
		return String.format("CERaces [id_races=%s, race=%s]", id_races, race);
	}
}
