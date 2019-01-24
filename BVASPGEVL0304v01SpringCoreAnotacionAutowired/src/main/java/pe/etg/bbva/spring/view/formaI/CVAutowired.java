package pe.etg.bbva.spring.view.formaI;

import org.springframework.beans.factory.annotation.Autowired;

import pe.etg.bbva.spring.entity.CE0101v01ColorAnimal;

public class CVAutowired {
	@Autowired
	static
	CE0101v01ColorAnimal oAnimal;
	
	public static void main(String[] args) {
		
		System.out.println("Instancia Objeto" + oAnimal.getBasePiel());
	}

	public static CE0101v01ColorAnimal getoAnimal() {
		return oAnimal;
	}

	public static void setoAnimal(CE0101v01ColorAnimal oAnimal) {
		CVAutowired.oAnimal = oAnimal;
	}

}
