package pe.etg.bbva.evalua.spring5.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.etg.bbva.evalua.spring5.entity.CE0201v01Animal;
import pe.etg.bbva.evalua.spring5.entity.CE0202v01Mascota;

@Service
public class CS0202v01PetService {
	private List<CE0202v01Mascota> oListPet = null;
	
	public List<CE0202v01Mascota> findAll(){
		if (oListPet == null) {
			oListPet = new ArrayList<CE0202v01Mascota>();
			oListPet.add(new CE0202v01Mascota(1, "Lobo", new CE0201v01Animal("Perro")));
			oListPet.add(new CE0202v01Mascota(2, "Negro", new CE0201v01Animal("Caballo")));
			oListPet.add(new CE0202v01Mascota(3, "Rayo", new CE0201v01Animal("Toro")));
			oListPet.add(new CE0202v01Mascota(4, "Sambo", new CE0201v01Animal("Sapo")));
			oListPet.add(new CE0202v01Mascota(5, "Apache", new CE0201v01Animal("Tarantula")));
		}
		return oListPet;
	}
	
	public CE0202v01Mascota findById(int pId) {
		for (CE0202v01Mascota oPet: findAll()) {
			if (oPet.getId() == pId) {
				return oPet;
			}
		}
		return null;
		
	}
}
