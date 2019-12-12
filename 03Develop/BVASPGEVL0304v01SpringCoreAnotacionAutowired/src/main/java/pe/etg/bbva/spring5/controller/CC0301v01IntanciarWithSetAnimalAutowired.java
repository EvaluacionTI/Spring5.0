package pe.etg.bbva.spring5.controller;

import org.springframework.beans.factory.annotation.Autowired;

import pe.etg.bbva.spring5.entity.CE0301v01AnimalAutowired;

public class CC0301v01IntanciarWithSetAnimalAutowired {
	// 1.0 Declaro la variable del objeto entidad
	private CE0301v01AnimalAutowired oCEAnimal;

	public CE0301v01AnimalAutowired getoCEAnimal() {
		return oCEAnimal;
	}

	// 2.0 Aplico la inyecci�n de dependencias por medio de set
	@Autowired
	public void setoCEAnimal(CE0301v01AnimalAutowired oCEAnimal) {
		this.oCEAnimal = oCEAnimal;
	}
	
	public void animal() {
		oCEAnimal.getBasePiel();
	}
	public String mostrar() {
		return oCEAnimal.basePiel + oCEAnimal.texturaPiel;
	}
}
