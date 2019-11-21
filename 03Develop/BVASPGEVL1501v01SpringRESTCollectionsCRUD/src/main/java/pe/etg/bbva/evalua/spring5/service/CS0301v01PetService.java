package pe.etg.bbva.evalua.spring5.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.etg.bbva.evalua.spring5.entity.CEAnimal;
import pe.etg.bbva.evalua.spring5.entity.CE0301v01Mascota;

@Service
public class CS0301v01PetService {
	private List<CE0301v01Mascota> oListPet = null;
	
	public List<CE0301v01Mascota> findAll(){
		if (oListPet == null) {
			oListPet = new ArrayList<CE0301v01Mascota>();
			oListPet.add(new CE0301v01Mascota(1, "Lobo", new CEAnimal("Perro")));
			oListPet.add(new CE0301v01Mascota(2, "Negro", new CEAnimal("Caballo")));
			oListPet.add(new CE0301v01Mascota(3, "Rayo", new CEAnimal("Toro")));
			oListPet.add(new CE0301v01Mascota(4, "Sambo", new CEAnimal("Sapo")));
			oListPet.add(new CE0301v01Mascota(5, "Apache", new CEAnimal("Tarantula")));
		}
		return oListPet;
	}
	
	public CE0301v01Mascota findById(int pId) {
		for (CE0301v01Mascota oPet: findAll()) {
			if (oPet.getId() == pId) {
				return oPet;
			}
		}
		return null;
		
	}
}
