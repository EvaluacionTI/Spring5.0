package pe.etg.bbva.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="APXt01_country")
public class CECountry {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private int population;
	
	public CECountry() {}
	
	public CECountry(Long piId, String psName, int piPopulation) {
		this.id = piId;
		this.name = psName;
		this.population = piPopulation;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CECountry [id=").append(id).append(", name=").append(name).append(", population=")
				.append(population).append("]");
		return builder.toString();
	}
}
