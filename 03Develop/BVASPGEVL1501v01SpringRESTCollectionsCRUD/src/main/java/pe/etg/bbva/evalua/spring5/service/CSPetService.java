package pe.etg.bbva.evalua.spring5.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.etg.bbva.evalua.spring5.entity.CEAnimal;
import pe.etg.bbva.evalua.spring5.entity.CEMascota;

@Service
public class CSPetService {
	private List<CEMascota> oListPet = null;
	
	public List<CEMascota> findAll(){
		if (oListPet == null) {
			oListPet = new ArrayList<CEMascota>();
			oListPet.add(new CEMascota(1, "Lobo", new CEAnimal("Perro")));
			oListPet.add(new CEMascota(2, "Negro", new CEAnimal("Caballo")));
			oListPet.add(new CEMascota(3, "Rayo", new CEAnimal("Toro")));
			oListPet.add(new CEMascota(4, "Sambo", new CEAnimal("Sapo")));
			oListPet.add(new CEMascota(5, "Apache", new CEAnimal("Tarantula")));
		}
		return oListPet;
	}
	
	public CEMascota findById(int pId) {
		for (CEMascota oPet: findAll()) {
			if (oPet.getId() == pId) {
				return oPet;
			}
		}
		return null;
		
	}
}
